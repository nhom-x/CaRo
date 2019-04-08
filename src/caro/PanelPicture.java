package caro;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

public class PanelPicture
        extends JPanel {

    private Image image;
    private BufferedImage bufferedImage;
    private short xanhDo = 1;
    private boolean robot = true;

    public void restartImage() {
        this.xanhDo = 1;
        this.bufferedImage = ImageHelper.restartImage(getWidth(), getHeight());
        this.image = ImageHelper.BufferedImagetoImage(this.bufferedImage);
    }

    public int draw(int x, int y) {
        if (ImageHelper.isDraw(this.bufferedImage, x, y)) {
            return 0;
        }
        if (this.xanhDo == 1) {
            this.xanhDo = 2;
            veDauNhan(x, y);
            if (isWin(x, y)) {
                this.bufferedImage = ImageHelper.drawWin(this.bufferedImage);
                this.xanhDo = 0;
                return 1;
            }
            if (this.robot == true) {
                this.bufferedImage = ImageHelper.drawRobot(this.bufferedImage, x, y);
                this.xanhDo = 1;
                if (isWin(ImageHelper.x_dau, ImageHelper.y_dau)) {
                    this.bufferedImage = ImageHelper.drawWin(this.bufferedImage);
                    this.xanhDo = 0;
                    return 2;
                }
            }
        } else if (this.xanhDo == 2) {
            this.xanhDo = 1;
            veHinhTron(x, y);
            if (isWin(x, y)) {
                this.bufferedImage = ImageHelper.drawWin(this.bufferedImage);
                this.xanhDo = 0;
                return 2;
            }
        }
        return 0;
    }

    private void veDauNhan(int x, int y) {
        this.bufferedImage = ImageHelper.veDauNhan(this.bufferedImage, x, y);
        this.image = ImageHelper.BufferedImagetoImage(this.bufferedImage);
    }

    private void veHinhTron(int x, int y) {
        this.bufferedImage = ImageHelper.veHinhTron(this.bufferedImage, x, y);
        this.image = ImageHelper.BufferedImagetoImage(this.bufferedImage);
    }

    private boolean isWin(int x, int y) {
        return ImageHelper.isWin(this.bufferedImage, x, y);
    }

    public short getXanhDo() {
        return this.xanhDo;
    }

    public void setRobot(boolean robot) {
        this.robot = robot;
    }

    public void paint(Graphics g) {
        super.paint(g);
        if (this.image != null) {
            g.drawImage(this.image, 0, 0, this);
        }
    }
}
