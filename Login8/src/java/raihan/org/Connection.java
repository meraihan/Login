/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package raihan.org;

import java.sql.*;


public  class Connection {
static java.sql.Connection con;
static String username = null;
static String password = null;

 
   public static java.sql.Connection sqlconnection(){
       try{
           String dbUrl = "jdbc:mysql://localhost:3306/login8";
           Class.forName("com.mysql.jdbc.Driver").newInstance();
           con=DriverManager.getConnection(dbUrl,"root","");              
           System.out.println("Connection established for SQL");
       }catch(Exception e){
           System.out.println("Database connection exception="+e);
       }
       return con;
}    
    
}
