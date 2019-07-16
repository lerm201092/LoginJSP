/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login.modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author hackro
 */
public class Consultas extends Conexion{
    
    
    public boolean ValidarUsuario(String user,String pass) throws SQLException
    {
        Statement st = con.createStatement();
        ResultSet rs = null;
        String Consulta = "Select * from Usuarios";
        rs = st.executeQuery(Consulta);
        
        while(rs.next())
        {
            if(user.equals(rs.getString("Usuario")) && pass.equals(rs.getString("Contrasena")))
                return true;
        }
  
        return false;
    }
    
    public static void main(String[] args){
        try{
            Consultas con = new Consultas();
            System.out.println(con.ValidarUsuario("hackro", "456"));
        }catch(SQLException e){
            System.out.println("Error");
            System.out.println("--------------------");
            System.out.println(e);
        }
    }
    
    
    
    
}