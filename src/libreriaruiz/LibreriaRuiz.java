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
public class LibreriaRuiz {
    private ArrayList<Libro> porPedir;
    private ArrayList<Estanteria> estantes;

    public LibreriaRuiz() {
        this.estantes = new ArrayList<>();
    }

    public ArrayList<Libro> getPorPedir() {
        return porPedir;
    }

    public boolean addPorPedir(Libro porPedir) {
        return this.porPedir.add(porPedir);
    }

    public ArrayList<Estanteria> getEstantes() {
        return estantes;
    }

    public boolean addEstante(Estanteria estante) {
        return this.estantes.add(estante);
    }
    
    /**
     * 
     * @param nombre corresponde al nombre del libro que se quiere eliminar.
     * @param nuevo nos indica si el libro que se quiere eliminar es nuevo o usado.
     * @param autor hace referencia al nombre del autor del libro que se quiere eliminar.
     * @param precio el valor de venta del libro que se quiere eliminar.
     * @param editorial es el nombre de la editorial del libro que se quiere eliminar.
     * @return boolean que indica si la operacion de eliminacion del libro se pudo o no realizar.
     */
    public boolean eliminarLibro(String nombre, boolean nuevo, String autor, double precio, String editorial){
        for (int i = 0; i < estantes.size(); i++) {
            for (int j = 0; j < estantes.get(i).getLibros().size(); j++) {
                String name = estantes.get(i).getLibros().get(j).getNombre();
                boolean antiguedad = estantes.get(i).getLibros().get(j).isNuevo();
                String creador = estantes.get(i).getLibros().get(j).getAutor();
                double costo = estantes.get(i).getLibros().get(j).getPrecioVenta();
                String editor = estantes.get(i).getLibros().get(j).getEditorial();
                if(name == nombre && antiguedad == nuevo && creador == autor && costo == precio && editor == editorial){
                    estantes.get(i).getLibros().remove(j);
                    return true;
                }
            }
        }
        return false;
    }
    /**
     * @param nombre corresponde al nombre del libro que se quiere ubicar
     * @param nuevo nos indica si el libro que se busca es nuevo o usado.
     */
    public void buscarLibroxNombre(String nombre, boolean nuevo){
        for (int i = 0; i < estantes.size(); i++) {
            for (int j = 0; j < estantes.get(i).getLibros().size(); j++) {
                String name = estantes.get(i).getLibros().get(j).getNombre();
                boolean antiguedad = estantes.get(i).getLibros().get(j).isNuevo();
                if(name == nombre && antiguedad == nuevo){
                    System.out.println("Hay un libro en el estante #" + estantes.get(i).getId());
                }
            }
        }
    }
    
    /**
    *@param autor hace referencia al nombre del autor del libro o los libros que se quieren ubicar.
    *@param nuevo nos indica si el libro o los libros que se buscan son nuevos o usados.
    */
    public void buscarLibroxAutor(String autor, boolean nuevo){
        for (int i = 0; i < estantes.size(); i++) {
            for (int j = 0; j < estantes.get(i).getLibros().size(); j++) {
                String creador = estantes.get(i).getLibros().get(j).getAutor();
                boolean antiguedad = estantes.get(i).getLibros().get(j).isNuevo();
                if(creador == autor && antiguedad == nuevo){
                    System.out.println("Hay un libro en el estante #" + estantes.get(i).getId());
                }
            }
        }
    }
    
    /**
     * 
     * @param precio el valor de venta del libro o los libros que se quieren ubicar.
     */
    public void buscarLibroxPrecio(double precio){
        for (int i = 0; i < estantes.size(); i++) {
            for (int j = 0; j < estantes.get(i).getLibros().size(); j++) {
                double costo = estantes.get(i).getLibros().get(j).getPrecioVenta();
                if(costo == precio){
                    System.out.println("Hay un libro en el estante #" + estantes.get(i).getId());
                }
            }
        }
    }
    
    /**
     * @param editorial es el nombre de la editorial del libro o los libros que se quieren ubicar
     * @param nuevo nos indica si el libro o los libros que se buscan son nuevos o usados.
     */
    public void buscarLibroxEditorial(String editorial, boolean nuevo){
        for (int i = 0; i < estantes.size(); i++) {
            for (int j = 0; j < estantes.get(i).getLibros().size(); j++) {
                String editor = estantes.get(i).getLibros().get(j).getEditorial();
                boolean antiguedad = estantes.get(i).getLibros().get(j).isNuevo();
                if(editor == editorial && antiguedad == nuevo){
                    System.out.println("Hay un libro en el estante #" + estantes.get(i).getId());
                }
            }
        }
    }
    
}
