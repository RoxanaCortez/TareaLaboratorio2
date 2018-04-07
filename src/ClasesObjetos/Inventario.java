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

import java.util.ArrayList;

public class Inventario {

    public ArrayList <Inventario> productos;
    
    public Inventario(){
        productos = new ArrayList<Inventario>();
    }

    public ArrayList<Inventario> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Inventario> productos) {
        this.productos = productos;
    }
    
    public void AgregarProducto(){
    }
    
    public void EliminarProducto(){
    }
    
    public void ModificarProducto(){
    }
    
    public void CargarProducto(){
    }
    
    public void DescartarProducto(){
    }
    
}
