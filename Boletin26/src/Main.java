
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // Instanciar Scanner
        Scanner sc = new Scanner(System.in);
        
        // Instanciar clase Operaciones
        Operaciones op = new Operaciones<>();
        
        // Inicializar y llenar ArrayList
        ArrayList<Integer> lista_generica = new ArrayList<>();
            {
            lista_generica.add(2);
            lista_generica.add(3);
            lista_generica.add(4);
            lista_generica.add(8);
            lista_generica.add(10);
            }    
        System.out.println("Array creado");        

        // Inicializar variable para elegir en el switch-case.
        int i = 0;

        // Menu
        do{
            System.out.println("MENU\n"
                    + "1 - Calcular mínimo.\n"
                    + "2 - Calcular máximo.\n"
                    + "3 - Buscar elemento.\n"
                    + "4 - Borrar elemento.\n"
                    + "* - Para salir.");
            
            // Eleccion mediante Scanner
            i = sc.nextInt();
            System.out.println("");
            switch (i) {
                case 1:
                    System.out.println(op.minimo(lista_generica));
                    break;
                case 2:
                    System.out.println(op.maximo(lista_generica));
                    break;
                case 3:
                    System.out.println("Introduzca el objeto a buscar: ");
                    Integer busqueda = sc.nextInt();
                    System.out.println(op.buscarObjeto(lista_generica, busqueda));                    
                    break;
                case 4:
                    System.out.println("Introduzca el objeto a borrar: ");
                    Integer borrar = sc.nextInt();                  
                    System.out.println(op.borrar(lista_generica, borrar));
                    break;
                default:
                    System.out.println("Saliendo...");
                    break;
            }
            System.out.println("");            
        }while(i<5);   
        
    }
    
}
