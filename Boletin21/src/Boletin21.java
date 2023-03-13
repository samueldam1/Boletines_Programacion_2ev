
import com.samu.datos.PedirDatos;
import java.util.Arrays;

public class Boletin21 {
    
    static int tam = 0;
    
    // Ej 1
    public void createArray(){
       int[]numeros = new int [50];
       int i;
       for(i=0;i<numeros.length;i++){
           numeros[i] = (int) (Math.random()*50+1);
       }
       tam = i;
        System.out.println(tam);
       for(i=tam;i>0;i--){
           System.out.println(numeros[i-1]);
       }
    }
    //Ej 2
    public void notasArray(){
       int i;
       int total=0;
       int aprobado=0;
       int suspenso=0;
       int high = 0;
        
       int[]notas = new int [30];
       
       for(i=0;i<notas.length;i++){
           notas[i] = (int) (Math.random()*11);           
       }
       
       for(i=0;i<notas.length;i++){
           if(notas[i]>=5)
               aprobado++;
           else
               suspenso++;
           total = total + notas[i];
       }
       System.out.println(aprobado+" aprobados y "+suspenso+" suspensos.");
       
       float media = total/notas.length;
       System.out.println("La media de la clase es de: "+media);
       
       // Ordenar array
       Arrays.sort(notas);
       
       for(i=0;i<notas.length;i++){
           if(notas[i]>high){
               high = notas[i];                       
           }               
       }
       System.out.println("La nota más alta es: "+high);      
       
       // Ej 3
        
       String[]nombres = new String [3];
       for(i=0;i<nombres.length;i++){
           nombres[0] = "Ibai";
           nombres[1] = "Juan";
           nombres[2] = "Pepe";
       }
       
       // Visualiza a nota dun alumno determinado
       
       String busqueda = "Juan";
       for(i=0;i<nombres.length;i++){
            if(busqueda.equals(nombres[i])){
                System.out.println(nombres[i]+" tiene un: "+notas[i]);
            }
       }
       
       // Visualiza unha lista co nome dos alumnos aprobados.
       
       System.out.println("Aprobados:");
       for(i=0;i<nombres.length;i++){
           if(notas[i]>=5)
               System.out.println(nombres[i]);            
       }
       
       // Fai unha lista ordenada por orden crecente de notas
       int auxNota;
       String auxNombre;
       for(i=0;i<notas.length;i++){
            for(int j=i+1;j<nombres.length;j++){
                if(notas[i]<notas[j]){
                    auxNota = notas[i];
                    auxNombre = nombres[j];
                    
                    notas[i] = notas[j];
                    nombres[i] = nombres[j];
                    
                    notas[i] = auxNota;
                    nombres[j] = auxNombre;
                }
            }       
        }
        System.out.println("Notas ordenadas:");
       for(i=0;i<notas.length;i++){
           System.out.println(notas[i]+" ");
       }
       
       // Visualiza a nota dun alumno determinado que pides por teclado
       
       busqueda = PedirDatos.pedirString("Nombre del alumno.");
       for(i=0;i<nombres.length;i++){
            if(busqueda.equals(nombres[i])){
                System.out.println(nombres[i]+" tiene un: "+notas[i]);
            }
        }
       
    }
    /* Ej 4 
    public void letraNIF(){
        char[] letra = {]
        char letra = letra[nif%23];
        System.out.println(nif+" "+letra);
    
        
    }*/
}