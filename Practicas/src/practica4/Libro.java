package practica4;

public class Libro {
    private String titulo;
    private Autor  primerAutor;
    private String editorial;
    private int añoEdicion;
    private int ISBN;

    public Libro(String titulo, Autor primerAutor, String editorial, int añoEdicion, int ISBN, double precio) {
        this.titulo = titulo;
        this.primerAutor = primerAutor;
        this.editorial = editorial;
        this.añoEdicion = añoEdicion;
        this.ISBN = ISBN;
        this.precio = precio;
    }
    private double precio;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getPrimerAutor() {
        return primerAutor;
    }

    public void setPrimerAutor(Autor primerAutor) {
        this.primerAutor = primerAutor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAñoEdicion() {
        return añoEdicion;
    }

    public void setAñoEdicion(int añoEdicion) {
        this.añoEdicion = añoEdicion;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String toString(){
        String aux;
        aux= titulo + " por " + primerAutor.getNombre() +" - "+ primerAutor.getBiografia()+ " - " + añoEdicion + " - " + " ISBN: " + ISBN + "  $"+ precio;
       return ( aux);
    }
}
