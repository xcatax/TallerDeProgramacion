/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rattocatalina;
/**
 * Realice un sistema para gestionar habitaciones de un hotel. El hotel tiene N
 * pisos y M habitaciones por piso. El sistema debe mantener en una estructura
 * adecuada los datos de las habitaciones: costo por día, si está ocupada y, en
 * ese caso, los datos del cliente que la ocupa (nombre y DNI).
 * Genere las clases necesarias. Provea constructores para iniciar el sistema para N pisos
 * y M habitaciones por piso, con cada habitación desocupada y con costo de 800
 * + 100*nro_de_piso_de_la_habitación. 
 * 2- Implemente los métodos necesarios, en las clases que corresponda, que permitan:
 *
 * Dado un cliente, ingresarlo en la primera habitación desocupada, comenzando
 * desde el primer piso. Retornar un String con nro. de piso y nro. de
 * habitación asignados. Asuma que hay una habitación desocupada. 
 * 
 * Obtener un
 * String con la representación del hotel, siguiendo el ejemplo: “Piso 1
 * Habitación 1: {costo – datos del cliente}; Piso 1 Habitación 2: {libre}; … ;
 * Piso 2 Habitación 1: {libre}; Piso 2 Habitación 2 {costo – datos del
 * cliente}; … ”
 *
 * 3- Realice un programa que instancie el sistema para 4 pisos y 2 habitaciones
 * por piso. Ingrese clientes al sistema. Para finalizar, imprima el resultado
 * del inciso 2. b.  *
 */
public class RattoCatalina {

    public static void main(String[] args) {
        Hotel h = new Hotel(4, 4);

        Cliente c1 = new Cliente("Juan", 2);
       
        Cliente c2 = new Cliente("pedro", 222);
       
        System.out.println(h.agregarEnElPrimeroLibre(c1));
        System.out.println(h.agregarEnElPrimeroLibre(c2));
        
        System.out.print(h.toString());
       /*  System.out.println("Retorna Piso: " +h.ingresarCliente(c1,1));
         System.out.println("Retorna Piso: " +h.ingresarCliente(c1,1));
         
         System.out.println("Retorna Piso: " +h.ingresarCliente(c1,1));
         System.out.println("Retorna Piso: " +h.ingresarCliente(c1,1));
         System.out.println("Retorna Piso: " +h.ingresarCliente(c1,1));
         
         System.out.println("Retorna Habit: " +h.ingresarClienteH(c1,1));
         System.out.println("Retorna Habit: " +h.ingresarClienteH(c1,1)+ "Piso 1");
         System.out.println("Retorna Habit: " +h.ingresarClienteH(c1,1) + "Piso 1");*/
         
        
        
    }

}
