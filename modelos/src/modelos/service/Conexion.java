/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos.service;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Conexion {

    Connection con = null;

    public Connection getConnection() {

        String url = "jdbc:mysql://localhost:3306/DB?serverTimezone=UTC";

        String user = "root";

        String password = "1234";

        try {
            
            con = DriverManager.getConnection(url, user, password);
            
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);

        }
        
        return con;

    }

}
