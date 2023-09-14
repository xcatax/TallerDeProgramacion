package practica3;

public class Balanza {
    private double monto;
    private int cant;
    
    public void iniciarCompra(){
        monto=0;
        cant=0;
    }
    public void registrarProducto(double precioXkg, int pesoXkg){
        double aux= precioXkg*pesoXkg;
        monto=monto+aux;
        cant++;
    }
    
    public double devolverMonto(){
        return monto;
    }
    
    public String devolverResumen(){
        String aux;
        aux= "Total a pagar: " + monto + " compra de: "+cant+ " productos";  
        return aux;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }
    
    
    
}
