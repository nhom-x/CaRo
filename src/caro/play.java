
package caro;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.util.Vector;
import javax.swing.ImageIcon;


public class play extends javax.swing.JFrame {
    

    public play(String a,String b) {
        initComponents();
        this.setTitle("Caro Playing ");
        this.n1=a;
        this.n2=b;
        labelXO.setIcon(red);
        nguoichoi.setText(n1);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        banco = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){
                this.setOpaque(false);
                Graphics2D g2 = (Graphics2D) g;
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                //Vẽ bàn cờ
                g.setColor(Color.orange);
                for(int r = 0;r<=Size;r++){
                    g.drawLine(XY, XY+r*Width, XY+Size*Width, XY+r*Width);
                }
                for(int c = 0;c<=Size;c++){
                    g.drawLine(XY+c*Width, XY, XY+c*Width, XY+Size*Width);
                }

                //Vẽ các vị trí đã đánh
                if(checked.size()==0) return;
                for(int p = 0;p<checked.size();p++){
                    if(user){
                        if(p%2!=0) {g2.setColor(Color.BLUE);labelXO.setIcon(red);nguoichoi.setText(n1);}
                        else{ g2.setColor(Color.RED);labelXO.setIcon(blue);nguoichoi.setText(n2);}
                    }else{
                        if(p%2==0){ g2.setColor(Color.RED);labelXO.setIcon(blue);nguoichoi.setText(n2);}
                        else{ g2.setColor(Color.BLUE);labelXO.setIcon(red);nguoichoi.setText(n1);}
                    }
                    g2.fillOval(XY+checked.get(p).x*Width+Width/6+1,XY+ checked.get(p).y*Width+Width/6+1, 2*Width/3, 2*Width/3);
                }
                //Đánh dấu ô mới đánh
                g.setColor(Color.black);
                g.drawRect(checked.get(checked.size()-1).x*Width+XY, checked.get(checked.size()-1).y*Width+XY, Width, Width);
                super.paintComponent(g);
            }
        };
        textpause = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelXO = new javax.swing.JLabel();
        nguoichoi = new javax.swing.JLabel();
        thoat = new javax.swing.JButton();
        choilai = new javax.swing.JButton();
        pause = new javax.swing.JButton();
        dilai = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(650, 100));

        banco.setBackground(new java.awt.Color(102, 255, 204));
        banco.setForeground(new java.awt.Color(255, 0, 0));
        banco.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                bancoMouseMoved(evt);
            }
        });
        banco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bancoMouseClicked(evt);
            }
        });

        textpause.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        textpause.setForeground(new java.awt.Color(0, 0, 204));
        textpause.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout bancoLayout = new javax.swing.GroupLayout(banco);
        banco.setLayout(bancoLayout);
        bancoLayout.setHorizontalGroup(
            bancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bancoLayout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(textpause, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(196, Short.MAX_VALUE))
        );
        bancoLayout.setVerticalGroup(
            bancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bancoLayout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(textpause, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));

        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("Player:");

        labelXO.setBackground(new java.awt.Color(255, 255, 204));

        nguoichoi.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        nguoichoi.setForeground(new java.awt.Color(255, 0, 0));

        thoat.setBackground(new java.awt.Color(0, 255, 51));
        thoat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        thoat.setForeground(new java.awt.Color(0, 0, 204));
        thoat.setText("Exit");
        thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thoatActionPerformed(evt);
            }
        });

        choilai.setBackground(new java.awt.Color(0, 255, 51));
        choilai.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        choilai.setForeground(new java.awt.Color(0, 0, 204));
        choilai.setText("New Game");
        choilai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choilaiActionPerformed(evt);
            }
        });

        pause.setBackground(new java.awt.Color(0, 255, 51));
        pause.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pause.setForeground(new java.awt.Color(0, 0, 204));
        pause.setText("Pause");
        pause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseActionPerformed(evt);
            }
        });

        dilai.setBackground(new java.awt.Color(0, 255, 51));
        dilai.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dilai.setForeground(new java.awt.Color(0, 0, 204));
        dilai.setText("Undo");
        dilai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dilaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(nguoichoi, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelXO, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(choilai, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(pause, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(thoat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dilai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 164, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(nguoichoi, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelXO, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(dilai)
                .addGap(33, 33, 33)
                .addComponent(thoat)
                .addGap(36, 36, 36)
                .addComponent(pause)
                .addGap(101, 101, 101)
                .addComponent(choilai)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(banco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(banco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bancoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bancoMouseClicked
        if (isPause != true) {
            return;
        }
        Point p = new Point();
        //Kiểm tra vị trí có thuộc bàn cờ không?
        if ((cot < Size && cot >= 0 && dong < Size && dong >= 0))  p = new Point(cot, dong);      
         else   return;
        
        if (!checked.contains(p)) {
            checked.add(p);
            diem = new Point(p);
            cot = -1;
            dong = -1;
            banco.repaint();
           
         if (kiemtra(user)) {
             String t=new String();
                if(user)t= n2;
                else t= n1;
               
                new end(t,n1,n2).setVisible(true);
            }
         if(checked.size()==15*15){
             
             new end("tat ca ",n1,n2).setVisible(true);
         }
            user = !user;
        }
    }//GEN-LAST:event_bancoMouseClicked

    private void bancoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bancoMouseMoved
         int CX = evt.getX();
        int CY = evt.getY();
        if (CY - Size < 0) {
            cot = (CX - XY) / Width;
            dong = -1 + (CY - XY) / Width;
            return;
        }
        if (CX - Size < 0) {
            cot = -1 + (CX - XY) / Width;
            dong = (CY - XY) / Width;
            return;
        }
        cot = (CX - XY) / Width;
        dong = (CY - XY) / Width;
        Point p = new Point(cot, dong);
        if (checked.contains(p)) {
            cot = -1;
            dong = -1;

        }
        banco.repaint();
        banco.validate();
    }//GEN-LAST:event_bancoMouseMoved

    private void thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thoatActionPerformed
        
        this.dispose();
    }//GEN-LAST:event_thoatActionPerformed

    private void dilaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dilaiActionPerformed

       if (checked.size() == 0) {
            return;
        }
        user = !user;
        checked.remove(checked.size() -1);
        if(!user){
             labelXO.setIcon(red);
             nguoichoi.setText(n1);
        }else{
           labelXO.setIcon(blue);
            nguoichoi.setText(n2); 
        }
        
        banco.repaint();
    }//GEN-LAST:event_dilaiActionPerformed

    private void pauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pauseActionPerformed
       isPause = !isPause;
      
       
     
  
       
       
    }//GEN-LAST:event_pauseActionPerformed

    private void choilaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choilaiActionPerformed
       this.dispose();
       new play(n1,n2).setVisible(true);
        
    }//GEN-LAST:event_choilaiActionPerformed
                      
public boolean kiemtra(boolean user) {
        int n = 6;
   
        int ok = 0;
    
        int soDauBiChan = 0;
        int u;// u=0 nếu là user 1; u=1 nếu là user 2
              
            if (user) {
                u = 1;
            } else {
                u = 0;
            }
        
        //Kiểm tra hàng ngang
        for (int i = 1; i < n; i++) {
            Point p = new Point(diem.x + i, diem.y);
            if (!(p.x < Size)) {
                break;
            }
            if (checked.contains(p) && checked.indexOf(p) % 2 == u) {
                ok++;
            }
            if ((checked.contains(p) && checked.indexOf(p) % 2 != u) || !checked.contains(p)) {
                if (checked.contains(p) && checked.indexOf(p) % 2 != u) {
                    soDauBiChan++;
                }
                //Gặp quân của đối thủ hoặc gặp ô trống
                break;
            }
        }
        for (int i = 1; i < n; i++) {
            Point p = new Point(diem.x - i, diem.y);
            if (!(p.x >= 0)) {
                break;
            }
            if (checked.contains(p) && checked.indexOf(p) % 2 == u) {
                ok++;
            }
            if ((checked.contains(p) && checked.indexOf(p) % 2 != u) || !checked.contains(p)) {
                if (checked.contains(p) && checked.indexOf(p) % 2 != u) {
                    soDauBiChan++;
                }
                //Gặp quân của đối thủ hoặc gặp ô trống
                break;
            }
        }
        if (ok>= 4 && soDauBiChan != 2) {
            return true;
        }
        //Kiểm tra hàng dọc
        ok = 0;
        soDauBiChan = 0;
        for (int i = 1; i < n; i++) {
            Point p = new Point(diem.x, diem.y + i);
            if (!(p.y < Size)) {
                break;
            }
            if (checked.contains(p) && checked.indexOf(p) % 2 == u) {
                ok++;
            }
            if ((checked.contains(p) && checked.indexOf(p) % 2 != u) || !checked.contains(p)) {
                if (checked.contains(p) && checked.indexOf(p) % 2 != u) {
                    soDauBiChan++;
                }
                //Gặp quân của đối thủ hoặc gặp ô trống
                break;
            }
        }
        for (int i = 1; i < n; i++) {
            Point p = new Point(diem.x, diem.y - i);
            if (!(p.y >= 0)) {
                break;
            }
            if (checked.contains(p) && checked.indexOf(p) % 2 == u) {
                ok++;
            }
            if ((checked.contains(p) && checked.indexOf(p) % 2 != u) || !checked.contains(p)) {
                if (checked.contains(p) && checked.indexOf(p) % 2 != u) {
                    soDauBiChan++;
                }
                //Gặp quân của đối thủ hoặc gặp ô trống
                break;
            }
        }
        if (ok >= 4 && soDauBiChan != 2) {
            return true;
        }
        //Kiểm tra đường chéo chính
        ok = 0;
        soDauBiChan = 0;
        for (int i = 1; i < n; i++) {
            Point p = new Point(diem.x + i, diem.y + i);
            if (!(p.x >= 0 && p.x < Size && p.y >= 0 && p.y < Size)) {//ô kiểm tra ra ngoài bàn cờ
                break;
            }
            if (checked.contains(p) && checked.indexOf(p) % 2 == u) {
                ok++;
            }
            if ((checked.contains(p) && checked.indexOf(p) % 2 != u) || !checked.contains(p)) {
                if (checked.contains(p) && checked.indexOf(p) % 2 != u) {
                    soDauBiChan++;
                }
                //Gặp quân của đối thủ hoặc gặp ô trống
                break;
            }
        }
        for (int i = 1; i < n; i++) {
            Point p = new Point(diem.x - i, diem.y - i);
            if (!(p.x >= 0 && p.x < Size && p.y >= 0 && p.y < Size)) {//ô kiểm tra ra ngoài bàn cờ
                break;
            }
            if (checked.contains(p) && checked.indexOf(p) % 2 == u) {
                ok++;
            }
            if ((checked.contains(p) && checked.indexOf(p) % 2 != u) || !checked.contains(p)) {
                if (checked.contains(p) && checked.indexOf(p) % 2 != u) {
                    soDauBiChan++;
                }
                //Gặp quân của đối thủ hoặc gặp ô trống
                break;
            }
        }
        if (ok >= 4 && soDauBiChan != 2) {
            return true;
        }
        //Kiểm tra đường chéo phụ
        ok = 0;
        soDauBiChan = 0;
        for (int i = 1; i < n; i++) {
            Point p = new Point(diem.x + i, diem.y - i);
            if (!(p.x >= 0 && p.x < Size && p.y >= 0 && p.y < Size)) {//ô kiểm tra ra ngoài bàn cờ
                break;
            }
            if (checked.contains(p) && checked.indexOf(p) % 2 == u) {
                ok++;
            }
            if ((checked.contains(p) && checked.indexOf(p) % 2 != u) || !checked.contains(p)) {
                if (checked.contains(p) && checked.indexOf(p) % 2 != u) {
                    soDauBiChan++;
                }
                //Gặp quân của đối thủ hoặc gặp ô trống
                break;
            }
        }
        for (int i = 1; i < n; i++) {
            Point p = new Point(diem.x - i, diem.y + i);
            if (!(p.x >= 0 && p.x < Size && p.y >= 0 && p.y < Size)) {//ô kiểm tra ra ngoài bàn cờ
                break;
            }
            if (checked.contains(p) && checked.indexOf(p) % 2 == u) {
                ok++;
            }
            if ((checked.contains(p) && checked.indexOf(p) % 2 != u) || !checked.contains(p)) {
                if (checked.contains(p) && checked.indexOf(p) % 2 != u) {
                    soDauBiChan++;
                }
                //Gặp quân của đối thủ hoặc gặp ô trống
                break;
            }
        }
        if (ok >= 4 && soDauBiChan != 2)  return true;
        return false;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel banco;
    private javax.swing.JButton choilai;
    private javax.swing.JButton dilai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelXO;
    private javax.swing.JLabel nguoichoi;
    private javax.swing.JButton pause;
    private javax.swing.JLabel textpause;
    private javax.swing.JButton thoat;
    // End of variables declaration//GEN-END:variables
    
    private final  ImageIcon red =new ImageIcon(getClass().getResource("anh/playx.png")); 
    private final  ImageIcon blue=new ImageIcon(getClass().getResource("anh/playo.png")); 
    private final String n1,n2;
    private final int XY = 20;
    private final int Width = 32;
    private final int Size = 15;
    private int dong = -1;
    private int cot = -1;
    private Point diem = new Point(); 
    private boolean user = false;
    private Vector<Point> checked = new Vector<Point>();
    boolean isPause = true;
  

}