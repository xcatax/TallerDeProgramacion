package practica4;
import PaqueteLectura.Lector;
public class Ejercicio4 {
    public static void main(String[]args){
        Micros m=new Micros("abc123","Mardel","5.3");
        System.out.println("Leer numero de pasajero: ");
        int n; 
        n = Lector.leerInt();        
        while((n != -1) && (m.estaLleno()==false)){
            if( m.validarAsiento(n)== true){
                if(m.estadoAsiento(n)==false){
                    m.ocuparAsiento(n);
                    System.out.println("El asiento "+ n+ " se ocupo correctamente");                    
                }else{
                    System.out.println("El asiento "+ n+ " estaba ocupado"+"esta libre el asiento: ");
                    n=m.primerAsientoLibre();
                    System.out.println(n);
                    m.ocuparAsiento(n);
                    System.out.println("El asiento "+n+ " se ocupo correctamente");
                }               
            }else{
                System.out.println("No es un n° valido de asiento");
            }
            System.out.println("");
            System.out.println("Ingrese numero de asiento: ");
            n = Lector.leerInt();
        }   
        System.out.println("");
        System.out.println("La cantidad de asientos ocupados en el micro es: "+ m.cantidadOcupados());
    }
}
            
                
            
  