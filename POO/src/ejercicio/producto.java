package ejercicio;

public class producto {
    
    //Crea una clase llamada Producto que represente un producto en una tienda.
    //Esta clase debe tener los siguientes atributos :
    //1- nombre (tipo String)
    //2- precio (tipo double)
    //3- stock (tipo int)
    //La clase debe tener los siguientes métodos públicos:
    //Un constructor que tome como parámetros el nombre, el precio inicial y el 
    //stock inicial del producto y los utilice para inicializar los atributos de la clase.
    //Métodos getters y setters para todos los atributos.
    
    String nombre;
    double precio;
    int stock;

    public producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }
    
    public void setStock(int stock) {
        this.stock = stock;
    }
    
    //Un método llamado reponer que tome como parámetro la cantidad de productos a reponer y
    //aumente el stock en esa cantidad.
    
    public void reponer(int cantidad){
        this.stock += cantidad;
        System.out.println("Se han repuesto " + cantidad + " unidades de " + this.nombre + ".");
    }
    
    //Un método llamado vender que tome como parámetro la cantidad de productos a vender y
    //actualice el stock después de la venta. Si la cantidad a vender es mayor que el stock 
    //disponible, debe imprimir un mensaje indicando que no hay suficiente stock.
    
    public void vender(int cantidad){
       if (cantidad <= this.stock) {
            this.stock -= cantidad;
            System.out.println("Se han vendido " + cantidad + " unidades de " + this.nombre + ".");
        } else {
            System.out.println("No hay suficiente stock de " + this.nombre + " para vender.");
        }
    }

}
