package practica2;
import PaqueteLectura.Lector;
public class Ejercicio1bis {
    public static void main(String[] args){
    Persona p=new Persona();
    System.out.print("Ingrese nombre: ");    
    p.setNombre(Lector.leerString());
    //System.out.println (p.getNombre());
    System.out.print("Ingrese DNI: ");    
    p.setDni(Lector.leerInt());
    //System.out.println (p.getDni());
    System.out.print("Ingrese edad: ");    
    p.setEdad(Lector.leerInt());
    System.out.println (p.toString());
    
    }   
}
