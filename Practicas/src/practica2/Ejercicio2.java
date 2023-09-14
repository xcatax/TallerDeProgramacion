package practica2;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args){        
        Persona vec [] = new Persona [3];
        Scanner in= new Scanner(System.in);        
        for (int i = 0; i < 3; i++) {
            Persona p = new Persona();
            System.out.print("Ingrese nombre: ");
            p.setNombre(in.next());
            System.out.print("Ingrese dni: ");
            p.setDni(in.nextInt());
            System.out.print("Ingrese edad: ");
            p.setEdad(in.nextInt());
            vec[i]=p; //cargo en el vector
        }
        int cant=0; 
        for (int i=0; i<3; i++){            
            if(vec[i].getEdad()>65){
                cant++;
            }
        }                     
        System.out.println("la cantidad de personas mayores a 65 son: "+ cant);
        
        int min=9999;
        int aux=0;
        for (int i = 0; i < 3; i++) {
            if(vec[i].getDni() < min){
                min=vec[i].getDni();
                aux=i; 
            }            
        }
        System.out.println("La persona con menor dni es: "+vec[aux].getNombre());
    }
}
