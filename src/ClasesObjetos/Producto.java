/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesObjetos;

/**
 *
 * @author Roxana
 */
public class Producto {
    //Atributos de la clase.
    private String nombre;
    private float precio;
    private int stock;
    private String codigo_del_producto;
    
    public Producto(){
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getCodigo() {
        return codigo_del_producto;
    }

    public void setCodigo(String codigo) {
        this.codigo_del_producto = codigo;
    }
    
    
}
