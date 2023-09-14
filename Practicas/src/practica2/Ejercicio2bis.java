package practica2;
import PaqueteLectura.Lector;
public class Ejercicio2bis {
    public static void main(String[] args){
        String [] v =new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese nombre: ");
            String nom=Lector.leerString();
            v[i]=nom;
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(v[i].charAt(0));
        }
        System.out.println(" ");
    }
}
