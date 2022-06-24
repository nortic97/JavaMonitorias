/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos.DAO;

import java.util.ArrayList;
import modelos.models.UsuariosModel;
import modelos.service.CRUD;
import modelos.service.Conexion;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class UsuariosDAO implements CRUD {

    private UsuariosModel usuario;
    private Conexion con = new Conexion();
    private Connection cn;
    private PreparedStatement ps;
    private ResultSet rs;

    @Override
    public ArrayList listar() {

        ArrayList<UsuariosModel> lista = new ArrayList<>();

        String sql = "SELECT * FROM usuarios";

        try {

            cn = con.getConnection();
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                usuario = new UsuariosModel();

                usuario.setId(rs.getInt(1));
                usuario.setUser(rs.getString(2));
                usuario.setPassword(rs.getString(3));
                usuario.setRole(rs.getString(4));

                lista.add(usuario);

            }

            cn.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);

        }

        return lista;

    }

    @Override
    public boolean guardar(Object object) {

        boolean respuesta = false;

        usuario = (UsuariosModel) object;

        String sql = "INSERT INTO usuarios (user, password, role) VALUES (?,?,?)";

        try {

            cn = con.getConnection();
            ps = cn.prepareStatement(sql);

            ps.setString(1, usuario.getUser());
            ps.setString(2, usuario.getPassword());
            ps.setString(3, usuario.getRole());

            ps.execute();

            cn.close();
            
            respuesta = true;

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            respuesta = false;

        }

        return respuesta;

    }

    @Override
    public boolean eliminar(int id) {

        String sql = "DELETE FROM usuarios WHERE id = ?";

        boolean respuesta = false;

        try {

            cn = con.getConnection();
            ps = cn.prepareStatement(sql);

            ps.setInt(1, id);

            ps.execute();

            ps.close();

            respuesta = true;

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            respuesta = false;
            
        }
        
        return respuesta;

    }

    @Override
    public boolean actualizar(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
