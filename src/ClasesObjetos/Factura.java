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
public class Factura {
    private int numero_factura;
    private String fecha;
    private String hora;
    private String id_cliente;

    public int getNumero_factura() {
        return numero_factura;
    }

    public void setNumero_factura(int numero_factura) {
        this.numero_factura = numero_factura;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getId_cliente() {
        return id_cliente;
    }
    
    
    
    public void BuscarFactura(){
    }
    
    public void AlmacenarFactura(){
    }
    
}
