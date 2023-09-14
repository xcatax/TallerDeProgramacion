package practica1;

import PaqueteLectura.Lector;

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Ingrese lado 1:");
        double a=Lector.leerDouble();
        System.out.println("Ingrese lado 2:"); 
        double b=Lector.leerDouble();
        System.out.println("Ingrese lado 3:");
        double c=Lector.leerDouble();
        
        if( (a < (b+c)) & (b < (a+c)) & (c < (a+c))) {
                System.out.println("Triangulo valido");
        }
        else{
                System.out.println("Triangulo invalido");
        }  
    }      
                
    }

