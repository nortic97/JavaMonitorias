/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos.controller;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelos.DAO.UsuariosDAO;
import modelos.models.UsuariosModel;

/**
 *
 * @author david
 */
public class UsuariosController extends UsuariosDAO {

    private DefaultTableModel modelo = new DefaultTableModel();
    private UsuariosModel usuario;

    public DefaultTableModel listaTabla(JTable tbl) {

        ArrayList<UsuariosModel> list = listar();

        modelo = (DefaultTableModel) tbl.getModel();

        Object[] ob = new Object[4];

        for (int i = 0; i < list.size(); i++) {

            ob[0] = list.get(i).getId();
            ob[1] = list.get(i).getUser();
            ob[2] = list.get(i).getPassword();
            ob[3] = list.get(i).getRole();

            modelo.addRow(ob);

        }

        return modelo;

    }

    public void guardarUsuario(Object[] object) {

        usuario = new UsuariosModel();

        usuario.setUser(object[0].toString());
        usuario.setPassword(object[1].toString());
        usuario.setRole(object[2].toString());

        guardar(usuario);

    }

    public void eliminarUsuario(int id) {

        boolean r = eliminar(id);

        if (r == true) {
            
            JOptionPane.showMessageDialog(null, "Eliminado con exito", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);

        }

    }

}
