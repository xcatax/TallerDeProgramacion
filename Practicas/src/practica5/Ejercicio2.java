package practica5;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
    Scanner in= new Scanner (System.in);
        
        System.out.println("Ingrese cantidad de partidos jugados, cantidad de goles, nombre del jugador y sueldo basico: ");
        Jugadores j= new Jugadores(in.nextInt(),in.nextInt(),in.next(),in.nextInt());
        System.out.println("");
        System.out.println("Ingrese cantidad de campeonatos ganados, nombre del entrenador y sueldo basico: ");
        Entrenadores e= new Entrenadores (in.nextInt(),in.next(),in.nextInt());
        System.out.println("");
        
        System.out.println("Datos del jugador: "+j.toString());
        
        System.out.println("El sueldo a cobrar por el jugador es: "+j.calcularSueldoACobrar());
        System.out.println("");
        System.out.println("Datos del entrenador: "+e.toString());
        System.out.println("El sueldo a cobrar por el entrenador es: "+e.calcularSueldoACobrar());
    }
}
