public class Boletin22 {
    
    public int[][] crearMatriz(){
       
        int filas = 3;
        int columnas = 3;
       
        int [][]goles = new int [filas][columnas];
       
        // Celta
        goles[0][0] = 3;
        goles[0][1] = 4;
        goles[0][2] = 2;
        // Bilbao
        goles[1][0] = 1;
        goles[1][1] = 2;
        goles[1][2] = 1;
        // Malaga
        goles[2][0] = 3;
        goles[2][1] = 0;
        goles[2][2] = 1;
       
        String[] equipos = {"Celta", "Bilbao", "Malaga"};

        /*
        for(int j=0;j<filas;j++){
           
            System.out.println("Jornada " + (j+1));
           
            for(int i=0;i<columnas;i++){
               
                System.out.println(goles[i][j]);
               
            }
           
        }*/
        
        return goles;
    
    }
    
    public void mostrar(int[][]goles, String[]equipos){
                
        for(int i=0;i<goles.length;i++){
           
            System.out.println("Jornada " + (i+1));
           
            for(int j=0;j<goles[i].length;j++){
               
                System.out.println(goles[i][j]);
               
            }
           
        }
        
    }
    
    public void ordenXgoles(int[][]goles, String[]equipos){
        //.
    }
        
    public void mas_goles(int[][]goles, String[]equipos){
        
        // Ordenar los equipos por número de goles
        for (int i = 0; i < goles.length; i++) {
            
            for (int j = i + 1; j < goles[i].length; j++) {
                
                int totalGolesI = 0;
                int totalGolesJ = 0;
                
                for (int k = 0; k < goles.length; k++) {
                    
                    totalGolesI += goles[i][k];
                    totalGolesJ += goles[j][k];
                    
                }
                
                if (totalGolesI > totalGolesJ) {
                    
                    // Intercambiar los equipos en la lista
                    String x = equipos[i];
                    equipos[i] = equipos[j];
                    equipos[j] = x;
                    
                }
            }
        }
    }
        
}
