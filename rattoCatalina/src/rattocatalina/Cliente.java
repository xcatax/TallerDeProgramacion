/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rattocatalina;

/**
 *
 * @author Cata
 */
public class Cliente {
    private String nombre;
    private int DNI;
   
    public Cliente(String nombre, int DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }
    
    @Override
    public String toString(){
        return "Nombre: " + this.getNombre()+ " Dni: " +this.getDNI()+" ";
    }
   
}

