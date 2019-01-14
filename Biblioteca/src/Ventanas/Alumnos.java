
package Ventanas;

import Codigos.CodigoAuto;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mar Cruz
 */
public class Alumnos extends javax.swing.JFrame {

   private JTable table;
DefaultTableModel model;
ListSelectionModel lscodigos;

    public Alumnos() {
        initComponents();
        
         this.setLocationRelativeTo(null);
        
         
         alumnos.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
        
        public void valueChanged(ListSelectionEvent e){
        if(alumnos.getSelectedRow() !=-1)
                {
                    int fila= alumnos.getSelectedRow();
                    Matri.setText(alumnos.getValueAt(fila, 0).toString());
                    Name.setText(alumnos.getValueAt(fila, 1).toString());
                    lastname.setText(alumnos.getValueAt(fila, 2).toString());
                    domicilio.setText(alumnos.getValueAt(fila, 3).toString());
                    tel.setText(alumnos.getValueAt(fila, 4).toString());
                    email.setText(alumnos.getValueAt(fila, 5).toString());
                    Status.setSelectedItem(alumnos.getValueAt(fila, 6).toString());
                   
                
                        
                }
        }
        });
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        Matri = new javax.swing.JTextField();
        Name = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        domicilio = new javax.swing.JTextField();
        tel = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        Insertar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Busquedalumnos = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        alumnos = new javax.swing.JTable();
        MENU = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Status = new javax.swing.JComboBox();
        jButton8 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        Consulta1 = new javax.swing.JButton();
        FONDO1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 563));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 870, 10));

        Matri.setText("13131713");
        Matri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MatriActionPerformed(evt);
            }
        });
        getContentPane().add(Matri, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 170, 24));
        getContentPane().add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 170, 24));

        lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameActionPerformed(evt);
            }
        });
        getContentPane().add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 170, 24));

        domicilio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                domicilioActionPerformed(evt);
            }
        });
        getContentPane().add(domicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 140, 24));
        getContentPane().add(tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 140, 24));
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 140, 24));

        Insertar.setText("Insertar");
        Insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertarActionPerformed(evt);
            }
        });
        getContentPane().add(Insertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 80, 80, -1));

        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });
        getContentPane().add(Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 120, 80, -1));

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        getContentPane().add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 160, 80, -1));

        Busquedalumnos.setText("13131713");
        Busquedalumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusquedalumnosActionPerformed(evt);
            }
        });
        Busquedalumnos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BusquedalumnosKeyPressed(evt);
            }
        });
        getContentPane().add(Busquedalumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 270, 30));

        jLabel2.setFont(new java.awt.Font("Lao UI", 1, 18)); // NOI18N
        jLabel2.setText("Sistema de Gestion de Préstamo de Libros");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        alumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(alumnos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 870, 240));

        MENU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/menu_1.png"))); // NOI18N
        MENU.setBorderPainted(false);
        MENU.setContentAreaFilled(false);
        MENU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENUActionPerformed(evt);
            }
        });
        getContentPane().add(MENU, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, 60, -1));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/CLOSE.png"))); // NOI18N
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, 50, 40));

        jLabel1.setFont(new java.awt.Font("Gautami", 1, 12)); // NOI18N
        jLabel1.setText("Matricula");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Gautami", 1, 12)); // NOI18N
        jLabel3.setText("Nombre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Gautami", 1, 12)); // NOI18N
        jLabel4.setText("Apellidos");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Gautami", 1, 12)); // NOI18N
        jLabel5.setText("Direccion");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, -1, -1));

        jLabel6.setFont(new java.awt.Font("Gautami", 1, 12)); // NOI18N
        jLabel6.setText("Telefono");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, -1, 20));

        jLabel7.setFont(new java.awt.Font("Gautami", 1, 12)); // NOI18N
        jLabel7.setText("E-Mail");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, -1, 20));

        jLabel8.setFont(new java.awt.Font("Gautami", 1, 12)); // NOI18N
        jLabel8.setText("Status");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, -1, -1));

        Status.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nuevo", "Activo", "Rojo" }));
        Status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatusActionPerformed(evt);
            }
        });
        getContentPane().add(Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, 110, 20));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/help.png"))); // NOI18N
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 120, 40, 30));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/help.png"))); // NOI18N
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 520, 40, 30));

        Consulta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/search.png"))); // NOI18N
        Consulta1.setBorderPainted(false);
        Consulta1.setContentAreaFilled(false);
        Consulta1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Consulta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consulta1ActionPerformed(evt);
            }
        });
        getContentPane().add(Consulta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, 40, 30));

        FONDO1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reportes.jpg"))); // NOI18N
        getContentPane().add(FONDO1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 0, 950, 570));

        jTextField1.setText("jTextField1");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MatriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MatriActionPerformed
        
    }//GEN-LAST:event_MatriActionPerformed

    private void MENUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENUActionPerformed
        Menu obj=new Menu();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_MENUActionPerformed

    private void domicilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_domicilioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_domicilioActionPerformed

    private void BusquedalumnosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BusquedalumnosKeyPressed
       String [] Titulos={"::..Matricula..::","::.Nombre..::","::..Apellidos..::","::..Direccion..::","::..Telefono°..::","::..E-Mail..::","::..Status..::"};
       String [] Regial= new String[10];
       
       String sql="Select * From alumnos where Matricula like'%"+Busquedalumnos.getText() + "%'";
       
       model= new DefaultTableModel(null, Titulos);
      ConexionBD cc=new ConexionBD();
      Connection cn=cc.conexion();
      
      try{
          Statement st = (Statement) cn.createStatement();
          ResultSet rs = st.executeQuery(sql);
       while (rs.next()) {
                    Regial[0] = rs.getString("Matricula");
                    Regial[1] = rs.getString("Nombre");
                    Regial[2] = rs.getString("Apellidos");
                    Regial[3] = rs.getString("Direccion");
                    Regial[4] = rs.getString("Telefono");
                    Regial[5] = rs.getString("Mail");
                    Regial[6] = rs.getString("Status");
                    model.addRow(Regial);
                }
       alumnos.setModel(model);
   
      }
      
    	catch(SQLException e){  JOptionPane.showMessageDialog(null,"Problemas con el Query");}
    	catch(Exception e){ JOptionPane.showMessageDialog(null,"Problemas con java input-Output de datos");  }
    }//GEN-LAST:event_BusquedalumnosKeyPressed

    private void InsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarActionPerformed
   if(new ConexionBD().alumnos(Matri.getText(), Name.getText(), lastname.getText(), domicilio.getText(), tel.getText(),email.getText(), Status.getSelectedItem().toString()))
                {
                    JOptionPane.showMessageDialog(null, "Insertado");
                   nuevo();
                   
                }else
        {JOptionPane.showMessageDialog(null, "Intenta de nuevo");}
        
   
    
    }//GEN-LAST:event_InsertarActionPerformed

    private void BusquedalumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusquedalumnosActionPerformed
    
        
    }//GEN-LAST:event_BusquedalumnosActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
       String Mat,Nam,Last,Dom,Tel,Em,St;
    Mat=Matri.getText();
    Nam=Name.getText();
    Last=lastname.getText();
    Dom=domicilio.getText();
    Tel=tel.getText();
    Em=email.getText();
    St=Status.getSelectedItem().toString();
    
    
        
        String cadena="DELETE FROM alumnos WHERE Matricula="+"\""+Mat+"\""+";";
    
    	try{PreparedStatement stmt=null;
    	Class.forName("com.mysql.jdbc.Driver");
    	Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/biblioteca?user=root&password=12345678");
    		stmt =conexion.prepareStatement(cadena);
    		int retorno=stmt.executeUpdate();
    		if(retorno==1){
    			JOptionPane.showMessageDialog(null,"Registro Eliminado");
                        nuevo();
    		}
    		if(retorno==0){
    			JOptionPane.showMessageDialog(null,"Vuelve a Intentar");
                        
    		}
    		//aqui va el codigo de la conexion
    	}catch(ClassNotFoundException e){ JOptionPane.showMessageDialog(null,"Problema con el driver"); }
    	catch(SQLException e){  JOptionPane.showMessageDialog(null,"Problemas con el Query");}
    	catch(Exception e){ JOptionPane.showMessageDialog(null,"Problemas con java input-Output de datos");  }
    }//GEN-LAST:event_EliminarActionPerformed

    private void lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
      String M,N,A,D,T,EM,S;
        
    M=Matri.getText();
    N=Name.getText();
    A=lastname.getText();
    D=domicilio.getText();
    T=tel.getText();
    EM=email.getText();
    S=Status.getSelectedItem().toString();
    
    
      String cadena="update alumnos set Nombre="+"\""+N+"\""+",";
    	cadena=cadena+"Apellidos="+"\""+A+"\""+",";
        cadena=cadena+"Direccion="+"\""+D+"\""+",";
        cadena=cadena+"Telefono="+"\""+T+"\""+",";
        cadena=cadena+"Mail="+"\""+EM+"\""+",";
        cadena=cadena+"Status="+"\""+S+"\""+" ";
    	cadena=cadena+"where Matricula="+"\""+M+"\""+";";
     
    try{PreparedStatement stmt=null;
    	Class.forName("com.mysql.jdbc.Driver");
    	Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/biblioteca?user=root&password=12345678");
    		stmt =conexion.prepareStatement(cadena);
    		int retorno=stmt.executeUpdate();
    		if(retorno==1){
    			JOptionPane.showMessageDialog(null," Registro Modificado");
    		}
    		if(retorno==0){
    			JOptionPane.showMessageDialog(null,"No modificad");
    		}
    		//aqui va el codigo de la conexion
    	}catch(ClassNotFoundException e){ JOptionPane.showMessageDialog(null,"problema con el driver"); }
    	catch(SQLException e){  JOptionPane.showMessageDialog(null,"problemas con el Query");}
    	catch(Exception e){ JOptionPane.showMessageDialog(null,"problemas con java input-Output de datos");  }	
    }//GEN-LAST:event_ModificarActionPerformed

    private void StatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StatusActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        AyudaAlu obj= new AyudaAlu();
        obj.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
         Status obj= new Status();
      obj.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       Inicio obj=new Inicio();
         obj.setVisible(true);
         dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void Consulta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Consulta1ActionPerformed
        Libros obj= new Libros();
        obj.setVisible(true);

    }//GEN-LAST:event_Consulta1ActionPerformed

    public void nuevo (){
  Matri.setText("");
     Name.setText("");
    lastname.setText("");
     domicilio.setText("");
     tel.setText("");
     email.setText("");
     Status.getSelectedItem();
     
 
 }
    
    
    
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
            java.util.logging.Logger.getLogger(Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alumnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Busquedalumnos;
    private javax.swing.JButton Consulta1;
    private javax.swing.JButton Eliminar;
    private javax.swing.JLabel FONDO1;
    private javax.swing.JButton Insertar;
    private javax.swing.JButton MENU;
    private javax.swing.JTextField Matri;
    private javax.swing.JButton Modificar;
    private javax.swing.JTextField Name;
    private javax.swing.JComboBox Status;
    private javax.swing.JTable alumnos;
    private javax.swing.JTextField domicilio;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField lastname;
    private javax.swing.JTextField tel;
    // End of variables declaration//GEN-END:variables
}
