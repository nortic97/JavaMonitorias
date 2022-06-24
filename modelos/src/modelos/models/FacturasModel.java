/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos.models;

/**
 *
 * @author david
 */
public class FacturasModel {
    
    private int id;
    private int usuarios_id;
    private int clientes_id;
    private int productos_id;
    private double cantidad;
    private double total;

    public FacturasModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUsuarios_id() {
        return usuarios_id;
    }

    public void setUsuarios_id(int usuarios_id) {
        this.usuarios_id = usuarios_id;
    }

    public int getClientes_id() {
        return clientes_id;
    }

    public void setClientes_id(int clientes_id) {
        this.clientes_id = clientes_id;
    }

    public int getProductos_id() {
        return productos_id;
    }

    public void setProductos_id(int productos_id) {
        this.productos_id = productos_id;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "FacturasModel{" + "id=" + id + ", usuarios_id=" + usuarios_id + ", clientes_id=" + clientes_id + ", productos_id=" + productos_id + ", cantidad=" + cantidad + ", total=" + total + '}';
    }
    
    
    
}
