package practica4;

public class Autor {
  private String nombre;
  private String biografia;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBigrafia(String bibliografia) {
        this.biografia = bibliografia;
    }
     public Autor(String unNombre,String unBiografia){
        nombre=unNombre;
        biografia=unBiografia;
 }  
}
