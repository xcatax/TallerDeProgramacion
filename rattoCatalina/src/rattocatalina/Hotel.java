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
 * ese caso, los datos del cliente que la ocupa (nombre y DNI). * Genere las
 * clases necesarias. Provea constructores para iniciar el sistema para N pisos
 * y M habitaciones por piso, con cada habitación desocupada y con costo de 800
 * + 100*nro_de_piso_de_la_habitación.
 *
 * 2- Implemente los métodos necesarios, en las clases que corresponda, que
 * permitan:
 *
 * Dado un cliente, ingresarlo en la primera habitación desocupada, comenzando
 * desde el primer piso. * Retornar un String con nro. de piso y nro. de
 * habitación asignados.
 *
 * Asuma que hay una habitación desocupada. Obtener un String con la
 * representación del hotel, siguiendo el ejemplo: * “Piso 1 Habitación 1:
 * {costo – datos del cliente}; Piso 1 Habitación 2: {libre}; … ; Piso 2
 * Habitación 1: {libre}; Piso 2 Habitación 2 {costo – datos del cliente}; … ”
 *
 * 3- Realice un programa que instancie el sistema para 4 pisos y 2 habitaciones
 * por piso. Ingrese clientes al sistema. Para finalizar, imprima el resultado
 * del inciso 2. b.
 */
public class Hotel {

    private Habitaciones habitaciones[][];
    private int cantPisos;
    private int cantHabitaciones;

    public Hotel(int N, int M) {
        int i, j;
        this.cantPisos = N;
        this.cantHabitaciones = M;
        this.habitaciones = new Habitaciones[N][M];

        for (i = 0; i < this.cantPisos; i++) {
            for (j = 0; j < this.cantHabitaciones; j++) {
                this.habitaciones[i][j] = new Habitaciones(false, 800 + 100 * N);
            }
        }
    }

    public String agregarEnElPrimeroLibre(Cliente unCliente) {
        String aux = "";
        boolean encontre = false;
        int i = 0, j = 0;
        while ((i < this.cantPisos) && (!encontre)) {
            //Recorro la fila
            j = 0;
            while ((j < this.cantHabitaciones) && (!encontre)) {
                //i,j
                if ((habitaciones[i][j] != null) && (this.habitaciones[i][j].isOcupada() == false)) {
                    encontre = true;
                    habitaciones[i][j].setOcupada(true);
                    habitaciones[i][j].setCliente(unCliente);
                } else {
                    j++;
                }
            }
            if (!encontre) {
                i++;
            }
        }
        if (encontre) {
            aux = "Piso: " + (i + 1) + " Habitacion: " + (j + 1);
        }
        return aux;
    }

    public int ingresarCliente(Cliente cliente, int Y) {
        int i = 0;
        while (this.habitaciones[i][Y - 1].isOcupada() != false) {
            if (i < this.cantPisos) {
                i++;
            }
        }
        this.habitaciones[i][Y - 1].setCliente(cliente);
        this.habitaciones[i][Y - 1].setOcupada(true);
        return i;
    }

    public int ingresarClienteH(Cliente cliente, int nroHab) {
        int j = 0;
        while (this.habitaciones[nroHab - 1][j].isOcupada() != false) {
            if (j < this.cantHabitaciones) {
                j++;
            }
        }
        this.habitaciones[nroHab - 1][j].setOcupada(true);
        this.habitaciones[nroHab - 1][j].setCliente(cliente);
        return j;
    }

    /*     public int ingresarCliente(Cliente cliente, int nro){
        int j=0;
           while(this.habitaciones[nro-1][j].isOcupada() != false){
               if(j < this.cantHabitaciones){
                   j++;
               }
           }
           this.habitaciones[nro-1][j].setOcupada(true);
           this.habitaciones[nro-1][j].setCliente(cliente);
           return j;
        }

   
*/
    @Override
    public String toString() {
        String aux = "";
        for (int i = 0; i < this.cantPisos; i++) {
            for (int j = 0; j < this.cantHabitaciones; j++) {
                //i,j 
                aux = aux + "Piso " + (i+1) + " Habitacion " + (j+1);
                if (habitaciones[i][j].isOcupada()) {
                    
                    aux+= " Costo: " + habitaciones[i][j].getCosto() + "-" + habitaciones[i][j].toString() + "\n"; 
                } else {
                    aux+=": libre \n";
                }
            }
        }
        return aux;
    }
     
}
