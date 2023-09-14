package practica3;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String [] args){
        Scanner in= new Scanner(System.in);
        Balanza b = new Balanza();        
        b.iniciarCompra();
        double peso;
        int precio;
        System.out.println("Ingrese peso: ");
        peso=in.nextDouble();
        
        while(peso !=0 ){
            System.out.println("Ingrese cantidad: ");
            precio=in.nextInt();
            b.registrarProducto(peso,precio);
            System.out.println("Ingrese peso: ");
            peso=in.nextDouble();
 
        }
        System.out.println(b.devolverMonto());
        System.out.println(b.devolverResumen());
    }
}
