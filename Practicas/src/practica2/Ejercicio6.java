package practica2;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String [] args){
    Scanner in=new Scanner(System.in);
    //Partido partido = new Partido("Athletic", "Efil", 6,1);
    Partido [] vec = new Partido[3];
     
    for (int i = 0; i<3; i++){
        System.out.println("Ingresar equipo local, equipo visitante, goles del equipo local y goles del equipo visitante:");
        vec[i] = new Partido (in.next(),in.next(),in.nextInt(),in.nextInt());
        }
    int cantRiver=0;
    int total=0;
    int cantEmpate=0;
    
    for(int i=0;i<3;i++){
        if(vec[i].getGanador().equals("river")){
            cantRiver++;
        }
        if(vec[i].getLocal().equals("boca")){
            total=total+vec[i].getGolesLocal();
        }
        if(vec[i].empate()){
            cantEmpate++;
        }
         
    }
    double porcen=(cantEmpate*100/3);
    System.out.println("La cantidad de partidos que gano River es de: "+cantRiver);
    System.out.println("La cantidad de goles que hizo Boca de local es de: "+total);
    System.out.println("El porcentaje de partidos finalizados en empate es de: " + porcen);
          
    
    }
}

