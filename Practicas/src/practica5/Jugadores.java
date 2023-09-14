package practica5;

public class Jugadores extends Empleados{
    private int partidosGanados;
    private int golesAnotados;

    public int getPartidosGanados() {
        return partidosGanados;
    }

    public void setPartidosGanados(int partidosGanados) {
        this.partidosGanados = partidosGanados;
    }

    public int getGolesAnotados() {
        return golesAnotados;
    }

    public void setGolesAnotados(int golesAnotados) {
        this.golesAnotados = golesAnotados;
    }

    public Jugadores(int partidosGanados, int golesAnotados, String nombre, int sueldoBasico) {
        super(nombre, sueldoBasico);
        this.partidosGanados = partidosGanados;
        this.golesAnotados = golesAnotados;
    }

       
    public double promedioGoles(){
      return getGolesAnotados()/getPartidosGanados();
    }
    
    public double calcularSueldoACobrar(){
        double aux=super.getSueldoBasico();
        if(promedioGoles()>0.5){
            aux+=super.getSueldoBasico();
     }return aux;
    }
    
    public String toString(){
        return (super.toString() + ". Ganó "+getPartidosGanados()+ "con "+ getGolesAnotados()+"goles");
    }
        
}
