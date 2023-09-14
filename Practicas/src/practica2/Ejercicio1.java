package practica2;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        Persona p = new Persona(); //necesito el constructor vacio
        //Persona persona = new Persona("Catalina",38425,25);
        //p.setDni(38426990);
        //p.setNombre("Catalina");
        //p.getNombre();
        //System.out.println(p.getNombre());
        //p.getDni();
        //System.out.println(p.getDni());
        //System.out.print(pe.getNombre()+pe.getDni()+pe.getEdad());
        System.out.println("Ingrese nombre: ");
        p.setNombre(in.nextLine());
        System.out.println("Ingrese dni: ");
        p.setDni(in.nextInt());
        System.out.println("Ingrese edad: ");
        p.setEdad(in.nextInt());
        System.out.println(p.toString());
    }
}
