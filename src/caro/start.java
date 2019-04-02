
package caro;


public class start extends javax.swing.JFrame {

 
    public start() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        ng1 = new javax.swing.JTextField();
        joueur1 = new javax.swing.JLabel();
        ng2 = new javax.swing.JTextField();
        joueur2 = new javax.swing.JLabel();
        batdau = new javax.swing.JButton();
        thoat3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 51));
        setLocation(new java.awt.Point(750, 100));
        setSize(new java.awt.Dimension(480, 596));

        jLabel1.setBackground(new java.awt.Color(255, 255, 0));
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));

        ng1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ng1KeyReleased(evt);
            }
        });

        joueur1.setBackground(new java.awt.Color(255, 255, 0));
        joueur1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        joueur1.setForeground(new java.awt.Color(255, 51, 51));
        joueur1.setText("Player 1:");
        joueur1.setAutoscrolls(true);

        ng2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ng2KeyReleased(evt);
            }
        });

        joueur2.setBackground(new java.awt.Color(255, 255, 0));
        joueur2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        joueur2.setForeground(new java.awt.Color(255, 51, 51));
        joueur2.setText("Player 2:");
        joueur2.setAutoscrolls(true);

        batdau.setBackground(new java.awt.Color(51, 255, 0));
        batdau.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        batdau.setForeground(new java.awt.Color(0, 0, 204));
        batdau.setText("Play");
        batdau.setEnabled(false);
        batdau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batdauActionPerformed(evt);
            }
        });

        thoat3.setBackground(new java.awt.Color(51, 255, 0));
        thoat3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        thoat3.setForeground(new java.awt.Color(0, 0, 204));
        thoat3.setText("Exit");
        thoat3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thoat3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(joueur1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(63, 63, 63)
                        .addComponent(ng1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(joueur2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ng2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(thoat3, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(batdau, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(joueur1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ng1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ng2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(joueur2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(batdau, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(thoat3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(258, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void batdauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batdauActionPerformed
        this.dispose();
        new play(ng1.getText(),ng2.getText()).setVisible(true);
    }//GEN-LAST:event_batdauActionPerformed

    private void thoat3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thoat3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_thoat3ActionPerformed

    private void ng1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ng1KeyReleased
        if(ng1.getText().equals("")||ng2.getText().equals(""))
            batdau.setEnabled(false);
        else batdau.setEnabled(true);
    }//GEN-LAST:event_ng1KeyReleased

    private void ng2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ng2KeyReleased
        if(ng1.getText().equals("")||ng2.getText().equals(""))
            batdau.setEnabled(false);
        else batdau.setEnabled(true);
    }//GEN-LAST:event_ng2KeyReleased

     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton batdau;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel joueur1;
    private javax.swing.JLabel joueur2;
    private javax.swing.JTextField ng1;
    private javax.swing.JTextField ng2;
    private javax.swing.JButton thoat3;
    // End of variables declaration//GEN-END:variables
}
