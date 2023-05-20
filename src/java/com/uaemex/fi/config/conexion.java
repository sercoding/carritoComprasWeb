package com.uaemex.fi.config;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author sercod
 */
public class conexion {
    Connection con;
    String url = "jdbc:mysql://localhost:3306/bd_tienda";
    String user = "root";
    String pass = "Inic10.ini";
    public Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
        } catch(Exception e){
            
        }
        return con;
    }
    
}
