/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import config.BD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;


/**
 *
 * @author CARLOS GUALPA
 */
public class UsuariosModel {
    private Connection dbConexion = null;
    private String sql = null;
    private Statement dbQ;
    
    public UsuariosModel() {
    this.dbConexion = new BD().getConexion();
            try {
            this.dbQ= this.dbConexion.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(UsuariosModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
public ResultSet getUsuario(String usuario){ 
        try {
this.sql= "SELECT * FROM usuarios US WHERE 1=1 AND US.'usuario' = BINARY "+usuario+"";
            ResultSet rs= this.dbQ.executeQuery(this.sql);
            return rs;
  }catch(SQLException ex){
            Logger.getLogger(UsuariosModel.class.getName()).log(Level.SEVERE, null, ex);
        }
   return null;
}
}