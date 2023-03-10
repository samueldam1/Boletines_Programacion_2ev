
import java.util.ArrayList;
import java.util.Scanner;

public class Operaciones <T extends Comparable<T>> {
    // <>

    // Instanciar Scanner
    Scanner sc = new Scanner(System.in);
    
    // Calcula el elemento mínimo de la lista.
    public T minimo(ArrayList<T>lista_generica){
        
        /* Inicializamos la variable que guardará el elemento minimo 
        con el primer elemento de nuestro ArrayList */
        T min = lista_generica.get(0);
        
        //Busqueda en el ArrayList
        for (T i : lista_generica) {
            if (i.compareTo(min) < 0) {
                min = i;
            }
        }
        return min;
        
    }
    
    // Calcula el elemento máximo de la lista.
    public T maximo(ArrayList<T>lista_generica){
        
        /* Inicializamos la variable que guardará el elemento maximo 
        con el primer elemento de nuestro ArrayList */
        T max = lista_generica.get(0);
        
        //Busqueda en el ArrayList
        for (T i : lista_generica) {
            if (i.compareTo(max) > 0) {
                max = i;
            }
        }
        return max;
        
    }
    
    // Este método devuelve la posición de la primera aparición del Objeto buscado o -1 si no lo encuentra.
    public int buscarObjeto(ArrayList<T>lista_generica, T busqueda){
        
        // Inicializamos la variable de posicion 
        int posicion = 0;

        //Busqueda de 'obj' en el ArrayList
        for (T i:lista_generica){
            if (i.equals(busqueda)) {
                System.out.println("El objeto está en la posición: ");
                return posicion;
            }
            posicion++;
        }
        
        // Si no encuentra lo que buscamos retorna -1/
        System.out.println(busqueda + " no se ha encontrado.");
        return -1;
         
    }

    // Método genérico que borra la primeira aparición del Objeto dado y devuelve el objeto eliminado o null si no lo encuentra.
    public T borrar(ArrayList<T>lista_generica, T borrar){

        //Busqueda de 'obj' en el ArrayList
        for (T i:lista_generica){
            if (i.equals(borrar)) {
                lista_generica.remove(i);
                System.out.println("Se ha eliminado: ");
                return borrar;              
            }            
        }       
        
        // Si no encuentra lo que buscamos retorna null
        System.out.println("No se ha encontrado. " + borrar);
        return null;
    }

}
