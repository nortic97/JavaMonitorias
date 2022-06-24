/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modelos.service;

import java.util.ArrayList;

/**
 * Interface CRUD, para reutilizacion de codigo.
 *
 * @author david
 */
public interface CRUD {

    /**
     * Lista los datos de la base de datos.
     * @return ArrayList
     */
    public ArrayList listar();

    /**
     * Guarda datos en la base de datos.
     *
     * @param object Recibe un obejeto para ser guardado.
     * @return boolean
     */
    public boolean guardar(Object object);

    /**
     * Elimina datos en la base de datos.
     *
     * @param id Recibe un INT para ser el cual coincide con el id del objeto a
     * eliminar de una tabla.
     * @return boolean
     */
    public boolean eliminar(int id);

    /**
     * Actualiza datos en la base de datos.
     *
     * @param object Recibe un objeto con los nuevos datos para ser actualizados
     * en la base.
     * @return boolean
     *
     */
    public boolean actualizar(Object object);

}
