package practica2;

import java.util.Scanner;
public class Ejercicio4bis {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        Persona [][] matriz=new  Persona[2][2];        
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {                 
                System.out.println("Ingrese nombre, edad, dni:");
                matriz[i][j]= new Persona (in.nextLine(),in.nextInt(),in.nextInt());                 
            }            
        }
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {                 
                System.out.println("Ingrese nombre, edad, dni:");
                if(matriz[i][j].getNombre().equals("zzz")){
                    System.out.println("encontra");
                }                 
            }            
        }
    }
}


