public class Libros implements Comparable{
     private String titulo;
     private String autor; 
     private String ISBN; 
     private double precio; 
     private int cantidad;

    public Libros() {
    }
     
    public Libros(String titulo, String autor, String ISBN, double precio, int cantidad) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public String getISBN() {
        return ISBN;
    }
    
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public int getCantidad() {
        return cantidad;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    @Override
    public String toString() {
        return "Libros{" + "titulo=" + titulo + ", autor=" + autor + ", ISBN=" + ISBN + ", precio=" + precio + ", cantidad=" + cantidad + '}';
    }  

    @Override
    public int compareTo(Object o) {
        Libros x = (Libros)o;
            if(this.titulo.compareTo(x.titulo)>0)
                return 1;
            else if (this.titulo.compareToIgnoreCase(x.titulo)<0)
                return -1;
            else 
                return 0;
    }

}