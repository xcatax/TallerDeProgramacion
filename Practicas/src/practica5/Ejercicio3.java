package practica5;

import PaqueteLectura.Lector;
public class Ejercicio3 {
    public static void main(String[]args){
        System.out.println("Ingrese nombre, dni y edad");
        Persona p=new Persona(Lector.leerString(),Lector.leerInt(),Lector.leerInt());
        System.out.println("Trabajador Tarea,  nombre, dni, edad: ");
        Trabajadores t=new Trabajadores(Lector.leerString(), Lector.leerString(),Lector.leerInt(),Lector.leerInt());
        
        System.out.println("Datos Persona"+p.toString());
        
        System.out.println("Datos trabajador"+t.toString());
    }
}
