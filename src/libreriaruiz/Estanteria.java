/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreriaruiz;

import java.util.ArrayList;

/**
 *
 * @author Emmanuel Steven Rojas Arcila
 */
public class Estanteria {
    private int id;
    private ArrayList<LibroEstanteria> libros;

    public Estanteria(int id) {
        this.id = id;
        this.libros = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<LibroEstanteria> getLibros() {
        return libros;
    }

    public boolean addLibros(LibroEstanteria libro) {
        return this.libros.add(libro);
    }
    
}
