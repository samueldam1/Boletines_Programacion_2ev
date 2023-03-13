
import com.samu.datos.PedirDatos;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Libro>libro_list = new ArrayList<>();
        
        Metodos obj = new Metodos();
        
        int menu = 0;
        do{
            menu = PedirDatos.pedirInt("- MENÚ - \n"
                    + "1 --> Engadir libro.\n"
                    + "2 --> Consultar libros.\n"
                    + "3 --> Amosar todos os libros. \n"
                    + "4 --> Borrar libros agotados. \n"
                    + "5 --> Modificar prezo.\n"
                    + "6 --> SALIR");
            System.out.flush();
            switch (menu) {
                case 1:
                    //engadir
                    obj.Engadir(libro_list);
                    break;
                case 2:
                    //consultar
                    obj.Consultar(libro_list);
                    break;
                case 3:
                    //amosar
                    obj.Amosar();
                    break;
                case 4:
                    // borrar
                    obj.Borrar(libro_list);
                    break;
                case 5:
                    //modificar
                    obj.Modificar(libro_list);
                    break;
            }
            System.out.println("\n");
        }while(menu<6);
        System.out.println("Saliendo...");
    }
}
