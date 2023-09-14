package practica1;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String args []){
        int [][] matriz =new int [10][10];
        int num=0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                 matriz[i][j]=num;
                 num=num+2;
            }           
        }        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("|"+matriz[i][j]+"|");
            } 
            System.out.println();
        }
        
        int suma=0;
        for (int i=2;i<=9;i++){
            for(int j=0;j<=3;j++){
                suma=suma+matriz[i][j];
            }
        }
        System.out.println("La suma de la matriz es: "+suma);
        
        
        int [] vec= new int [10];
        for (int i = 0; i < 10; i++) {
            int sumoi =0;
            for (int j = 0; j < 10; j++) {
                sumoi=sumoi+matriz[i][j];
            }
            vec[i]=sumoi;
         }
        for (int i=0;i<10;i++){
        System.out.println("la suma de la columna "+i+ " es " + vec [i]);
        }
        
    Scanner in= new Scanner (System.in);
    System.out.println("");
    System.out.println("Ingrese numero a buscar ");
    int n=in.nextInt();
    
    boolean ok =false;
    int i=0, j=0;
    while((!ok)&&(i<10)){
        j=0;
        while((!ok) && (j<10)){
            if(n==matriz[i][j]){
                ok=true;
            }else{
                j=j+1;
            }
        }
        if(!ok){
            i++;
        }              
    }
    if(ok=true){
        System.out.println("se encontro el numero en la posicion i: "+ i + "j: "+ j);
    }else{
        System.out.println("no se encontro");
    }
        
    }
        
}
     

