/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej3repaso;

/**
 *
 * @author Gabriela
 */
public abstract class Integrante {
    private String nombre;
    private int dni;
    private int edad;

    public Integrante(String nombre, int dni, int edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }
    
    @Override
    public String toString(){
        String aux = nombre + ", dni " + dni + ", " + edad + " años ";
        return aux;
    }
}
