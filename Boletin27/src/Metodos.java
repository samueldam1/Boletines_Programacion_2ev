
import com.samu.datos.PedirDatos;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Metodos {
    // Engadir. Engade un novo libro ao noso ficheiro.
    
    // Metemos en el Array 'libro_list' objetos tipo 'Libro'.
    public ArrayList<Libro> Engadir(ArrayList<Libro>libro_list){        
        // Instanciamos un objeto tipo libro
        Libro x = new Libro(PedirDatos.pedirString("Título: "),
                PedirDatos.pedirString("Autor: "),
                PedirDatos.pedirFloat("Precio: "),
                PedirDatos.pedirInt("Unidades: "));        
        
        // Lo añadimos al Array  
        libro_list.add(x);
        
        // Primero Creamos el Fichero
        File fichero = new File("/home/dam1/NetBeansProjects/FICHEROS/Libros.txt");
        
        try {
            if (fichero.createNewFile()) {
                System.out.println("El fichero ha sido creado.");
            } else {
                System.out.println("El fichero ya existe.");
            }
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al crear el fichero.");
        }
        
        // Segundo lo rellenamos        
        try {
            FileWriter writer = new FileWriter(fichero);
            
            writer.write("Título, Autor, Precio, Unidades;\n");
            // Este For recorre el ArrayList y escribe cada entrada en una linea
            for (Libro i:libro_list) {
            writer.write(i.getNombre_libro()+ ";" + " " + i.getAutor() + ", " + i.getPrecio() + ", " + i.getUnidades() + ".\n");
        }
            writer.close();
            System.out.println("El fichero ha sido modificado.");
            
        } catch (IOException e) {
            
            System.out.println("Ha ocurrido un error al modificar el fichero.");
            e.printStackTrace();
            
        }
        
        // Devolvemos el ArrayList
        return libro_list;
        
    }
    // DONE
    
    // Consultar. dado o título dun libro visualizar o seu precio . se o libro non o temos na librería visualizamos unha mensaxe
    public void Consultar(ArrayList<Libro>libro_list){       
        File fichero = new File("/home/dam1/NetBeansProjects/FICHEROS/Libros.txt");
        String busqueda = PedirDatos.pedirString("Introduzca el nombre del libro a buscar: ");
        int found = 0;
        try {
            Scanner scnr = new Scanner(fichero);
            while (scnr.hasNextLine()) {                
                String linea = scnr.nextLine();                
                // Todo lo que esté separado por un espacio (";") será considerado una palabra diferente por (x.split) y lo meteremos en un ArrayList tipo 'String'
                String[] palabras = linea.split(";");
                // Luego recorremos el ArrayList buscando 
                for (String i: palabras) {
                    if (i.equals(busqueda)) {
                        System.out.println(linea);
                        found++;
                        break;
                    }
                }             
            }
            scnr.close();
            if (found<1){
                System.out.println("Libro no encontrado.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("El fichero no se ha encontrado");
        }
    }
    
    // amosar. amosa  todos os datos do ficheiro
    public void Amosar(){
        File fichero = new File("/home/dam1/NetBeansProjects/FICHEROS/Libros.txt");

        try (FileReader fileReader = new FileReader(fichero);
        BufferedReader bf = new BufferedReader(fileReader)) {
            
            String linea;
            // LECTURA
            linea = bf.readLine();            
            while (linea !=null) {
                System.out.println(linea);
                linea = bf.readLine();
                // linea se vuelve bf.readLine, dejando de ser nulo
            }            
        } catch (IOException e) {            
            System.out.println("Ha ocurrido un error al leer el fichero.");            
        }
    }
    //DONE
    
    // borrar. borra os libros que teñan 0 unidades
    public void Borrar(ArrayList<Libro>libro_list){
        // No se puede borrar directamente un elemento del array 
        // mientras lo recorremos asi que usaremos un Iterador
        Iterator<Libro> it = libro_list.iterator();
        // Instanciamos un objeto iterador tipo 'Libro' usando nuestro ArrayList libro_list.        
        while (it.hasNext()) {
            Libro i = it.next();
            if (i.getPrecio() == 0){
                it.remove();
            }
        }
              
    }
    
    // modificar. modifica o precio dun libro determinado
    public void Modificar(ArrayList<Libro>libro_list){
        String busqueda = PedirDatos.pedirString("Introduzca el nombre del libro al que se le quiere modificar el precio: ");
        for (Libro i:libro_list){
            if(i.getNombre_libro().equals(busqueda)){
                double cambio = PedirDatos.pedirDouble("Introduzca el nuevo precio del libro: ");
                i.setPrecio(cambio);
                // Fijamos el precio a lo que introduzca el usuario.
            }
        }
    }
   
}
