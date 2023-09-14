
package practica4;

public class Micros {
    private String patente;
    private String destino;
    private String horaSalida;    
    private boolean [] vec;
    private int cant;

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }
    //b)una patente, un destino y una hora de salida (recibidas como parámetro) y sin pasajeros.
    public Micros (String unaPatente, String unDestino, String unaHoraSalida){
        patente= unaPatente;
        destino= unDestino;
        horaSalida= unaHoraSalida;
        vec= new boolean[20];
        for (int i=0; i<20; i++){
            vec[i]= false;
        }
        cant=0;
    }
    
    public int cantidadOcupados(){
        for (int i = 0; i < 20; i++) {
            if(vec[i]=true){
                cant++;
            }
        }
        return cant;         
    }
     public boolean estaLleno(){
        int i=0;
        while ((i<20)&& (vec[i]==true)){
            i++;
        }    
        if (vec[i] == true){
            return true;
        }else
            return false;
    }
    /*
    public boolean estaLleno(){
        int auxT=0; 
        int auxF=0;
        for (int i=0;i<20;i++){
            if(vec[i]=true) {                
                auxT++;
            }
            else
                auxF++;
            
        }
        if(auxT == 20){
            return true; 
        }else
            return false; 
    }*/
    public boolean validarAsiento(int n){
        if ((n>=0)&& (n<20)){
            return true;
        }else
            return false;
    }
    
    public void ocuparAsiento(int n){
        if (n<20){
            if (vec[n] == false){
                vec[n]= true;
            }
        }
    }
    
    public void liberarAsiento(int n){
        if (n<20){
            if (vec[n] == true){
                vec[n]= false;
            }
        }
    }
    
    public int primerAsientoLibre(){
        int i = 0;
          while ((i <20) && (vec[i]== true)){
              i++;
          }
          if (vec[i]== false)
              return i;
          return i;
    }
    public boolean estadoAsiento(int n){
        if (vec[n]==true){
            return true;
        }else
            return false;
    }
    
    public Micros(){
    }
    
        public String toString (){
          String aux;
          aux = "Destino : " +destino+ " - Hora de Salida : " +horaSalida+ " - Patente del Micro : " +patente+ "" ;
          return aux; 
      }
    
    
}
    
