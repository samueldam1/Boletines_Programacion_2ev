public class Libro {
    String nombre_libro;
    String Autor;
    double Precio;
    int Unidades;

    public Libro(String nombre_libro, String Autor, double Precio, int Unidades) {
        this.nombre_libro = nombre_libro;
        this.Autor = Autor;
        this.Precio = Precio;
        this.Unidades = Unidades;
    }

    public String getNombre_libro() {
        return nombre_libro;
    }

    public void setNombre_libro(String nombre_libro) {
        this.nombre_libro = nombre_libro;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public int getUnidades() {
        return Unidades;
    }

    public void setUnidades(int Unidades) {
        this.Unidades = Unidades;
    }

    @Override
    public String toString() {
        return "Libro{" + "nombre_libro=" + nombre_libro + ", Autor=" + Autor +
                ", Precio=" + Precio + ", Unidades=" + Unidades + '}';
    }
    
}