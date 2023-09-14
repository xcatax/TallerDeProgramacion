package practica5;


public abstract class Empleados {
    private String nombre;
    private int sueldoBasico;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public int getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(int sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }
    
    public Empleados(String nombre, int sueldoBasico) {
        this.nombre = nombre;
        this.sueldoBasico = sueldoBasico;
    }
    
    public String toString(){
       return ("El nombre es: "+getNombre()+" y su sueldo básico es: $"+getSueldoBasico());
   }
    
    public abstract double calcularSueldoACobrar();
    
}
