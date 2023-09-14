package practica2;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        String vec[]= new String[4];
        String palabra;
        for (int i = 0; i < 4; i++) {
            System.out.print("Ingrese Palabra: ");
            palabra=in.next();
            vec[i]=palabra;
        }
        for (int i = 0; i < 4; i++) {
            System.out.print(vec[i].charAt(0));       
        }
        System.out.println();
        
    }
}
