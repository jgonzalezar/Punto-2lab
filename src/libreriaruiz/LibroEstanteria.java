/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreriaruiz;

/**
 *
 * @author Emmanuel Steven Rojas Arcila
 */
public class LibroEstanteria extends Libro{
    private boolean nuevo;
    private double precioVenta;

    public LibroEstanteria(boolean nuevo, double precioVenta, String autor, String editorial, String nombre) {
        super(autor, editorial, nombre);
        this.nuevo = nuevo;
        this.precioVenta = precioVenta;
    }

    public boolean isNuevo() {
        return nuevo;
    }

    public void setNuevo(boolean nuevo) {
        this.nuevo = nuevo;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    
    
}
