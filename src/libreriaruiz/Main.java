/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreriaruiz;

import java.util.Scanner;

/**
 *
 * @author Juan Andrés Gonzalez Arias
 */
public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;
        do{
        LibreriaRuiz Libreria = new LibreriaRuiz();
        Estanteria estanteria = new Estanteria(12);
        System.out.println("----------Bienvenido a la librería Ruiz----------");
        System.out.println("\n-----Menú de opciones-----");
        System.out.println("\n1. Agregar libros.");
        System.out.println("2. Eliminar libros.");
        System.out.println("3. Buscar libros por Autor.");
        System.out.println("4. Buscar libros por nombre del libro.");
        System.out.println("5. Buscar libros por Editorial.");
        System.out.println("6. Buscar libros por Precio.");
        System.out.println("7. Ingresar libro por pedir.");
        System.out.println("8. Mostrar lista de libros por pedir.");
        System.out.println("9. Salir.");
        System.out.println("\n¿Qué desea hacer?");    

        
        opcion=leer.nextInt();
        
        switch(opcion){
            case 1:                
                System.out.println("Digite el nombre del libro que desea crear:");
                String Nombre;
                Nombre = leer.next();
                System.out.println("¿Cuál es el precio del libro?");
                double precio;
                precio = leer.nextDouble();
                System.out.println("Digite el autor del libro:");
                String autor;
                autor = leer.next();
                System.out.println("Digite la editorial del libro:");
                String Editorial;
                Editorial = leer.next();
                System.out.println("¿El libro es nuevo? Sí(1)/No (2)");
                int respuesta1;
                respuesta1 = leer.nextInt();
                boolean antiguedadlibro;
                if(respuesta1==1){
                    antiguedadlibro = true;
                    System.out.println("Agregando libro...");
                    LibroEstanteria libroEstanteria = new LibroEstanteria(antiguedadlibro,precio,autor,Editorial,Nombre);
                    estanteria.addLibros(libroEstanteria);
                    
                }else if (respuesta1 == 2){
                    antiguedadlibro = false;
                    System.out.println("Agregando libro...");
                    LibroEstanteria libroEstanteria = new LibroEstanteria(antiguedadlibro,precio,autor,Editorial,Nombre);
                    estanteria.addLibros(libroEstanteria);
                    
                }else{
                    System.out.println("La respuesta ingresada no es válida.");
                }
                
                //estanteria.addLibros(Nombre, )
                break;
            case 2 :
                String nombreLibro;
                int respuesta2;
                String autorLibro;
                double precioLibro;
                String editorialLibro;
                boolean antiguedadLibro;
                
                System.out.println("Digite el nombre del libro que desea borrar:");
                nombreLibro = leer.next();
                
                System.out.println("Digite el autor:");
               
                autorLibro = leer.next();
                System.out.println("Digite el precio del libro:");
                
                precioLibro = leer.nextDouble();
                System.out.println("Digite la editorial del libro:");
                
                editorialLibro = leer.next();
                
                System.out.println("¿El libro es nuevo? Sí(1)/No (2)");
                respuesta2 = leer.nextInt();
                if(respuesta2 == 1){
                    antiguedadLibro = true;
                    System.out.println("Borrando...");
                    Libreria.eliminarLibro(nombreLibro, antiguedadLibro, autorLibro, precioLibro, editorialLibro);
                    break;
                }else if (respuesta2 == 2){
                    antiguedadLibro = false;
                    System.out.println("Borrando...");
                    Libreria.eliminarLibro(nombreLibro, antiguedadLibro, autorLibro, precioLibro, editorialLibro);
                    break;
                }else {
                    System.out.println("La respuesta ingresada no es válida.");
                }
                break;
            
            case 3 :
                System.out.println("Digite el autor:");
                String autor3;
                autor3 = leer.next();
                System.out.println("¿El libro es nuevo? Sí(1)/No (2)");
                int respuesta3;
                boolean antiguedad ;
                respuesta3 = leer.nextInt();
                if(respuesta3==1){
                    antiguedad = true;
                    System.out.println("Buscando....");
                    Libreria.buscarLibroxAutor(autor3, antiguedad);
                }else if (respuesta3==2){
                    antiguedad = false;
                    System.out.println("Buscando....");
                    Libreria.buscarLibroxAutor(autor3, antiguedad);
                }else{
                    System.out.println("La respuesta ingresada no es válida.");
                }
                break;
                
            case 4:
                System.out.println("Digite el nombre del libro:");
                String NombreDelLibro;
                NombreDelLibro = leer.next();
                System.out.println("¿El libro es nuevo? Sí(1)/No (2)");
                int respuesta4;
                boolean Antiguedad;
                respuesta4 = leer.nextInt();
                if(respuesta4==1){
                    Antiguedad = true;
                    System.out.println("Buscando....");
                    Libreria.buscarLibroxNombre(NombreDelLibro, Antiguedad);
                }else if (respuesta4==2){
                    Antiguedad = false;
                    System.out.println("Buscando....");
                    Libreria.buscarLibroxNombre(NombreDelLibro, Antiguedad);
                }else{
                    System.out.println("La respuesta ingresada no es válida.");
                }
                break;
            
            case 5:
                System.out.println("Digite la editorial del libro:");
                String EditorialDelLibro;
                EditorialDelLibro = leer.next();
                System.out.println("¿El libro es nuevo? Sí(1)/No (2)");
                int respuesta5;
                boolean AntiguedadLibro=false;
                respuesta5 = leer.nextInt();
                if(respuesta5==1){
                    AntiguedadLibro = true;
                    System.out.println("Buscando....");
                    Libreria.buscarLibroxEditorial(EditorialDelLibro, AntiguedadLibro);
                }else if (respuesta5==2){
                    AntiguedadLibro = false;
                    System.out.println("Buscando....");
                    Libreria.buscarLibroxEditorial(EditorialDelLibro, AntiguedadLibro);
                }else{
                    System.out.println("La respuesta ingresada no es válida.");
                }
                break;
                
            case 6 :
                System.out.println("Digite el precio del libro:");
                double Precio;
                Precio = leer.nextDouble();
                Libreria.buscarLibroxPrecio(Precio);
                break;                
                  
            case 7 :
                System.out.println("Ingrese el nombre del libro que hace falta por pedir:");
                String libroPedir;
                libroPedir = leer.next();
                System.out.println("Ingrese el autor del libro:");
                String AutorLibro;
                AutorLibro = leer.next();
                System.out.println("Ingrese la editorial del libro:");
                String EditorialLibro;
                EditorialLibro = leer.next();
                Libro libro = new Libro(AutorLibro, EditorialLibro, libroPedir);
                Libreria.addPorPedir(libro);
                break;
            case 8 :
                Libro librop= new Libro("Autor", "Ed","nom");
                System.out.println("Estos son los libros que hacen falta pedir: ");
                Libreria.librosPorPedir();
                break;
                
            case 9 :
                System.out.println("Adiós...");
        }
        }while(opcion!=9);
   }
}
