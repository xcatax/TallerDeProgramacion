package practica4;
import PaqueteLectura.Lector;
public class Ejercicio5 {
    public static void main(String [] args){
        Flota flota= new Flota ();//INICIA FLOTA VACIA
        System.out.println("FLOTA CREADA");
        System.out.println("Ingrese Patente, Destino y Hora de salida del micro : ");
        Micros Micro = new Micros (Lector.leerString(),Lector.leerString(),Lector.leerString());
     
        while (!"zzz000".equals(Micro.getPatente()) && !flota.completa()){
            flota.agregar(Micro);
            System.out.println("Ingrese Patente, Destino y Hora de salida del siguiente micro : ");
            Micro = new Micros (Lector.leerString(),Lector.leerString(),Lector.leerString());
        }
        flota.Imprimir();//Controlo las flotas
        
        System.out.println("Ingresar la PATENTE a buscar ,si la encontramos Borraremos el micro!: ");
        String patente = Lector.leerString();//Cargo la patente ingresada en una variable PARA PODER REUTILIZARLA
        
        if ((flota.buscarMicroPorPatente(patente)) != null){
            flota.eliminarMicro(patente);
            System.out.println("Micro borrado");
        }
        else
            System.out.println("No exite el micro!");
        
        flota.Imprimir();//Controlo las flotas
        
        System.out.println("Ingrese destino a buscar: ");
        String destino = Lector.leerString();
        
        if ((flota.buscarMicroPorDestino(destino)) != null){
            System.out.println("La patente del micro que va a " +destino+ " es: " 
                    + flota.buscarMicroPorDestino(destino).getPatente()+ " y sale a las " + flota.buscarMicroPorDestino(destino).getHoraSalida()+ " horas." );
        }
        else
            System.out.println("No se encontro micro con ese destino");
          
    }      
 
}
