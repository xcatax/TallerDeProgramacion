/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej3repaso;

/**
 *
 * @author Gabriela
 */
public abstract class Coro {
    private String nombre;
    private Director dir;

    public Coro(String nombre, Director dir) {
        this.nombre = nombre;
        this.dir = dir;
    }
    
    @Override
    public String toString(){
        String aux = "Nombre del coro: " + nombre + ", director: " + dir.toString();
        return aux;
    }
    
    public abstract void agregarCorista (Corista c);
    
    public abstract boolean lleno();
    
    public abstract boolean bienFormado();
    
}
