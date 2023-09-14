/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej3repaso;

/**
 *
 * @author Gabriela
 */
public class Director extends Integrante {
    private int ant;

    public Director(int ant, String nombre, int dni, int edad) {
        super(nombre, dni, edad);
        this.ant = ant;
    }
    
    @Override
    public String toString(){
        String aux = super.toString() + "y una antiguedad de " + ant + "años. ";
        return aux;
    }
}
