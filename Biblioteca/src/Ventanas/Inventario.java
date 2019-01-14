
package Ventanas;

import Codigos.CodigoAuto;
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
public class Inventario extends javax.swing.JFrame {

    private JTable table;
DefaultTableModel model;
ListSelectionModel lscodigos;


    public Inventario() {
        cargarcodigo();
        initComponents();
        
        
        this.setLocationRelativeTo(null);
        jTable1.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
        
        public void valueChanged(ListSelectionEvent e){
        if(jTable1.getSelectedRow() !=-1)
                {
                    int fila= jTable1.getSelectedRow();
                    IdBook.setText(jTable1.getValueAt(fila, 0).toString());
                    Titulo.setText(jTable1.getValueAt(fila, 1).toString());
                    Editorial.setText(jTable1.getValueAt(fila, 2).toString());
                    Autor.setText(jTable1.getValueAt(fila, 3).toString());
                    Genero.setText(jTable1.getValueAt(fila, 4).toString());
                    
                    Paginas.setText(jTable1.getValueAt(fila, 6).toString());
                    Precio.setText(jTable1.getValueAt(fila, 7).toString());
                    Descripcion.setText(jTable1.getValueAt(fila, 5).toString());
                
                        
                }
        }
        });
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        IdBook = new javax.swing.JTextField();
        Titulo = new javax.swing.JTextField();
        Editorial = new javax.swing.JTextField();
        Autor = new javax.swing.JTextField();
        Genero = new javax.swing.JTextField();
        Descripcion = new javax.swing.JTextField();
        Paginas = new javax.swing.JTextField();
        Precio = new javax.swing.JTextField();
        Tablabusqueda = new javax.swing.JTextField();
        Insertar = new javax.swing.JButton();
        Actualizar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        MENU = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        IDBook = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        edito = new javax.swing.JLabel();
        autorr = new javax.swing.JLabel();
        gene = new javax.swing.JLabel();
        descrip = new javax.swing.JLabel();
        npagi = new javax.swing.JLabel();
        prince = new javax.swing.JLabel();
        Consulta1 = new javax.swing.JButton();
        Encabezado = new javax.swing.JLabel();
        BUSQUEDAAA = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(900, 563));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IdBook.setText("MJC");
        IdBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdBookActionPerformed(evt);
            }
        });
        getContentPane().add(IdBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 150, -1));

        Titulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TituloActionPerformed(evt);
            }
        });
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 150, -1));

        Editorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditorialActionPerformed(evt);
            }
        });
        getContentPane().add(Editorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 170, -1));

        Autor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AutorActionPerformed(evt);
            }
        });
        getContentPane().add(Autor, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, 160, -1));

        Genero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GeneroActionPerformed(evt);
            }
        });
        getContentPane().add(Genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 150, -1));

        Descripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescripcionActionPerformed(evt);
            }
        });
        getContentPane().add(Descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 340, 60));

        Paginas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaginasActionPerformed(evt);
            }
        });
        getContentPane().add(Paginas, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 80, -1));

        Precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrecioActionPerformed(evt);
            }
        });
        getContentPane().add(Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 70, -1));

        Tablabusqueda.setText("MJC");
        Tablabusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TablabusquedaActionPerformed(evt);
            }
        });
        Tablabusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TablabusquedaKeyPressed(evt);
            }
        });
        getContentPane().add(Tablabusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 440, -1));

        Insertar.setText("Insertar");
        Insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertarActionPerformed(evt);
            }
        });
        getContentPane().add(Insertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        Actualizar.setText("Actualizar");
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, -1, -1));

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        getContentPane().add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, -1, -1));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/CLOSE.png"))); // NOI18N
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, 50, 40));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/help.png"))); // NOI18N
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 520, 40, 30));

        MENU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/menu_1.png"))); // NOI18N
        MENU.setBorderPainted(false);
        MENU.setContentAreaFilled(false);
        MENU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENUActionPerformed(evt);
            }
        });
        getContentPane().add(MENU, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, 60, -1));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 830, 220));

        jLabel3.setFont(new java.awt.Font("Lao UI", 1, 18)); // NOI18N
        jLabel3.setText("Sistema de Gestion de Préstamo de Libros");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 880, 20));

        IDBook.setFont(new java.awt.Font("Californian FB", 1, 12)); // NOI18N
        IDBook.setText("Id Libro");
        getContentPane().add(IDBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        titulo.setFont(new java.awt.Font("Californian FB", 1, 12)); // NOI18N
        titulo.setText("Titulo");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, -1, -1));

        edito.setFont(new java.awt.Font("Californian FB", 1, 12)); // NOI18N
        edito.setText("Editorial");
        getContentPane().add(edito, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, -1, -1));

        autorr.setFont(new java.awt.Font("Californian FB", 1, 12)); // NOI18N
        autorr.setText("Autor");
        getContentPane().add(autorr, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 120, -1, -1));

        gene.setFont(new java.awt.Font("Californian FB", 1, 12)); // NOI18N
        gene.setText("Genero");
        getContentPane().add(gene, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        descrip.setFont(new java.awt.Font("Californian FB", 1, 12)); // NOI18N
        descrip.setText("Descripcion");
        getContentPane().add(descrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, -1, -1));

        npagi.setFont(new java.awt.Font("Californian FB", 1, 12)); // NOI18N
        npagi.setText("# Paginas");
        getContentPane().add(npagi, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, -1, -1));

        prince.setFont(new java.awt.Font("Californian FB", 1, 12)); // NOI18N
        prince.setText("Existencia");
        getContentPane().add(prince, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, -1, -1));

        Consulta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/search.png"))); // NOI18N
        Consulta1.setBorderPainted(false);
        Consulta1.setContentAreaFilled(false);
        Consulta1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Consulta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consulta1ActionPerformed(evt);
            }
        });
        getContentPane().add(Consulta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 260, 40, 30));

        Encabezado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reportes.jpg"))); // NOI18N
        getContentPane().add(Encabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, -1, 590));

        BUSQUEDAAA.setText("jButton2");
        BUSQUEDAAA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUSQUEDAAAActionPerformed(evt);
            }
        });
        getContentPane().add(BUSQUEDAAA, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 20, 10));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MENUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENUActionPerformed
      Menu obj=new Menu();
      obj.setVisible(true);
      dispose(); 
    }//GEN-LAST:event_MENUActionPerformed

    private void EditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditorialActionPerformed
