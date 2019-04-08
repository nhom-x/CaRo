
package caro;


public class end extends javax.swing.JFrame {

    private final String a,b;
    public end(String t,String t1,String t2) {
        initComponents();
        this.a=t1;this.b=t2;
        ketqua.setText(t+" Won ");
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        thoat = new javax.swing.JButton();
        choilai = new javax.swing.JButton();
        ketqua = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 51));
        setForeground(new java.awt.Color(255, 255, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        thoat.setBackground(new java.awt.Color(51, 255, 0));
        thoat.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        thoat.setForeground(new java.awt.Color(0, 0, 204));
        thoat.setText("Exit");
        thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thoatActionPerformed(evt);
            }
        });
        getContentPane().add(thoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 210, -1));

        choilai.setBackground(new java.awt.Color(51, 255, 0));
        choilai.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        choilai.setForeground(new java.awt.Color(0, 0, 204));
        choilai.setText("New Game");
        choilai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choilaiActionPerformed(evt);
            }
        });
        getContentPane().add(choilai, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 210, -1));

        ketqua.setBackground(new java.awt.Color(255, 204, 0));
        ketqua.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        ketqua.setForeground(new java.awt.Color(255, 0, 0));
        ketqua.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(ketqua, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 250, 44));

        jLabel1.setBackground(new java.awt.Color(255, 204, 0));
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("jLabel1");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thoatActionPerformed

        this.dispose();
    }//GEN-LAST:event_thoatActionPerformed

    private void choilaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choilaiActionPerformed
        this.dispose();
        new play(a,b).setVisible(true);
    }//GEN-LAST:event_choilaiActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton choilai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel ketqua;
    private javax.swing.JButton thoat;
    // End of variables declaration//GEN-END:variables
}
