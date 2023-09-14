package practica3;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        System.out.print("ingrese sueldo, nombre y camp ganados");
        Entrenadores e=new Entrenadores(in.nextInt(),in.next(),in.nextInt());
        
        System.out.println("El sueldo a cobrar por el entrenador "+e.getNombre()+" es: "+e.calcularSueldoACobrar());
        
    }
}
