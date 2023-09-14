/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej3repaso;

/**
 *
 * @author Gabriela
 */
public class Hileras extends Coro {
    private int cantF;
    private int cantC;
    private Corista[][] cor;
    private int df; //agregué dimension logica a filas y columnas
    private int dc;

    public Hileras(int cantF, int cantC, String nombre, Director dir) {
        super(nombre, dir);
        this.cantF = cantF;
        this.cantC = cantC;
        this.cor = new Corista[cantF][cantC];
        this.df = 0;
        this.dc = 0;
    }
    
    @Override
    public void agregarCorista (Corista c){
        if (df < cantF){ //si no completé las filas
            if (dc == cantC){ //si estoy en el final de la fila paso a otra
                df++;
                dc = 0;
            }
            cor[df][dc++] = c;      
        }
    }
    
    @Override
    public boolean lleno(){ 
        boolean aux = false;
        if ((df == cantF) && (dc == cantC))
            aux = true;
        return aux;
    }
    
    @Override
    public boolean bienFormado(){ //al final lo hice en una sola recorrida, per no se si está bien. funciona.
        boolean aux = true;
        int c=1;
        int f=1;
        while((aux) && (f < df)){
            if (cor[f - 1][0].getTono() < cor[f][0].getTono())
                aux = false;
            while ((aux) && (c < dc)){
                if (cor[f - 1][c - 1].getTono() != cor[f - 1][c].getTono()) //voy recorriendo f - 1 para que arranque en 0
                    aux = false;
            }
        }
        return aux;
    }
    
    @Override
    public String toString(){
        String aux = super.toString() + "Sus coristas son: ";
        for (int f=0; f<cantF; f++){
            aux+= "(fila " + f + ")";
            for (int c=0; c<cantC; c++){
                aux+= "(" + c + ")" + cor[f][c].toString() + " ";
            }
        }
        return aux;
    }
}
