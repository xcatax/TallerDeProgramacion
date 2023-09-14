/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        int factorial = 1,num;
        System.out.println("Ingrese el numero: ");
        int numero = in.nextInt();
        num = numero;
        while (numero != 0){
                    factorial = factorial * numero;
            numero--;
        }
        System.out.println("El resultado es: "+factorial);   
    }
        
}

