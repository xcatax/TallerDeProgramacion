package practica1;

import java.util.Scanner;


public class Ejercicio4 {
        public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int factorial, num;       
        for (int i = 1; i < 10; i++) {
            num=i;
            factorial=1;
            while (num != 0){
                        factorial = factorial * num;
                num--;
            }
        System.out.println("El resultado es: "+ i +" factorial "+factorial);
        }
               
                    
        }
}
    