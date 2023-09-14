
package practica1;
import PaqueteLectura.Lector;
public class Teoria1 {
    public static void main(String[] args){
        System.out.print("Ingrese nombre: ");
        String nombre = Lector.leerString();
        System.out.println(nombre);
        int i;
        for (i=1; i<= 10; i++)
            System.out.println("Primero: "+i);
        
        for (i=1; i<= 10; i=i+2)
            System.out.println("Medio: "+i);
        
        for (i=10; i > 0; i--)
            System.out.println("Ultimo: "+i);
    }
}
