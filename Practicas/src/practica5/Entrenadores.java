/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5;


public class Entrenadores extends Empleados{
    private int cantidadGanados;

    public int getCantidadGanados() {
        return cantidadGanados;
    }

    public Entrenadores(int cantidadGanados, String nombre, int sueldoBasico) {
        super(nombre, sueldoBasico);
        this.cantidadGanados = cantidadGanados;
    }

   
    
     public double calcularSueldoACobrar(){
        double aux=super.getSueldoBasico();
        if((getCantidadGanados()>= 1) && (getCantidadGanados()<= 4)){
            aux+=5000;
        }else{
            if((getCantidadGanados()>=5)&&(getCantidadGanados()<=10)){
                aux+=30000;
            }else{
                if((getCantidadGanados()>=10)){
                    aux+=50000;
                }
            }
        }
        return aux;
     }
     
     public String toString(){
        return (super.toString() + ". Ganó "+getCantidadGanados()+ " campeonatos.");
    }
    
}
