
package Ventanas;
import java.sql.*;


public class ConexionBD {

    
    static Connection cn=null;
    
    
    public Connection conexion(){
    try{
    Class.forName("com.mysql.jdbc.Driver");
    cn=DriverManager.getConnection("jdbc:mysql://localhost/biblioteca","root","12345678");
    System.out.println("Exitosa Conexion");
    }catch(Exception e){
    System.out.println(e.getMessage());
    }return cn;
    
    }
    
    Statement createStatement(){
    throw new UnsupportedOperationException("No soportado");
    }
    
  public Boolean add(String Idli, String Titu, String Edi, String Aut, String Gene, String Descri, String NP,String Cost){
  
  String sql="INSERT INTO inventario VALUES("+"\""+Idli+"\""+","+"\""+Titu+"\""+","+"\""+Edi+"\""+","+"\""+Aut+"\""+","+"\""+Gene+"\""+","+"\""+Descri+"\""+","+"\""+NP+"\""+","+"\""+Cost+"\""+");";
  
  try 
  {
       Connection ConexionBD = DriverManager.getConnection("jdbc:mysql://localhost/biblioteca?user=root&password=12345678");
       Statement s= ConexionBD.prepareStatement(sql);
       s.execute(sql);
       return true; 
  }
      catch(Exception ex)
      {
          ex.printStackTrace();
      }
  return false;}
  
  public Boolean alumnos(String Mat, String Nom, String App, String Dire, String Tel, String Ema, String Sta){
 
  String sql="INSERT INTO alumnos VALUES("+"\""+Mat+"\""+","+"\""+Nom+"\""+","+"\""+App+"\""+","+"\""+Dire+"\""+","+"\""+Tel+"\""+","+"\""+Ema+"\""+","+"\""+Sta+"\""+");";
  
  try 
  {
     
       Connection ConexionBD = DriverManager.getConnection("jdbc:mysql://localhost/biblioteca?user=root&password=12345678");
       Statement s= ConexionBD.prepareStatement(sql);
       s.execute(sql);
       return true; 
  }
      catch(Exception ex)
      {
          ex.printStackTrace();
      }
  return false;
  }

  public Boolean Administradores (String Usu, String Nomb,String Ape,String mai,String Dire, String pass,String Jera){
      String sql="Insert INTO encargados values ("+"\""+Usu+"\""+","+"\""+Nomb+"\""+","+"\""+Ape+"\""+","+"\""+mai+"\""+","+"\""+Dire+"\""+","+"\""+pass+"\""+","+"\""+Jera+"\""+");";
      try
      {Connection ConexionBD = DriverManager.getConnection("jdbc:mysql://localhost/biblioteca?user=root&password=12345678");
       Statement s= ConexionBD.prepareStatement(sql);
       s.execute(sql);
       return true; 
      }
      catch(Exception ex){
      ex.printStackTrace();
      }
      return false;
  }
  
  
  public Boolean Reporte (String matri, String num){
      String sql="Insert INTO reportes values ("+"\""+matri+"\""+","+"\""+num+"\""+");";
      try
      {Connection ConexionBD = DriverManager.getConnection("jdbc:mysql://localhost/biblioteca?user=root&password=12345678");
       Statement s= ConexionBD.prepareStatement(sql);
       s.execute(sql);
       return true; 
      }
      catch(Exception ex){
      ex.printStackTrace();
      }
      return false;
  }
  
   public Boolean Pres1 (String IDpres, String FI,String FF,String Mat,String Sta, String Usu){
      String sql="Insert INTO prestamos values ("+"\""+IDpres+"\""+","+"\""+FI+"\""+","+"\""+FF+"\""+","+"\""+Mat+"\""+","+"\""+Sta+"\""+","+"\""+Usu+"\""+");";
     // String sql1="Insert INTO piezas values ("+"\""+IDpres+"\""+","+"\""+IDBook+"\""+");";
      try
      {Connection ConexionBD = DriverManager.getConnection("jdbc:mysql://localhost/biblioteca?user=root&password=12345678");
       Statement s= ConexionBD.prepareStatement(sql);
      // Statement s1=ConexionBD.prepareStatement(sql1);
      
       s.execute(sql);
      // s1.execute(sql1);
     
       return true; 
      }
      catch(Exception ex){
      ex.printStackTrace();
      }
      return false;
  }
     public Boolean Piez (String num, String IDpres, String IDBo, String matri, String Stap){
      String sql="Insert INTO piezas values ("+"\""+num+"\""+","+"\""+IDpres+"\""+","+"\""+IDBo+"\""+","+"\""+matri+"\""+","+"\""+Stap+"\""+");";
     // String sql1="Insert INTO piezas values ("+"\""+IDpres+"\""+","+"\""+IDBook+"\""+");";
      try
      {Connection ConexionBD = DriverManager.getConnection("jdbc:mysql://localhost/biblioteca?user=root&password=12345678");
       Statement s= ConexionBD.prepareStatement(sql);
      // Statement s1=ConexionBD.prepareStatement(sql1);
      
       s.execute(sql);
      // s1.execute(sql1);
     
       return true; 
      }
      catch(Exception ex){
      ex.printStackTrace();
      }
      return false;
  }
}
