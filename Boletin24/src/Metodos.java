
import com.samu.datos.PedirDatos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Metodos {
    
   public ArrayList<Libros> nuevoLibro(ArrayList<Libros>librolist){
        Libros x = new Libros(PedirDatos.pedirString("Título: "),PedirDatos.pedirString("Autor: "),PedirDatos.pedirString("ISBN: "),PedirDatos.pedirFloat("Precio: "),PedirDatos.pedirInt("Cantidad: "));
        librolist.add(x);
        
        return librolist;        
    }
    
   public void borraLibro(ArrayList<Libros>librolist){
        int found = 0;
        String busqueda = PedirDatos.pedirString("ISBN del libro a borrar.");
        for (Libros elemento:librolist){
                if (elemento.getISBN().equals(busqueda)){
                    System.out.println("El libro con ISBN: " + elemento.getISBN() + " ha sido borrado.");
                    Iterator it = librolist.iterator();
                    it.remove();
                    found = 1;
                }
            }
        if(found == 0)
            System.out.println("No se ha encontrado.");
    } 
    
   public void ordenar(ArrayList<Libros>librolist){
        Collections.sort(librolist);
    }
        
   public void borrar_agotados(ArrayList<Libros>librolist){
       
        for (Libros elemento:librolist){
                if (elemento.getCantidad()==0){
                    System.out.println(elemento.getTitulo() + " ha sido descatalogado.");
                    Iterator it = librolist.iterator();
                    it.remove();
                }
            }
        System.out.println("Fin.");
   }
   
   public void mostrarLibro(ArrayList<Libros>librolist){
       
       String busqueda = PedirDatos.pedirString("Introduzca el titulo a buscar.");
        for (Libros elemento:librolist){
            if (elemento.getTitulo().equals(busqueda));
                System.out.println("Título: " + elemento.getTitulo()
                                    + "Autor: " + elemento.getAutor()
                                    + "ISBN: " + elemento.getISBN()
                                    + "Precio: " + elemento.getPrecio()
                                    + "Cantidad: " + elemento.getCantidad());
        }
   }
}