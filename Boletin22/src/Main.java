public class Main {

    public static void main(String[] args) {
       
        Boletin22 obj = new Boletin22();
       
        int [][]goles = obj.crearMatriz();
        
        String[] equipos = {"Celta", "Bilbao", "Malaga"};
        
        obj.ordenXgoles(goles, equipos);
        
        obj.mostrar(goles, equipos);
        
        //obj.maximo_goleador(goles);
        
        //obj.consultas(goles);
       
    }
}