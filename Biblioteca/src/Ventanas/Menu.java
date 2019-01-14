
package Ventanas;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        
         Inicio ini= new Inicio();
    Usuarioo.setText(ini.usu);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        ALUMNOS = new javax.swing.JButton();
        INVENTARIO = new javax.swing.JButton();
        PRESTAMOS = new javax.swing.JButton();
        SESION = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Usuarioo = new javax.swing.JLabel();
        FONDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBackground(new java.awt.Color(153, 0, 102));
        jSeparator1.setForeground(new java.awt.Color(204, 0, 255));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 870, 10));

        ALUMNOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/1499044376_Student-3.png"))); // NOI18N
        ALUMNOS.setBorderPainted(false);
        ALUMNOS.setContentAreaFilled(false);
        ALUMNOS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ALUMNOS.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosPresed/158alumno.png"))); // NOI18N
        ALUMNOS.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosPresed/158alumno.png"))); // NOI18N
        ALUMNOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ALUMNOSActionPerformed(evt);
            }
        });
        getContentPane().add(ALUMNOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 190, 160));

        INVENTARIO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/1499044246_bookshelf.png"))); // NOI18N
        INVENTARIO.setBorderPainted(false);
        INVENTARIO.setContentAreaFilled(false);
        INVENTARIO.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        INVENTARIO.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosPresed/158inventario.png"))); // NOI18N
        INVENTARIO.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosPresed/158inventario.png"))); // NOI18N
        INVENTARIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INVENTARIOActionPerformed(evt);
            }
        });
        getContentPane().add(INVENTARIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 170, 160));

        PRESTAMOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/prestamo1.png"))); // NOI18N
        PRESTAMOS.setBorderPainted(false);
        PRESTAMOS.setContentAreaFilled(false);
        PRESTAMOS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PRESTAMOS.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosPresed/158prestamo.png"))); // NOI18N
        PRESTAMOS.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosPresed/158prestamo.png"))); // NOI18N
        PRESTAMOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRESTAMOSActionPerformed(evt);
            }
        });
        getContentPane().add(PRESTAMOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 180, 160));

        SESION.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/CLOSE.png"))); // NOI18N
        SESION.setBorderPainted(false);
        SESION.setContentAreaFilled(false);
        SESION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SESIONActionPerformed(evt);
            }
        });
        getContentPane().add(SESION, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 0, 50, 40));

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Lao UI", 1, 18)); // NOI18N
        jLabel3.setText("Sistema de Gestion de Préstamo de Libros");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/biblioteca.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 360, 170));

        jLabel2.setFont(new java.awt.Font("Microsoft Tai Le", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Inventario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, -1, -1));

        jLabel4.setFont(new java.awt.Font("Microsoft Tai Le", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("Alumnos");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, -1, -1));

        jLabel5.setFont(new java.awt.Font("Microsoft Tai Le", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 153, 0));
        jLabel5.setText("Prestamo");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 450, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/128.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosPresed/158.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosPresed/158.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 287, -1, 150));

        jLabel7.setFont(new java.awt.Font("Microsoft Tai Le", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 51, 255));
        jLabel7.setText("Encargados");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 450, -1, -1));

        jLabel8.setFont(new java.awt.Font("David", 0, 14)); // NOI18N
        jLabel8.setText("Bienvenido");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, -1, -1));

        Usuarioo.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        Usuarioo.setText("nombre");
        getContentPane().add(Usuarioo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 14, 130, 22));

        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/gray.jpg"))); // NOI18N
        getContentPane().add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void INVENTARIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INVENTARIOActionPerformed
Inventario obj=new Inventario();
      obj.setVisible(true);
      dispose();     
    }//GEN-LAST:event_INVENTARIOActionPerformed

    private void ALUMNOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ALUMNOSActionPerformed
       Alumnos obj=new Alumnos();
      obj.setVisible(true);
      dispose(); 
    }//GEN-LAST:event_ALUMNOSActionPerformed

    private void PRESTAMOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRESTAMOSActionPerformed
Prestamos obj=new Prestamos();
      obj.setVisible(true);
      dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_PRESTAMOSActionPerformed

    private void SESIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SESIONActionPerformed
    Inicio obj=new Inicio();
         obj.setVisible(true);
         dispose();
    }//GEN-LAST:event_SESIONActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Administradores obj=new Administradores();
      obj.setVisible(true);
      dispose(); 
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ALUMNOS;
    private javax.swing.JLabel FONDO;
    private javax.swing.JButton INVENTARIO;
    private javax.swing.JButton PRESTAMOS;
    private javax.swing.JButton SESION;
    private javax.swing.JLabel Usuarioo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
