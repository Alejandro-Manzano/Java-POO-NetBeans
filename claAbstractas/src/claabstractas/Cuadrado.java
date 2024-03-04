package claabstractas;

//clase abstracta y hereda de Figura
public class Cuadrado extends Figura{

    private double lado;

    public Cuadrado() {
    }

    public Cuadrado(double lado, double x, double y) {
        super(x, y);
        this.lado = lado;
    }
    
    
    @Override //sobrescritura
    public double calcularArea() {
        double resultado = lado*lado;
        return resultado;
    }
    
    
    
    
}
