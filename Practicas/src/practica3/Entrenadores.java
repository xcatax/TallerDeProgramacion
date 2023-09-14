package practica3;
public class Entrenadores {
    private int sueldo;
    private String nombre;
    private int cantGanados;

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantGanados() {
        return cantGanados;
    }

    public void setCantGanados(int cantGanados) {
        this.cantGanados = cantGanados;
    }

    public Entrenadores(int sueldo, String nombre, int cantGanados) {
        this.sueldo = sueldo;
        this.nombre = nombre;
        this.cantGanados = cantGanados;
    }
        
    public int calcularSueldoACobrar(){
        int aux=sueldo;
        if ((cantGanados >= 1) && (cantGanados<= 4)){
            aux+=5000;
        }
        else{
             if((cantGanados >= 5 ) && (cantGanados <= 10)){
                aux+=30000;
             }
             else{ 
                    if(cantGanados > 10){
                        aux+=50000;
                    }
                }
            }
        return aux;
    }
    
    public Entrenadores(String nombre, int sueldo, int cantGanados) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.cantGanados = cantGanados;
    }
    
    public Entrenadores(){
        
    }
    
    
}
