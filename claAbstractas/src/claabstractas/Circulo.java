package claabstractas;

public class Circulo implements Figura, Rotable, Dibujable{

    private double radio;
    
    public Circulo() {
        
    }

    public Circulo(double radio, double x, double y) {
        this.radio = radio;
    }
    
    @Override
    public double calcularArea() {
        double pi = 3.14;
        double resultado = pi*radio*radio;
        return resultado;
    }

    @Override
    public void rotar() {
        System.out.println("Hola estoy rotando un circulo");
    }

    @Override
    public void dibujar() {
        System.out.println("Hola estoy dibujando un circulo");
    }
    
}
