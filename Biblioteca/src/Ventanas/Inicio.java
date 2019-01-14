
package Ventanas;
import java.sql.*;
import com.sun.awt.AWTUtilities;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Inicio extends javax.swing.JFrame {
static Connection con=null;
public static int niv_usu_on=0;

    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        AWTUtilities.setWindowOpaque(this, false);
    }
    
    public static String usu="";

    void entraradmin(String usuario1, String pass){

 ConexionBD cc=new ConexionBD();
      Connection cn=cc.conexion();
 String sql="Select * From encargados where Usuario='"+usuario1+"'";
 try{
 Statement st= cn.createStatement();
 ResultSet rs= st.executeQuery(sql);
 int niv_usu=0;
 String pass_usu="", nom_usu="";
 if(rs.next())
{
	nom_usu=rs.getString("Usuario");
	pass_usu=rs.getString("pass");
	niv_usu=rs.getInt("IDRango");

}
System.out.println(""+nom_usu+" "+pass) ;
if(pass.equals(pass_usu)){

System.out.println("La Contra coincide");
Inicio.niv_usu_on=niv_usu;
	}
else{
	JOptionPane.showMessageDialog(null,"Los datos no son correctos");
	Usuario.setText("");
	Password.setText("");   
}
}
 catch(SQLException | HeadlessException e){
	
}


 }
    
    void entrar(){
        this.entraradmin(Usuario.getText(),Password.getText());
 if(Inicio.niv_usu_on==1)
 {
 Menu men=new Menu();
 men.setVisible(false);
 dispose();
 JOptionPane.showMessageDialog(null,"Bienvenido","Java",1);
 men.setVisible(true);
 }
 if(Inicio.niv_usu_on==2)
 {
 Menu2 men= new Menu2();  
 men.setVisible(false);
 dispose();
 JOptionPane.showMessageDialog(null,"Bienvenido","Java",0);
 men.setVisible(true);
 
 }
    
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Usuario = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        S = new javax.swing.JLabel();
        G = new javax.swing.JLabel();
        P = new javax.swing.JLabel();
        L = new javax.swing.JLabel();
        imgusuarios = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        SESION = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(515, 520));
        setMinimumSize(new java.awt.Dimension(515, 520));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(515, 524));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Usuario.setFont(new java.awt.Font("Palatino Linotype", 1, 12)); // NOI18N
        Usuario.setText("Usuario");
        Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 120, 30));

        Password.setText("1123");
        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });
        getContentPane().add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 120, 30));

        S.setFont(new java.awt.Font("Harrington", 1, 24)); // NOI18N
        S.setText("S");
        getContentPane().add(S, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        G.setFont(new java.awt.Font("Harrington", 1, 24)); // NOI18N
        G.setText("G");
        getContentPane().add(G, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        P.setFont(new java.awt.Font("Harrington", 1, 24)); // NOI18N
        P.setText("P");
        getContentPane().add(P, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        L.setFont(new java.awt.Font("Harrington", 1, 24)); // NOI18N
        L.setText("L");
        getContentPane().add(L, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        imgusuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pasajeros.png"))); // NOI18N
        getContentPane().add(imgusuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/INICIAR-SESION.png"))); // NOI18N
        login.setBorderPainted(false);
        login.setContentAreaFilled(false);
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 130, 30));

        SESION.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/CLOSE.png"))); // NOI18N
        SESION.setBorderPainted(false);
        SESION.setContentAreaFilled(false);
        SESION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SESIONActionPerformed(evt);
            }
        });
        getContentPane().add(SESION, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 40, 30));

        jLabel1.setFont(new java.awt.Font("Harrington", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sesion.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 470, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioActionPerformed
       String nulo="";
       if (Usuario.getText().equals(nulo)){
       JOptionPane.showMessageDialog(null,"El Usuario es requerido");
       }else{
       Usuario.requestFocusInWindow();}
    }//GEN-LAST:event_UsuarioActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed

     usu=Usuario.getText();
//valida();
    entrar();
         dispose();
    }//GEN-LAST:event_loginActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
   String nulo="";
   if(Password.getText().equals(nulo)){
   JOptionPane.showMessageDialog(null, "La Contraseña es requerida");
   }else{
   login.requestFocusInWindow();
   }
    }//GEN-LAST:event_PasswordActionPerformed

    private void SESIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SESIONActionPerformed
      System.exit(0);
        dispose();
    }//GEN-LAST:event_SESIONActionPerformed
public void valida(){
String cadena="";
int sw=0;
cadena="Select*from encargados where Usuario=";
cadena=cadena+"\"" + Usuario.getText()+"\""+" ";
cadena = cadena + "and pass="+ "\"" + Password.getText();
cadena =cadena +"\"" + ";";

try{ // intento 
		Class.forName("com.mysql.jdbc.Driver");    
		Connection conexion = (Connection) DriverManager.getConnection
		("jdbc:mysql://localhost/biblioteca?user=root&password=12345678");
		Statement instruccion = conexion.createStatement();
		ResultSet tabla = instruccion.executeQuery(cadena);
		while(tabla.next()){	 
			sw = 1;	
			}
		}	  //*************************************************************CACHAR TODOS LOS ERRORS AL INGRESAR AL SISTEMA 
		catch(ClassNotFoundException fe){
			JOptionPane.showMessageDialog(null, "E1 Error con el Driver (Conexion)"); 
		}
		catch(SQLException se){
			JOptionPane.showMessageDialog(null, "E2 Error con el Query (Sintaxis)"); 
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null, "E3 Error con Java Input-Output de Datos (Base de datos)"); 
		}
	
     	if(sw ==0){
     		JOptionPane.showMessageDialog(null, "  Usuario Incorrecto ");	
                JOptionPane.showMessageDialog(null, "  Saliendo... ");	
     	}
        else{
        	Menu obj=new Menu();
                 obj.setVisible(true);
        }	

}
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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel G;
    private javax.swing.JLabel L;
    private javax.swing.JLabel P;
    private javax.swing.JPasswordField Password;
    private javax.swing.JLabel S;
    private javax.swing.JButton SESION;
    private javax.swing.JTextField Usuario;
    private javax.swing.JLabel imgusuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton login;
    // End of variables declaration//GEN-END:variables
}