String nulo="";
    			if(Editorial.getText().equals(nulo)){
    				JOptionPane.showMessageDialog(null, "La Editorial es Obligatoria");
    			}else { Editorial.requestFocusInWindow(); }        
    }//GEN-LAST:event_EditorialActionPerformed

    private void DescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescripcionActionPerformed
  String nulo="";
    			if(Descripcion.getText().equals(nulo)){
    				JOptionPane.showMessageDialog(null, "La Descripcion es obligatorio");
    			}else { Descripcion.requestFocusInWindow(); }
    }//GEN-LAST:event_DescripcionActionPerformed

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
     
        String Idbo,Titu,Edito,Auto,Gene,Descri,NP,Cost;
        
    Idbo=IdBook.getText();
    Titu=Titulo.getText();
    Edito=Editorial.getText();
    Auto=Autor.getText();
    Gene=Genero.getText();
    Descri=Descripcion.getText();
    NP=Paginas.getText();
    Cost=Precio.getText();
    
        String cadena="update inventario set Titulo="+"\""+Titu+"\""+",";
    	cadena=cadena+"Editorial="+"\""+Edito+"\""+",";
        cadena=cadena+"AUTOR="+"\""+Auto+"\""+",";
        cadena=cadena+"Genero="+"\""+Gene+"\""+",";
        cadena=cadena+"Descripcion="+"\""+Descri+"\""+",";
        cadena=cadena+"Npag="+"\""+NP+"\""+",";
    	cadena=cadena+"PRECIO="+"\""+Cost+"\""+" ";
    	cadena=cadena+"where IDLibro="+"\""+Idbo+"\""+";";
     
    try{PreparedStatement stmt=null;
    	Class.forName("com.mysql.jdbc.Driver");
    	Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/biblioteca?user=root&password=12345678");
    		stmt =conexion.prepareStatement(cadena);
    		int retorno=stmt.executeUpdate();
    		if(retorno==1){
    			JOptionPane.showMessageDialog(null," Registro Modificado");
    		}
    		if(retorno==0){
    			JOptionPane.showMessageDialog(null,"fracaso de alta");
    		}
    		//aqui va el codigo de la conexion
    	}catch(ClassNotFoundException e){ JOptionPane.showMessageDialog(null,"problema con el driver"); }
    	catch(SQLException e){  JOptionPane.showMessageDialog(null,"problemas con el Query");}
    	catch(Exception e){ JOptionPane.showMessageDialog(null,"problemas con java input-Output de datos");  }	
    }//GEN-LAST:event_ActualizarActionPerformed

    private void InsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarActionPerformed
      if(new ConexionBD().add(IdBook.getText(), Titulo.getText(), Editorial.getText(), Autor.getText(), Genero.getText(),Descripcion.getText(),Paginas.getText(), Precio.getText()))
                {
                    JOptionPane.showMessageDialog(null, "Registro dadod e Alta con EXITO");
                    nuevo();
                   
                }else
        {JOptionPane.showMessageDialog(null, "Intenta de nuevo");}
    }//GEN-LAST:event_InsertarActionPerformed

    private void IdBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdBookActionPerformed
         
    }//GEN-LAST:event_IdBookActionPerformed

    private void TablabusquedaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TablabusquedaKeyPressed
      String [] Titulos={"::..Id..::","::..Titulo..::","::..Editorial..::","::..Autor..::","::..Genero..::","::..Descripcion..::","::..NP..::","::..Existencia..::"};
      String [] Registros= new String[10];
      String sql="Select * From inventario where Titulo like'%"+Tablabusqueda.getText() + "%'";
      
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
       
    }//GEN-LAST:event_TablabusquedaKeyPressed

    private void TablabusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TablabusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TablabusquedaActionPerformed

    private void BUSQUEDAAAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUSQUEDAAAActionPerformed
     String Idbo,Titu,Edito,Auto,Gene,Descri,NP,Cost;
     int sw=0;
    Idbo=IdBook.getText();
    Titu=Titulo.getText();
    Edito=Editorial.getText();
    Auto=Autor.getText();
    Gene=Genero.getText();
    Descri=Descripcion.getText();
    NP=Paginas.getText();
    Cost=Precio.getText();
        
    	String cadena="SELECT * FROM inventario where IDLibro="+"\""+Idbo+"\""+";";
    	
    	//JOptionPane.showMessageDialog(null,cadena);
    	try{PreparedStatement stmt=null;
    	Class.forName("com.mysql.jdbc.Driver");
    	Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/biblioteca?user=root&password=12345678");
    		stmt =conexion.prepareStatement(cadena);
             ResultSet tabla;
             tabla=stmt.executeQuery();
             while(tabla.next()){
             	sw=1;
             	IdBook.setText(tabla.getString(1));
                Titulo.setText(tabla.getString(2));
                Editorial.setText(tabla.getString(3));
                Autor.setText(tabla.getString(4)); 
                Genero.setText(tabla.getString(5));
                Descripcion.setText(tabla.getString(6));
                Paginas.setText(tabla.getString(7));
                Precio.setText(tabla.getString(8));
             }
    		//aqui va el codigo de la conexion
    	}catch(ClassNotFoundException e){ JOptionPane.showMessageDialog(null,"Problema con el driver"); }
    	catch(SQLException e){  JOptionPane.showMessageDialog(null,"Problemas con el Queryyyy");}
    	catch(Exception e){ JOptionPane.showMessageDialog(null,"Problemas con java input-Output de datos");  }
    	if(sw==0){
    		JOptionPane.showMessageDialog(null,"El Libro no ha sido registrado");
    	}
        
    }//GEN-LAST:event_BUSQUEDAAAActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
      
         String Idbo,Titu,Edito,Auto,Gene,Descri,NP,Cost;
    Idbo=IdBook.getText();
    Titu=Titulo.getText();
    Edito=Editorial.getText();
    Auto=Autor.getText();
    Gene=Genero.getText();
    Descri=Descripcion.getText();
    NP=Paginas.getText();
    Cost=Precio.getText();
    
        
        String cadena="DELETE FROM inventario WHERE IDLibro="+"\""+Idbo+"\""+";";
    
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
                        nuevo();
    		}
    		//aqui va el codigo de la conexion
    	}catch(ClassNotFoundException e){ JOptionPane.showMessageDialog(null,"Problema con el driver"); }
    	catch(SQLException e){  JOptionPane.showMessageDialog(null,"Problemas con el Query");}
    	catch(Exception e){ JOptionPane.showMessageDialog(null,"Problemas con java input-Output de datos");  }
    }//GEN-LAST:event_EliminarActionPerformed

    private void TituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TituloActionPerformed
      String nulo="";
    			if(Titulo.getText().equals(nulo)){
    				JOptionPane.showMessageDialog(null, "El Titulo del Libro es Obligatorio");
    			}else { Titulo.requestFocusInWindow(); }
    }//GEN-LAST:event_TituloActionPerformed

    private void AutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AutorActionPerformed
      String nulo="";
    			if(Autor.getText().equals(nulo)){
    				JOptionPane.showMessageDialog(null, "No Olvides el Autor");
    			}else { Autor.requestFocusInWindow(); }
    }//GEN-LAST:event_AutorActionPerformed

    private void GeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GeneroActionPerformed
       String nulo="";
    			if(Genero.getText().equals(nulo)){
    				JOptionPane.showMessageDialog(null, "El Genero es importante");
    			}else { Genero.requestFocusInWindow(); }
    }//GEN-LAST:event_GeneroActionPerformed

    private void PaginasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaginasActionPerformed
        String nulo="";
    			if(Paginas.getText().equals(nulo)){
    				JOptionPane.showMessageDialog(null, "Es necesario saber el numero de paginas");
    			}else { Paginas.requestFocusInWindow(); }
    }//GEN-LAST:event_PaginasActionPerformed

    private void PrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrecioActionPerformed
      String nulo="";
    			if(Precio.getText().equals(nulo)){
    				JOptionPane.showMessageDialog(null, "Es Obligatorio saber el NUMERO de existencia");
    			}else { Precio.requestFocusInWindow(); }
    }//GEN-LAST:event_PrecioActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
      AyudaInv obj= new AyudaInv();
      obj.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void Consulta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Consulta1ActionPerformed
        Libros obj= new Libros();
        obj.setVisible(true);

    }//GEN-LAST:event_Consulta1ActionPerformed

   
      public void nuevo (){
  IdBook.setText("");
     Titulo.setText("");
     Editorial.setText("");
     Autor.setText("");
     Genero.setText("");
     Paginas.setText("");
     Precio.setText("");
     Descripcion.setText("");
 
 }
    
     void cargarcodigo()
    {
      ConexionBD cc=new ConexionBD();
      Connection cn=cc.conexion();
       
       int j;
       String num="";
       String c = "";
       String SQL="select max(IDLibro) from inventario";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            if(rs.next())
            {
                c=rs.getString(1);
            }
               
            if(c==null)
            {
               IdBook.setText("MJC0001");
            }else{
                char r1=c.charAt(2);
                char r2=c.charAt(3);
                char r3=c.charAt(4);
                char r4=c.charAt(5);
                String r ="";
                r = "" +r1+r2+r3+r4;
                
                
                j=Integer.parseInt(r);
                CodigoAuto gen = new CodigoAuto();
                gen.generar(j);
                IdBook.setText("MJC"+gen.serie());
                
            }
            
        } catch (Exception e) {
        }
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
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar;
    private javax.swing.JTextField Autor;
    private javax.swing.JButton BUSQUEDAAA;
    private javax.swing.JButton Consulta1;
    private javax.swing.JTextField Descripcion;
    private javax.swing.JTextField Editorial;
    private javax.swing.JButton Eliminar;
    private javax.swing.JLabel Encabezado;
    private javax.swing.JTextField Genero;
    private javax.swing.JLabel IDBook;
    private javax.swing.JTextField IdBook;
    private javax.swing.JButton Insertar;
    private javax.swing.JButton MENU;
    private javax.swing.JTextField Paginas;
    private javax.swing.JTextField Precio;
    private javax.swing.JTextField Tablabusqueda;
    private javax.swing.JTextField Titulo;
    private javax.swing.JLabel autorr;
    private javax.swing.JLabel descrip;
    private javax.swing.JLabel edito;
    private javax.swing.JLabel gene;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel npagi;
    private javax.swing.JLabel prince;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
