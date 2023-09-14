/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej3repaso;

/**
 *
 * @author Gabriela
 */
public class Corista extends Integrante {
    private int tono;

    public Corista(int tono, String nombre, int dni, int edad) {
        super(nombre, dni, edad);
        this.tono = tono;
    }

    public int getTono() {
        return tono;
    }
    
    @Override
    public String toString(){
        String aux = super.toString() + "y su tono es " + tono + ". ";
        return aux;
    }
}
