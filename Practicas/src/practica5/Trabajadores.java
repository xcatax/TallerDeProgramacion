
package practica5;

public class Trabajadores extends Persona {
    private String tarea;

    public String getTarea() {
        return tarea;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }

    public Trabajadores(String tarea, String nombre, int dni, int edad) {
        super(nombre, dni, edad);
        this.tarea = tarea;
    }
    
    public String toString(){
       return (super.toString()+" Soy "+ getTarea());
   }
    
    
}
