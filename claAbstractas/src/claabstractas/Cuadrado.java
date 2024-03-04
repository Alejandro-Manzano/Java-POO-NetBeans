package claabstractas;

//clase abstracta y hereda de Figura
//implements para interface
public class Cuadrado implements Figura, Dibujable{
    private double lado;

    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }
    
    
    @Override //sobrescritura
    public double calcularArea() {
        double resultado = lado*lado;
        return resultado;
    }

    @Override
    public void dibujar() {
        System.out.println("Hola estoy dibujando un cuadrado");
    }

    
}
