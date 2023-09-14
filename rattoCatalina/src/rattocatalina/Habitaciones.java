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
public class Habitaciones {

    private double costo;
    private boolean ocupada;
    private Cliente cliente;

    public Habitaciones(boolean ocupada, double costo) {
        this.ocupada = ocupada;
        this.costo = costo;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    @Override
    public String toString(){
        return this.getCliente().toString();
    }

}
