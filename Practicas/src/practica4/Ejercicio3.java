package practica4;
import PaqueteLectura.Lector;
public class Ejercicio3 {
    public static void main(String [] args){
        System.out.println("Ingrese nombre y biografia de Autor:");
        Autor a=new Autor(Lector.leerString(),Lector.leerString());
        System.out.println("Ingrese Titulo, Editorial, año edidion, codigo isbn , precio:");
        Libro l=new Libro(Lector.leerString(),a,Lector.leerString(), Lector.leerInt(),Lector.leerInt(),Lector.leerDouble());
        System.out.println(l.toString());
    }    
}
