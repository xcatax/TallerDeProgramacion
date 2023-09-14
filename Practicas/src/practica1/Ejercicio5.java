package practica1;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args){        
        double vec [];
        vec = new double[15];
        Scanner in = new Scanner(System.in);
        double total=0;
        //ingreso por teclado 15 alturas y voy recorriendo y cargando el vector con las alturas
        for (int i = 0; i < 14; i++) {
            System.out.println("Ingresar altura de jugador : ");
            double altura = in.nextDouble();
            vec[i]=altura ;            
            total=total+altura;
        }
        //promedio de de las alturas de los jugadores
        double promedio;
        promedio=total/15;        
        System.out.println("Promedio de todas las alturas: "+ promedio);
        
        //cantidad de jugadores mas altos que el promedio
        int cant=0;
        for (int i = 0; i < 14; i++) {         
            if(vec[i] > promedio){
                cant ++;
            }
        }
        System.out.println("Cantidad de jugadores con altura mayor que el promedio: "+ cant);
        
    }
    
}
