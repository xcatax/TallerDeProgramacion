/*
3- Una escuela de música arma coros para participar de ciertos eventos. De los coristas se
conoce el nombre, el dni, la edad y el tono fundamental (un número entero). Del director
se conoce el nombre, el dni, la edad y la antigüedad (un número entero). Los coros poseen
un nombre y están formados por un director y una serie de coristas. Asimismo pueden
formarse de dos formas: o bien los coristas se colocan en el escenario uno al lado del otro
formando un semicírculo, o bien conforman hileras de la misma cantidad de coristas.
a. Implemente el modelo de clases teniendo en cuenta que los coros deberían crearse con
un director y sin ningún corista, pero sí sabiendo las dimensiones del coro.
b. Implemente métodos (en las clases donde corresponda) que permitan:
 agregar un corista a un coro.
o En el coro semicircular los coristas se deben ir agregando de izquierda
a derecha
o En el coro por hileras los coristas se deben ir agregando de izquierda a
derecha completando la hilera antes de pasar a la siguiente,
comenzando por la hilera de adelante.
 determinar si un coro está lleno o no. Devuelve true si el coro tiene a todos sus
coristas asignados o false en caso contrario.
 determinar si un coro (se supone que está lleno) está bien formado. Un coro
está bien formado si:
o En el caso del coro semicircular, de izquierda a derecha los coristas
están ordenados de mayor a menor en cuanto a tono fundamental.
o En el caso del coro por hileras, desde adelante hacia atrás los coristas
están ordenados de mayor a menor en cuanto a tono fundamental y
todos los miembros de una misma hilera tienen el mismo tono
fundamental.
 devolver la representación de un coro formada por el nombre del coro, todos
los datos del director y todos los datos de todos los coristas.
c. Escriba un programa que instancie un coro de cada tipo. Se deberá leer o bien la
cantidad de coristas (en el caso del coro semicircular) o la cantidad de hileras e
integrantes por hilera (en el caso del coro por hileras). Luego se deberá crear la
cantidad de coristas necesarios, leyendo sus datos, y almacenándolos en el coro.
Finalmente imprima toda la información de los coros indicando si están bien formados
o no.
 */
package ej3repaso;

import PaqueteLectura.Lector;
/**
 *
 * @author Gabriela
 */
public class Ej3Repaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaro variables
        Director d  = new Director(3, "Pepe", 12000000, 90);
        Corista c;
        
        Semicirculo c1;
        Hileras c2;
        
        System.out.println("Ingrese cantidad de coristas para el coro 1");
        int cantCoristas = Lector.leerInt();
        System.out.println("Ingrese cantidad de hileras para el coro 2");
        int cantHileras = Lector.leerInt();
        System.out.println("Ingrese cantidad de coristas por hilera para el coro 1");
        int cantCol = Lector.leerInt();
        
        int tono;
        String nombre;
        int dni;
        int edad;
        
        //creo los coros
        c1 = new Semicirculo(cantCoristas, "coro 1", d);
        c2 = new Hileras(cantHileras, cantCol, "coro 2", d);
        
        //leo los integrantes del coro 1
        for (int i=0; i<cantCoristas; i++){
            System.out.println("Ingrese el tono del corista " + i);
            tono = Lector.leerInt();
            System.out.println("Ingrese el nombre");
            nombre = Lector.leerString();
            System.out.println("Ingrese dni");
            dni = Lector.leerInt();
            System.out.println("Ingrese edad");
            edad = Lector.leerInt();
            c = new Corista(tono, nombre, dni, edad);
            c1.agregarCorista(c);
        }
        
        //agrego los integrantes del coro 2
        for (int i=0; i<(cantHileras*cantCol); i++){
            System.out.println("Ingrese el tono del corista " + i);
            tono = Lector.leerInt();
            System.out.println("Ingrese el nombre");
            nombre = Lector.leerString();
            System.out.println("Ingrese dni");
            dni = Lector.leerInt();
            System.out.println("Ingrese edad");
            edad = Lector.leerInt();
            c = new Corista(tono, nombre, dni, edad);
            c2.agregarCorista(c);
        }
        
        //imprimo
        System.out.println(c1.toString());
        System.out.println("Bien formado? " + c1.bienFormado());
        
        System.out.println(c2.toString()); //no puede llamar a Corista.toString()
        System.out.println("Bien formado? " + c2.bienFormado());
    }
    
}
