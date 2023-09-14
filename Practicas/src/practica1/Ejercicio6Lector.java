package practica1;

public class Ejercicio6Lector {
    public static void main(String[] args){
        int [][] matriz = new int[10][10];
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
        for (int i = 2; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                suma=suma+matriz[i][j]; 
               
            }
        }
        System.out.println(suma);
        
        int [] vec= new int[10];
        
        for (int j = 0; j < 10; j++) {
            int sumai=0;
            for (int i = 0; i < 10; i++) {
                sumai=sumai+matriz[i][j];   
            } 
            vec[j]=sumai;            
            System.out.println("la suma de la columna "+j+ " es " + sumai);
            //vec[i]=suma;
        }
        int valor = 198; //leer por teclado, estaba probando
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {              
                if(matriz[i][j]==valor){
                    System.out.println("se encontro el numero:"+ matriz[i][j] + "en la pos |"+ i+ "|"+ j+"|");
                    j=10;i=10;
                }
            }
                   
            }
        System.out.println("No se encontro el numero");
            
           
        }
    }
        
        

