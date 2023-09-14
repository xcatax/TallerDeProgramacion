package practica1;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        int dig=0; int cantAutos=0; int total=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese la patente: ");
        int patente = in.nextInt();
        while (patente != 0 ){
                dig = (patente % 10);
                if ((dig % 2) == 0){
                    cantAutos++;
                    total++;
                    System.out.println("La patente puede pasar");
                }else{
                    total++;
                    System.out.println("No puede pasar");
                }
            System.out.println("Ingrese la patente: ");
            patente = in.nextInt();
        }   
        System.out.println("El porcentaje de autos que pudieron pasar es:"+ (cantAutos*100/total));
    }
}
