package practica4;

public class Flota {
    private Micros [] vecMicros;
    private int cantidadMicros;

    public Flota() { //Defina un constructor para crear una flota vacía(sin micros)
        vecMicros= new Micros [15];
        for (int i = 0; i < 15; i++) {
            vecMicros[i]= new Micros();            
        }
        cantidadMicros=0;
    }
    
    //devolver si la flota está completa (tiene 15 micros) o no.
    public boolean completa(){
      if(cantidadMicros ==15){
          return true;
      }  
      else
          return false;
    } 
    
    public void agregar(Micros m){
        vecMicros[cantidadMicros]=m;
        cantidadMicros++;
    }
    
    //eliminar de la flota el micro con patente igual a una recibida como parámetro.
    /*public void eliminar(String patente){
        for (int i = 0; i < 15; i++) {
            if(vecMicros[i].getPatente().equals(patente)){
                vecMicros[i] = vecMicros[i+1];
            }
            vecMicros[cantidadMicros -1]=null;
            cantidadMicros--;
            }
    }*/
    
    public void eliminarMicro(String pat){
        int i=0;
        while ((!vecMicros[i].getPatente().equals(pat)) && (i<= cantidadMicros)){
            i++;
        }    
        if (vecMicros[i].getPatente().equals(pat)){
            for (int j=i; j < cantidadMicros - 1; j++) {
                    vecMicros[j] = vecMicros[j+1];
            }
            vecMicros[cantidadMicros - 1] = null;  
            cantidadMicros--;
        }
    }
    
    public Micros buscarMicroPorPatente(String pat){
    Micros aux;
    int i=0;
    while ((i<cantidadMicros)&&(!vecMicros[i].getPatente().equals(pat))){
        i++;
    }
    if (pat.equals(vecMicros[i].getPatente())){
        aux=vecMicros[i];
        return aux;
    }
    aux=null;
    return aux;
    }
        
    
     /*public Micros buscarPorDestino(String Destino){
        Micros aux;
        for (int i = 0; i < 15; i++) {
            if(vecMicros[i].getDestino().equals(Destino)){
                System.out.print("encontre");
                aux= vecMicros[i];
                return aux;
            }            
        }
        aux=null;
        return aux;       
    }*/
    
    public Micros buscarMicroPorDestino(String dest){
        Micros aux;
        int i=0;
        while ((i<cantidadMicros)&&(!vecMicros[i].getDestino().equals(dest))){
            i++;
        }
        if (dest.equals(vecMicros[i].getDestino())){
            aux=vecMicros[i];
            return aux;
        }
        aux=null;
        return aux;
    }

    public void Imprimir (){
          System.out.println ("---------------------------------------------");
          for (int i = 0;i<cantidadMicros;i++){
              System.out.println("Micro en la pos : "+i+ " INFO: " + vecMicros[i].toString());
          }
          System.out.println ("---------------------------------------------");
      }
    
    
    
    
}
