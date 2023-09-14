package practica5;
public class Circulo {
    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double CalcularArea(){
        return (Math.PI* (Math.pow(2, radio))); 
    }
    
    public double CalcularPerimetro(){
        return (2*Math.PI*radio);
    }
}
