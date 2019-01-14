
package Ventanas;

import Codigos.*;
import Ventanas.*;
import Codigos.*;
import Ventanas.*;
import Codigos.*;
import Ventanas.*;
import Ventanas.*;
import Codigos.*;
import Ventanas.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class Prestamos_1 extends javax.swing.JFrame {
    private JTable table;
DefaultTableModel model;
ListSelectionModel lscodigos;

    public Prestamos_1() {
       
        
        initComponents();
        
        
        this.txt_lib.setVisible(false);
        this.txt_titu.setVisible(false);
         this.exi.setVisible(false);
          this.auto.setVisible(false);
        this.jLabel7.setVisible(false);
        this.jLabel6.setVisible(false);
	this.jScrollPane1.setVisible(false);
	this.adbok.setVisible(false);
       this.jLabel9.setVisible(false);
        this.Consulta1.setVisible(false);
         this.sear.setVisible(false);
         this.jLabel16.setVisible(false);
         this.jLabel17.setVisible(false);
         this.num.setVisible(false);
                
                
         this.setLocationRelativeTo(null);
         Inicio ini= new Inicio();
         
         Encargado.setText(ini.usu);
         Inicio.setText(fechaActual());
         
         
         
         
          jTable1.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
        
        public void valueChanged(ListSelectionEvent e){
        if(jTable1.getSelectedRow() !=-1)
                {
                    int fila= jTable1.getSelectedRow();
                    txt_lib.setText(jTable1.getValueAt(fila, 0).toString());
                    txt_titu.setText(jTable1.getValueAt(fila, 1).toString());
                    auto.setText(jTable1.getValueAt(fila, 3).toString());
                    exi.setText(jTable1.getValueAt(fila, 7).toString());
                    
                
                        
                }
        }
        });
         
         
    }

   
    
    @SuppressWarnings("unchecked")

