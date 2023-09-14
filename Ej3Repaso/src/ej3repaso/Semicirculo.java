/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej3repaso;

/**
 *
 * @author Gabriela
 */
public class Semicirculo extends Coro {
    private int cantC;
    private Corista[] cor;
    private int dl;

    public Semicirculo(int cantC, String nombre, Director dir) {
        super(nombre, dir);
        this.cantC = cantC;
        this.cor = new Corista[cantC];
        this.dl = 0;
    }
    
    @Override
    public void agregarCorista (Corista c){
        if (dl < cantC) //se supone que no ingresamos coristas de mas?
            cor[dl++]= c;
    }
    
    //mira el ultimo lugar del coro. como se llena en orde si el último está vacío es porque no está completo
    @Override
    public boolean lleno(){ 
        boolean aux = false;
        if (dl == cantC)
            aux = true;
        return aux;
    }
    
    @Override
    public boolean bienFormado(){ //se asume que el coro está lleno
        boolean aux = true;
        int i = 1;
        while ((i<dl) && (cor[i - 1].getTono() > cor[i].getTono())) //si estan en orden, avanzo
            i++;
        if (i != dl) //si no llegué al final es porque alguno no estaba en orden
            aux = false;
        return aux;
    }
    @Override
    public String toString(){
        String aux = super.toString() + "Sus coristas son: ";
        for (int i=0; i<(dl); i++)
            aux+= "(" + (i + 1) + ")" + cor[i].toString() + " ";
        return aux;
    }
}
