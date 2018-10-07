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
public class Libro {
    private String autor;
    private String editorial;
    private String nombre;

    public Libro(String autor, String editorial, String nombre) {
        this.autor = autor;
        this.editorial = editorial;
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