public static String fechaActual(){

Date fecha=new Date();
    SimpleDateFormat formatoFecha=new SimpleDateFormat("dd/MM/YYYY");
    return formatoFecha.format(fecha);
}
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_pedido = new javax.swing.JTextField();
        txt_matri = new javax.swing.JTextField();
        txt_lib = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        MENU = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Ingreso2t = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Consulta1 = new javax.swing.JButton();
        Fin = new com.toedter.calendar.JDateChooser();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        auto_st = new javax.swing.JLabel();
        Encargado = new javax.swing.JLabel();
        Inicio = new javax.swing.JTextField();
        adbok = new javax.swing.JButton();
        auto_nom = new javax.swing.JLabel();
        auto_tel = new javax.swing.JLabel();
        auto_email = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        sear = new javax.swing.JTextField();
        txt_titu = new javax.swing.JLabel();
        exi = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        auto = new javax.swing.JLabel();
        num = new javax.swing.JTextField();
        FONDO = new javax.swing.JLabel();
        ape = new javax.swing.JLabel();
        dire = new javax.swing.JLabel();
        ACTIVO = new javax.swing.JLabel();
        Sta = new javax.swing.JTextField();
        matri = new javax.swing.JTextField();
        FIN = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_pedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pedidoActionPerformed(evt);
            }
        });
        getContentPane().add(txt_pedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 90, -1));

        txt_matri.setText("13131713");
        txt_matri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_matriActionPerformed(evt);
            }
        });
        txt_matri.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_matriKeyPressed(evt);
            }
        });
        getContentPane().add(txt_matri, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 140, -1));

        txt_lib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_libActionPerformed(evt);
            }
        });
        txt_lib.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_libKeyPressed(evt);
            }
        });
        getContentPane().add(txt_lib, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 150, -1));

        jLabel2.setFont(new java.awt.Font("Lao UI", 1, 18)); // NOI18N
        jLabel2.setText("Sistema de Gestion de Préstamo de Libros");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 890, 10));

        MENU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/menu_1.png"))); // NOI18N
        MENU.setBorderPainted(false);
        MENU.setContentAreaFilled(false);
        MENU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENUActionPerformed(evt);
            }
        });
        getContentPane().add(MENU, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, 60, -1));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/help.png"))); // NOI18N
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 40, -1));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/CLOSE.png"))); // NOI18N
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, 50, 40));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel1.setText("ID Pedido");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 90, 20));

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel3.setText("Fecha de Prestamo");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 130, 20));

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel4.setText("Fecha Devolucion");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 130, 20));

        jLabel5.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel5.setText("Matricula");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 90, 20));

        jLabel6.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel6.setText("Numero de Libros (max 3)");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 170, 20));

        jLabel7.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Titulo");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 90, -1));

        jLabel8.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel8.setText("Encargado:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 80, 20));

        Ingreso2t.setText("Iniciar Presamo");
        Ingreso2t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ingreso2tActionPerformed(evt);
            }
        });
        getContentPane().add(Ingreso2t, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 130, 120, -1));

        jButton2.setText("Nuevo Prestamo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 80, 120, -1));

        jButton3.setText("Devolucion");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 180, 120, -1));

        Consulta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/search.png"))); // NOI18N
        Consulta1.setBorderPainted(false);
        Consulta1.setContentAreaFilled(false);
        Consulta1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Consulta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consulta1ActionPerformed(evt);
            }
        });
        getContentPane().add(Consulta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 310, 40, 30));

        Fin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FinMouseClicked(evt);
            }
        });
        Fin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FinKeyTyped(evt);
            }
        });
        getContentPane().add(Fin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 120, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 890, 10));

        jLabel12.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel12.setText("Correo");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, 20));

        jLabel13.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel13.setText("Telefono");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, 20));

        jLabel11.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel11.setText("Nombre");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, 20));

        jLabel14.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel14.setText("Status:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, -1, 20));

        auto_st.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        auto_st.setText(".");
        getContentPane().add(auto_st, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 110, 30));

        Encargado.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        Encargado.setText("jLabel17");
        getContentPane().add(Encargado, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, -1, -1));
        getContentPane().add(Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 90, -1));

        adbok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/boooks.png"))); // NOI18N
        adbok.setBorderPainted(false);
        adbok.setContentAreaFilled(false);
        adbok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adbokActionPerformed(evt);
            }
        });
        adbok.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                adbokKeyPressed(evt);
            }
        });
        getContentPane().add(adbok, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, -1, -1));

        auto_nom.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        auto_nom.setText("Nombre");
        getContentPane().add(auto_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 140, 20));

        auto_tel.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        auto_tel.setText("Telefono");
        getContentPane().add(auto_tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, -1, -1));

        auto_email.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        auto_email.setText("Email");
        getContentPane().add(auto_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 180, -1));

        jLabel9.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel9.setText("ID Libro");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 90, 20));

        sear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searActionPerformed(evt);
            }
        });
        getContentPane().add(sear, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, 300, -1));

        txt_titu.setFont(new java.awt.Font("Palatino Linotype", 1, 12)); // NOI18N
        txt_titu.setText("Titulo");
        getContentPane().add(txt_titu, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 150, -1));

        exi.setFont(new java.awt.Font("Palatino Linotype", 1, 12)); // NOI18N
        exi.setForeground(new java.awt.Color(255, 255, 255));
        exi.setText("Existencia");
        getContentPane().add(exi, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, 150, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 610, 160));

        jLabel16.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Piezas");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 50, -1));

        jLabel17.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Autor");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 50, -1));

        auto.setFont(new java.awt.Font("Palatino Linotype", 1, 12)); // NOI18N
        auto.setForeground(new java.awt.Color(255, 255, 255));
        auto.setText("Autor");
        getContentPane().add(auto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 150, -1));
        getContentPane().add(num, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 30, -1));

        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/prestamo.jpg"))); // NOI18N
        getContentPane().add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 900, 590));

        ape.setText("jLabel10");
        getContentPane().add(ape, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, -1, -1));

        dire.setText("jLabel15");
        getContentPane().add(dire, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, -1, -1));

        ACTIVO.setText("NARANJA");
        getContentPane().add(ACTIVO, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, -1, 10));

        Sta.setText("1");
        Sta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StaActionPerformed(evt);
            }
        });
        getContentPane().add(Sta, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 20, -1));

        matri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matriActionPerformed(evt);
            }
        });
        getContentPane().add(matri, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 150, -1));

        FIN.setText("jTextField2");
        FIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FINActionPerformed(evt);
            }
        });
        getContentPane().add(FIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 100, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MENUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENUActionPerformed
        Menu2 obj=new Menu2();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_MENUActionPerformed
 
    private void txt_libActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_libActionPerformed
      
    }//GEN-LAST:event_txt_libActionPerformed

    private void Consulta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Consulta1ActionPerformed
      Libros obj= new Libros();
      obj.setVisible(true);
      
    }//GEN-LAST:event_Consulta1ActionPerformed

    private void Ingreso2tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ingreso2tActionPerformed
   
        this.txt_lib.setVisible(true);
        this.txt_titu.setVisible(true);
         this.exi.setVisible(true);
          this.auto.setVisible(true);
          this.num.setVisible(true);
        this.jLabel7.setVisible(true);
        this.jLabel6.setVisible(true);
       this.jScrollPane1.setVisible(true);
        this.adbok.setVisible(true);
        this.Consulta1.setVisible(true);
         this.sear.setVisible(true);
         this.jLabel16.setVisible(true);
         this.jLabel17.setVisible(true);
          this.jLabel9.setVisible(true);
         
        
        String dia=Integer.toString(Fin.getCalendar().get(Calendar.DAY_OF_MONTH));
        String mes=Integer.toString(Fin.getCalendar().get(Calendar.MONTH)+1);
        String year=Integer.toString(Fin.getCalendar().get(Calendar.YEAR));
        String fecha=(dia+"/"+mes+"/"+year);
        FIN.setText(fecha);
        
        if(new ConexionBD().Pres1(txt_pedido.getText(), Inicio.getText(), FIN.getText(), txt_matri.getText(), Sta.getText(),Encargado.getText()))
                {
                    JOptionPane.showMessageDialog(null, "Perfecto! Ahora Empieza a llenar el Formulario de Libros");
                    modificar();
                   
                }else
        {JOptionPane.showMessageDialog(null, "Intenta de nuevo");}
        
        
        
        
        
        
        
        //Pres1(txt_pedido.getText(), Inicio.getDateFormatString().toString(), Fin.getDateFormatString().toString() txt_matri.getText(), txt_enc.getText()))
    }//GEN-LAST:event_Ingreso2tActionPerformed

    private void txt_matriKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_matriKeyPressed
   
    	String sql="Select * From alumnos where Matricula like'%"+txt_matri.getText() + "%'";
      
     
      ConexionBD cc=new ConexionBD();
      Connection cn=cc.conexion();
      try{
          String n="Nombre";
          String t="Telefono";
          String c="Mail";
          String s="Status";
          String m="Matricula";
          String a="Apellidos";
          String d="Direccion";
          
        
          Statement st = (Statement) cn.createStatement();
          ResultSet rs = st.executeQuery(sql);
          
       if (rs.next()) {
                    auto_nom.setText(rs.getString("Nombre"));
                    
                    auto_tel.setText(rs.getString("Telefono"));
                    auto_email.setText(rs.getString("Mail"));
                    auto_st.setText(rs.getString("Status"));
                    matri.setText(rs.getString("Matricula"));
                    ape.setText(rs.getString("Apellidos"));
                    dire.setText(rs.getString("Direccion"));
                  
                }
       else{
       JOptionPane.showMessageDialog(null, "Registro No encontrado ");
       };}
      catch(SQLException e){  JOptionPane.showMessageDialog(null,"Problemas con el Query");}
    	catch(Exception e){ JOptionPane.showMessageDialog(null,"Problemas con java input-Output de datos");  }
    		
    	
    }//GEN-LAST:event_txt_matriKeyPressed

    private void txt_matriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_matriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_matriActionPerformed

    private void FinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FinKeyTyped
       
        
    }//GEN-LAST:event_FinKeyTyped

    private void FinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FinMouseClicked
       
    }//GEN-LAST:event_FinMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       String dia=Integer.toString(Fin.getCalendar().get(Calendar.DAY_OF_MONTH));
        String mes=Integer.toString(Fin.getCalendar().get(Calendar.MONTH)+1);
        String year=Integer.toString(Fin.getCalendar().get(Calendar.YEAR));
        String fecha=(dia+"/"+mes+"/"+year);
        FIN.setText(fecha);
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void FINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FINActionPerformed

        
    }//GEN-LAST:event_FINActionPerformed

    private void txt_libKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_libKeyPressed
        String sql="Select * From inventario where IDLibro like'%"+txt_lib.getText() + "%'";
      
     
      ConexionBD cc=new ConexionBD();
      Connection cn=cc.conexion();
      try{
          String t="Titulo";
          String p="Precio";
         
        
          Statement st = (Statement) cn.createStatement();
          ResultSet rs = st.executeQuery(sql);
          
       if (rs.next()) {
                    txt_titu.setText(rs.getString("Titulo"));
                  
                }
       else{
       JOptionPane.showMessageDialog(null, "Registro No encontrado ");
       };}
      catch(SQLException e){  JOptionPane.showMessageDialog(null,"Problemas con el Query");}
    	catch(Exception e){ JOptionPane.showMessageDialog(null,"Problemas con java input-Output de datos");  }
    	
    }//GEN-LAST:event_txt_libKeyPressed

    private void txt_pedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pedidoActionPerformed

    private void adbokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adbokActionPerformed
       
        
        if(new ConexionBD().Piez(  num.getText(), txt_pedido.getText(), txt_lib.getText(),txt_matri.getText(), Sta.getText()))
                {
                   JOptionPane.showMessageDialog(null, "Insertado");
                   
                  
                   
                }else
        {JOptionPane.showMessageDialog(null, "No puedes ingresar mas 3 Libros");}
               
    }//GEN-LAST:event_adbokActionPerformed

    private void adbokKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adbokKeyPressed
                   

    }//GEN-LAST:event_adbokKeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      Devolucion_1 obj= new Devolucion_1();
      obj.setVisible(true);
      
    }//GEN-LAST:event_jButton3ActionPerformed

    private void StaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StaActionPerformed

    private void matriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_matriActionPerformed

    private void searActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searActionPerformed
       String [] Titulos={"::..Id..::","::..Titulo..::","::..Editorial..::","::..Autor..::","::..Genero..::","::..Descripcion..::","::..NP..::","::..Existencia..::"};
      String [] Registros= new String[10];
      String sql="Select * From inventario where Titulo like'%"+sear.getText() + "%'";
      
      model= new DefaultTableModel(null,Titulos);
      ConexionBD cc=new ConexionBD();
      Connection cn=cc.conexion();
      try{
          Statement st = (Statement) cn.createStatement();
          ResultSet rs = st.executeQuery(sql);
       while (rs.next()) {
                    Registros[0] = rs.getString("IDLibro");
                    Registros[1] = rs.getString("Titulo");
                    Registros[2] = rs.getString("Editorial");
                    Registros[3] = rs.getString("Autor");
                    Registros[4] = rs.getString("Genero");
                    Registros[5] = rs.getString("Descripcion");
                    Registros[6] = rs.getString("Npag");
                    Registros[7] = rs.getString("PRECIO");
                    model.addRow(Registros);
                }
       jTable1.setModel(model);}
      catch(SQLException e){  JOptionPane.showMessageDialog(null,"Problemas con el Query");}
    	catch(Exception e){ JOptionPane.showMessageDialog(null,"Problemas con java input-Output de datos");  }
    }//GEN-LAST:event_searActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Inicio obj=new Inicio();
         obj.setVisible(true);
         dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

  public void modificar(){
   String M,N,A,D,T,EM,S;
        
    M=txt_matri.getText();
    N=auto_nom.getText();
    A=auto_tel.getText();
    D=auto_email.getText();
    T=ACTIVO.getText();
    EM=ape.getText();
    S=dire.getText();
    
    
      String cadena="update alumnos set Nombre="+"\""+N+"\""+",";
    	cadena=cadena+"Apellidos="+"\""+EM+"\""+",";
        cadena=cadena+"Direccion="+"\""+S+"\""+",";
        cadena=cadena+"Telefono="+"\""+A+"\""+",";
        cadena=cadena+"Mail="+"\""+D+"\""+",";
        cadena=cadena+"Status="+"\""+T+"\""+" ";
    	cadena=cadena+"where Matricula="+"\""+M+"\""+";";
     
    try{PreparedStatement stmt=null;
    	Class.forName("com.mysql.jdbc.Driver");
    	Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/biblioteca?user=root&password=12345678");
    		stmt =conexion.prepareStatement(cadena);
    		int retorno=stmt.executeUpdate();
    		if(retorno==1){
    			
    		}
    		if(retorno==0){
    			JOptionPane.showMessageDialog(null,"No modificad");
    		}
    		//aqui va el codigo de la conexion
    	}catch(ClassNotFoundException e){ JOptionPane.showMessageDialog(null,"problema con el driver"); }
    	catch(SQLException e){  JOptionPane.showMessageDialog(null,"problemas con el Query");}
    	catch(Exception e){ JOptionPane.showMessageDialog(null,"problemas con java input-Output de datos");  }	
      
  
  }
   public void calcular(){
   
   int r=0,n;
  
    
    
   // r=n-1;
   
   
   }
    public static void main(String args[]) {
     
        
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Prestamos_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prestamos_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prestamos_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prestamos_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prestamos_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ACTIVO;
    private javax.swing.JButton Consulta1;
    private javax.swing.JLabel Encargado;
    private javax.swing.JTextField FIN;
    private javax.swing.JLabel FONDO;
    private com.toedter.calendar.JDateChooser Fin;
    private javax.swing.JButton Ingreso2t;
    private javax.swing.JTextField Inicio;
    private javax.swing.JButton MENU;
    private javax.swing.JTextField Sta;
    private javax.swing.JButton adbok;
    private javax.swing.JLabel ape;
    private javax.swing.JLabel auto;
    private javax.swing.JLabel auto_email;
    private javax.swing.JLabel auto_nom;
    private javax.swing.JLabel auto_st;
    private javax.swing.JLabel auto_tel;
    private javax.swing.JLabel dire;
    private javax.swing.JLabel exi;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField matri;
    private javax.swing.JTextField num;
    private javax.swing.JTextField sear;
    private javax.swing.JTextField txt_lib;
    private javax.swing.JTextField txt_matri;
    private javax.swing.JTextField txt_pedido;
    private javax.swing.JLabel txt_titu;
    // End of variables declaration//GEN-END:variables
}
