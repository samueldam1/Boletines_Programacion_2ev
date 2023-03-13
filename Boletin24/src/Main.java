
import com.samu.datos.PedirDatos;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Libros>listaLibros = new ArrayList<>();
        
        Metodos obj = new Metodos();
        
        int option;
        
        do{
            option = PedirDatos.pedirInt("- MENÚ - \n"
                    + "1 --> Añadir libro.\n"
                    + "2 --> Mostrar libros.\n"
                    + "3 --> Borrar libros agotados. \n"
                    + "4 --> Buscar libro. \n"
                    + "5 --> SALIR");
            
            switch (option) {
                case 1:
                    obj.nuevoLibro(listaLibros);
                    break;
                case 2:
                    obj.borraLibro(listaLibros);
                case 3:
                    obj.ordenar(listaLibros);
                    obj.mostrarLibro(listaLibros);
                case 4:
                    obj.borrar_agotados(listaLibros);
                case 5:
                    obj.mostrarLibro(listaLibros);
            }
        }while(option<=6);
    }  
}