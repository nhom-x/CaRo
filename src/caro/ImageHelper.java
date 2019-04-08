package caro;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

public class ImageHelper {

    private static int mau = 16777152;
    private static int x_new = -1;
    private static int y_new = -1;
    public static int x_dau;
    public static int y_dau;
    private static int flat;
    private static int[][] maTran;

    public static BufferedImage restartImage(int width, int height) {
        BufferedImage bufferedImage = new BufferedImage(width, height, 1);
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if ((i % 30 == 0) || (j % 30 == 0)) {
                    bufferedImage.setRGB(i, j, 65280);
                } else {
                    bufferedImage.setRGB(i, j, 16777215);
                }
            }
        }
        return bufferedImage;
    }

    public static BufferedImage veDauNhan(BufferedImage bufferedImage, int x, int y) {
        if (isDraw(bufferedImage, x, y)) {
            return bufferedImage;
        }
        x = x / 30 * 30;
        y = y / 30 * 30;
        bufferedImage.setRGB(x, y, 65281);
        for (int i = x + 5; i <= x + 25; i++) {
            bufferedImage.setRGB(i, i + y - x, 255);
            bufferedImage.setRGB(i, x + y - i + 30, 255);
        }
        return danhDau(bufferedImage, x, y);
    }

    public static BufferedImage veHinhTron(BufferedImage bufferedImage, int x, int y) {
        if (isDraw(bufferedImage, x, y)) {
            return bufferedImage;
        }
        x = x / 30 * 30;
        y = y / 30 * 30;
        bufferedImage.setRGB(x, y, 130816);
        for (int i = x; i <= x + 30; i++) {
            for (int j = y; j <= y + 30; j++) {
                if (((i - x - 15) * (i - x - 15) + (j - y - 15) * (j - y - 15) <= 106) && ((i - x - 15) * (i - x - 15) + (j - y - 15) * (j - y - 15) >= 94)) {
                    bufferedImage.setRGB(i, j, 16711680);
                }
            }
        }
        return danhDau(bufferedImage, x, y);
    }

    private static BufferedImage danhDau(BufferedImage bufferedImage, int x, int y) {
        x = x / 30 * 30;
        y = y / 30 * 30;
        if (((x_new >= 0 ? 1 : 0) & (y_new >= 0 ? 1 : 0)) != 0) {
            for (int i = x_new + 1; i < x_new + 30; i++) {
                for (int j = y_new; j < y_new + 30; j++) {
                    if ((((i < bufferedImage.getWidth() ? 1 : 0) & (j < bufferedImage.getHeight() ? 1 : 0)) != 0)
                            && ((bufferedImage.getRGB(i, j) & 0xFFFFFF) == mau)) {
                        bufferedImage.setRGB(i, j, 16777215);
                    }
                }
            }
        }
        for (int i = x + 1; i < x + 30; i++) {
            for (int j = y; j < y + 30; j++) {
                if ((((i < bufferedImage.getWidth() ? 1 : 0) & (j < bufferedImage.getHeight() ? 1 : 0)) != 0)
                        && ((bufferedImage.getRGB(i, j) & 0xFFFFFF) == 16777215)) {
                    bufferedImage.setRGB(i, j, mau);
                }
            }
        }
        x_new = x;
        y_new = y;
        return bufferedImage;
    }

    public static boolean isDraw(BufferedImage bufferedImage, int x, int y) {
        x = x / 30 * 30;
        y = y / 30 * 30;
        if ((bufferedImage.getRGB(x, y) & 0xFFFFFF) != 65280) {
            return true;
        }
        return false;
    }

    public static boolean isWin(BufferedImage bufferedImage, int x, int y) {
        x = x / 30 * 30;
        y = y / 30 * 30;
        int ft = bufferedImage.getRGB(x, y) & 0xFFFFFF;

        int dem = 1;
        int duyet = x / 30;
        if (duyet > 4) {
            duyet = 4;
        }
        x_dau = x;
        y_dau = y;
        flat = 1;
        if (duyet > 0) {
            for (int i = x / 30 - 1; i >= x / 30 - duyet; i--) {
                int k = i * 30;
                if ((bufferedImage.getRGB(k, y) & 0xFFFFFF) != ft) {
                    break;
                }
                dem += 1;
                x_dau = k;
                y_dau = y;
            }
        }
        duyet = bufferedImage.getWidth() / 30 - x / 30 - 1;
        if (duyet > 4) {
            duyet = 4;
        }
        if (duyet > 0) {
            for (int i = x / 30 + 1; i <= x / 30 + duyet; i++) {
                int k = i * 30;
                if ((bufferedImage.getRGB(k, y) & 0xFFFFFF) != ft) {
                    break;
                }
                dem += 1;
            }
        }
        if (dem >= 5) {
            return true;
        }
        dem = 1;
        duyet = y / 30;
        if (duyet > 4) {
            duyet = 4;
        }
        x_dau = x;
        y_dau = y;
        flat = 2;
        if (duyet > 0) {
            for (int i = y / 30 - 1; i >= y / 30 - duyet; i--) {
                int k = i * 30;
                if ((bufferedImage.getRGB(x, k) & 0xFFFFFF) != ft) {
                    break;
                }
                x_dau = x;
                y_dau = k;
                dem += 1;
            }
        }
        duyet = bufferedImage.getHeight() / 30 - y / 30 - 1;
        if (duyet > 4) {
            duyet = 4;
        }
        if (duyet > 0) {
            for (int i = y / 30 + 1; i <= y / 30 + duyet; i++) {
                int k = i * 30;
                if ((bufferedImage.getRGB(x, k) & 0xFFFFFF) != ft) {
                    break;
                }
                dem += 1;
            }
        }
        if (dem >= 5) {
            return true;
        }
        dem = 1;
        if (x < y) {
            duyet = x / 30;
        } else {
            duyet = y / 30;
        }
        if (duyet > 4) {
            duyet = 4;
        }
        x_dau = x;
        y_dau = y;
        flat = 3;
        if (duyet > 0) {
            for (int i = x / 30 - 1; i >= x / 30 - duyet; i--) {
                int k = i * 30;
                if ((bufferedImage.getRGB(k, y + k - x) & 0xFFFFFF) != ft) {
                    break;
                }
                x_dau = k;
                y_dau = y + k - x;
                dem += 1;
            }
        }
        if (bufferedImage.getWidth() - x < bufferedImage.getHeight() - y) {
            duyet = bufferedImage.getWidth() / 30 - x / 30 - 1;
        } else {
            duyet = bufferedImage.getHeight() / 30 - y / 30 - 1;
        }
        if (duyet > 4) {
            duyet = 4;
        }
        if (duyet > 0) {
            for (int i = x / 30 + 1; i <= x / 30 + duyet; i++) {
                int k = i * 30;
                if ((bufferedImage.getRGB(k, y + k - x) & 0xFFFFFF) != ft) {
                    break;
                }
                dem += 1;
            }
        }
        if (dem >= 5) {
            return true;
        }
        dem = 1;
        if (x < bufferedImage.getHeight() - y) {
            duyet = x / 30;
        } else {
            duyet = bufferedImage.getHeight() - y / 30 - 1;
        }
        if (duyet > 4) {
            duyet = 4;
        }
        x_dau = x;
        y_dau = y;
        flat = 4;
        if (duyet > 0) {
            for (int i = x / 30 - 1; i >= x / 30 - duyet; i--) {
                int k = i * 30;
                if ((bufferedImage.getRGB(k, y + x - k) & 0xFFFFFF) != ft) {
                    break;
                }
                x_dau = k;
                y_dau = y + x - k;
                dem += 1;
            }
        }
        if (bufferedImage.getWidth() - x < y) {
            duyet = bufferedImage.getWidth() / 30 - x / 30 - 1;
        } else {
            duyet = y / 30;
        }
        if (duyet > 4) {
            duyet = 4;
        }
        if (duyet > 0) {
            for (int i = x / 30 + 1; i <= x / 30 + duyet; i++) {
                int k = i * 30;
                if ((bufferedImage.getRGB(k, y + x - k) & 0xFFFFFF) != ft) {
                    break;
                }
                dem += 1;
            }
        }
        if (dem >= 5) {
            return true;
        }
        return false;
    }

    public static BufferedImage drawWin(BufferedImage bufferedImage) {
        if (flat == 1) {
            for (int k = 0; k < 5; k++) {
                for (int i = 0; i < 30; i++) {
                    for (int j = 0; j < 30; j++) {
                        if ((((x_dau + k * 30 + i < bufferedImage.getWidth() ? 1 : 0) & (y_dau + j < bufferedImage.getHeight() ? 1 : 0)) != 0)
                                && ((bufferedImage.getRGB(x_dau + k * 30 + i, y_dau + j) & 0xFFFFFF) == 16777215)) {
                            bufferedImage.setRGB(x_dau + k * 30 + i, y_dau + j, mau);
                        }
                    }
                }
            }
        } else if (flat == 2) {
            for (int k = 0; k < 5; k++) {
                for (int i = 0; i < 30; i++) {
                    for (int j = 0; j < 30; j++) {
                        if ((((x_dau + i < bufferedImage.getWidth() ? 1 : 0) & (y_dau + k * 30 + j < bufferedImage.getHeight() ? 1 : 0)) != 0)
                                && ((bufferedImage.getRGB(x_dau + i, y_dau + k * 30 + j) & 0xFFFFFF) == 16777215)) {
                            bufferedImage.setRGB(x_dau + i, y_dau + k * 30 + j, mau);
                        }
                    }
                }
            }
        } else if (flat == 3) {
            for (int k = 0; k < 5; k++) {
                for (int i = 0; i < 30; i++) {
                    for (int j = 0; j < 30; j++) {
                        if ((((x_dau + k * 30 + i < bufferedImage.getWidth() ? 1 : 0) & (y_dau + k * 30 + j < bufferedImage.getHeight() ? 1 : 0)) != 0)
                                && ((bufferedImage.getRGB(x_dau + k * 30 + i, y_dau + k * 30 + j) & 0xFFFFFF) == 16777215)) {
                            bufferedImage.setRGB(x_dau + k * 30 + i, y_dau + k * 30 + j, mau);
                        }
                    }
                }
            }
        } else if (flat == 4) {
            for (int k = 0; k < 5; k++) {
                for (int i = 0; i < 30; i++) {
                    for (int j = 0; j < 30; j++) {
                        if ((((x_dau + k * 30 + i < bufferedImage.getWidth() ? 1 : 0) & (y_dau - k * 30 + j < bufferedImage.getHeight() ? 1 : 0)) != 0)
                                && ((bufferedImage.getRGB(x_dau + k * 30 + i, y_dau - k * 30 + j) & 0xFFFFFF) == 16777215)) {
                            bufferedImage.setRGB(x_dau + k * 30 + i, y_dau - k * 30 + j, mau);
                        }
                    }
                }
            }
        }
        return bufferedImage;
    }

    public static Image BufferedImagetoImage(BufferedImage bufferedImage) {
        return Toolkit.getDefaultToolkit().createImage(bufferedImage.getSource());
    }

    public static int diemDanhGia(int[] array, int index) {
        int kq = 0;
        int count;
        if (index == 0) {
            count = 1;
            int khoangTrang = 0;
            for (int i = 1; i < array.length; i++) {
                if (array[i] == array[index]) {
                    count += 1;
                } else {
                    if (array[i] != 0) {
                        break;
                    }
                    khoangTrang += 1;
                    break;
                }
            }
            kq += diem(count, khoangTrang, 1);
        } else if (index == array.length - 1) {
            count = 1;
            int khoangTrang = 0;
            for (int i = array.length - 2; i >= 0; i--) {
                if (array[i] == array[index]) {
                    count += 1;
                } else {
                    if (array[i] != 0) {
                        break;
                    }
                    khoangTrang += 1;
                    break;
                }
            }
            kq += diem(count, khoangTrang, 1);
        } else {
            count = 1;
            int khoangTrang = 0;
            for (int i = index + 1; i < array.length; i++) {
                if (array[i] == array[index]) {
                    count += 1;
                } else {
                    if (array[i] != 0) {
                        break;
                    }
                    khoangTrang += 1;
                    break;
                }
            }
            for (int i = index - 1; i >= 0; i--) {
                if (array[i] == array[index]) {
                    count += 1;
                } else {
                    if (array[i] != 0) {
                        break;
                    }
                    khoangTrang += 1;
                    break;
                }
            }
            kq += diem(count, khoangTrang, 1);
        }
        if (index == 0) {
            count = 1;
            for (int i = 1; i < array.length; i++) {
                if ((array[i] != array[index]) && (array[i] != 0)) {
                    break;
                }
                count += 1;
            }
            kq += diem(count, 0, 0);
        } else if (index == array.length - 1) {
            count = 1;
            for (int i = array.length - 2; i >= 0; i--) {
                if ((array[i] != array[index]) && (array[i] != 0)) {
                    break;
                }
                count += 1;
            }
            kq += diem(count, 0, 0);
        } else {
            count = 1;
            for (int i = index + 1; i < array.length; i++) {
                if ((array[i] != array[index]) && (array[i] != 0)) {
                    break;
                }
                count += 1;
            }
            for (int i = index - 1; i >= 0; i--) {
                if ((array[i] != array[index]) && (array[i] != 0)) {
                    break;
                }
                count += 1;
            }
            kq += diem(count, 0, 0);
        }
        return kq;
    }

    private static int diem(int count, int khoangTrang, int flat) {
        if (flat == 1) {
            if (count <= 4) {
                return count * count * count * count * count * khoangTrang * khoangTrang;
            }
            return 100000 * (count - 4) * (count - 4) * (count - 4);
        }
        return 3 * count + 1;
    }

    private static int[] quyChuanArray(int x, int y, int flat) {
        int R = 7;
        int[] kq;
        if (flat == 1) {
            int xdau = x - R;
            int xcuoi = x + R;
            if (xdau < 0) {
                xdau = 0;
            }
            if (xcuoi > maTran.length - 1) {
                xcuoi = maTran.length - 1;
            }
            kq = new int[xcuoi - xdau + 1];
            for (int i = xdau; i <= xcuoi; i++) {
                if (i == x) {
                    kq[(i - xdau)] = 3;
                } else {
                    kq[(i - xdau)] = maTran[i][y];
                }
            }
        } else if (flat == 2) {
            int ydau = y - R;
            int ycuoi = y + R;
            if (ydau < 0) {
                ydau = 0;
            }
            if (ycuoi > maTran[0].length - 1) {
                ycuoi = maTran[0].length - 1;
            }
            kq = new int[ycuoi - ydau + 1];
            for (int i = ydau; i <= ycuoi; i++) {
                if (i == y) {
                    kq[(i - ydau)] = 3;
                } else {
                    kq[(i - ydau)] = maTran[x][i];
                }
            }
        } else if (flat == 3) {
            int xdau = x - R;
            int xcuoi = x + R;
            int ydau = y - R;
            int ycuoi = y + R;
            if (xdau < 0) {
                ydau -= xdau;
                xdau = 0;
            }
            if (ydau < 0) {
                xdau -= ydau;
                ydau = 0;
            }
            if (xcuoi > maTran.length - 1) {
                ycuoi -= xcuoi - maTran.length + 1;
                xcuoi = maTran.length - 1;
            }
            if (ycuoi > maTran[0].length - 1) {
                xcuoi -= ycuoi - maTran[0].length + 1;
                ycuoi = maTran[0].length - 1;
            }
            kq = new int[ycuoi - ydau + 1];
            for (int i = 0; i <= ycuoi - ydau; i++) {
                if (xdau + i == x) {
                    kq[i] = 3;
                } else {
                    kq[i] = maTran[(xdau + i)][(ydau + i)];
                }
            }
        } else {
            int xdau = x - R;
            int xcuoi = x + R;
            int ydau = y + R;
            int ycuoi = y - R;
            if (xdau < 0) {
                ydau += xdau;
                xdau = 0;
            }
            if (ycuoi < 0) {
                xcuoi += ycuoi;
                ycuoi = 0;
            }
            if (xcuoi > maTran.length - 1) {
                ycuoi += xcuoi - maTran.length + 1;
                xcuoi = maTran.length - 1;
            }
            if (ydau > maTran[0].length - 1) {
                xdau += ydau - maTran[0].length + 1;
                ydau = maTran[0].length - 1;
            }
            kq = new int[xcuoi - xdau + 1];
            for (int i = 0; i <= xcuoi - xdau; i++) {
                if (xdau + i == x) {
                    kq[i] = 3;
                } else {
                    kq[i] = maTran[(xdau + i)][(ydau - i)];
                }
            }
        }
        return kq;
    }

    public static BufferedImage drawRobot(BufferedImage bufferedImage, int x, int y) {
        quyChuanMaTran(bufferedImage);
        x = x / 30 * 30;
        y = y / 30 * 30;
        int max = 0;
        int X = 0;
        int Y = 0;
        int R = 10;
        int xDau = x / 30 - R;
        int yDau = y / 30 - R;
        int xCuoi = x / 30 + R;
        int yCuoi = y / 30 + R;
        if (xDau < 0) {
            xDau = 0;
        }
        if (yDau < 0) {
            yDau = 0;
        }
        if (xCuoi > maTran.length - 1) {
            xCuoi = maTran.length - 1;
        }
        if (yCuoi > maTran[0].length - 1) {
            yCuoi = maTran[0].length - 1;
        }
        for (int i = xDau; i <= xCuoi; i++) {
            for (int j = yDau; j <= yCuoi; j++) {
                if (maTran[i][j] == 0) {
                    int diem = tinhDiem(i, j);
                    if (diem > max) {
                        max = diem;
                        X = i;
                        Y = j;
                    } else if ((diem == max)
                            && ((i * 30 - x) * (i * 30 - x) + (j * 30 - y) * (j * 30 - y) < (X * 30 - x) * (X * 30 - x) + (Y * 30 - y) * (Y * 30 - y))) {
                        X = i;
                        Y = j;
                    }
                }
            }
        }
        x_dau = X * 30;
        y_dau = Y * 30;
        return veHinhTron(bufferedImage, x_dau, y_dau);
    }

    public static int tinhDiem(int i, int j) {
        int diem = 0;
        for (int k = 1; k <= 4; k++) {
            int[] quyChuan = quyChuanArray(i, j, k);
            int index = 0;
            for (int h = 0; h < quyChuan.length; h++) {
                if (quyChuan[h] == 3) {
                    index = h;
                    break;
                }
            }
            if (index >= 0) {
                quyChuan[index] = 1;
                diem += 11 * diemDanhGia(quyChuan, index);
                quyChuan[index] = 2;
                diem += 10 * diemDanhGia(quyChuan, index);
            }
        }
        return diem;
    }

    public static void quyChuanMaTran(BufferedImage bufferedImage) {
        maTran = new int[bufferedImage.getWidth() / 30][bufferedImage.getHeight() / 30];
        for (int i = 0; i < bufferedImage.getWidth() / 30; i++) {
            for (int j = 0; j < bufferedImage.getHeight() / 30; j++) {
                if ((bufferedImage.getRGB(i * 30, j * 30) & 0xFFFFFF) == 130816) {
                    maTran[i][j] = 1;
                } else if ((bufferedImage.getRGB(i * 30, j * 30) & 0xFFFFFF) == 65281) {
                    maTran[i][j] = 2;
                }
            }
        }
    }
}
