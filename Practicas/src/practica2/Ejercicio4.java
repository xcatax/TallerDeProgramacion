package practica2;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        //calendario donde se cargaran las personas
        Persona[][] calendario = new Persona[5][8];
        
        //creo un obj persona con los datos ingresados por teclado
        Persona p = crearPersona(in);        
        //indices de la Matriz
        int i = 0;
        int j = 0;
        
        while (!p.getNombre().equals("ZZZ") && (i<5 && j<8)){
            
            //itero sobre la columna y me muevo sobre la filas            
            while (j < 8 && !p.getNombre().equals("ZZZ"))
            {
                //meto la persona en la matriz
                calendario[i][j] = p;

                //leo una nueva persona
                p = crearPersona(in);                
                
                //me muevo en la fila
                j++;
            }
            //me muevo en la columna
            i++;
            //vuelvo al inicio de la fila
            j=0;            
        }
        in.close();     
        
        /*
        // El primer índice recorre las filas.
        for (int k = 0; k < 5; k++) {
            // El segundo índice recorre las columnas.
            for (int l = 0; l < 8; l++) {	
                // Procesamos cada elemento de la matriz.
                if (!calendario[k][l].equals(null)) {
                    System.out.println("dia " + k + "turno " + l);
                    System.out.println(calendario[k][l]);
                }
            }
        }
        */
        
        i = 0; j = 0;
        
        //no termino la matriz
        while ((i<5 && j<8) && calendario[i][j] != null){
            
            //itero sobre la columna y me muevo sobre la filas            
            while (j < 8 && calendario[i][j] != null )
            {
                System.out.println("dia: " + (i+1) + " turno " + (j+1));
                System.out.println(calendario[i][j]);            
                
                //me muevo en la fila
                j++;
            }
            //me mueva en la columna
            i++;
            //vuelvo al inicio de la fila
            j=0;            
        }
    }
    
    private static Persona crearPersona(Scanner in){
        System.out.println("Ingrese Nombre, edad y dni de la persona");
        return new Persona(in.next(), in.nextInt(), in.nextInt());
    }
    
    private static Persona crearPersonaV2(Scanner in){
        
        System.out.println("Ingrese Nombre, edad y dni de la persona");
        
        String nombre= in.next();
        int dni= in.nextInt();
        int edad= in.nextInt();    
        
        return new Persona(nombre,dni,edad);          
    }
}
