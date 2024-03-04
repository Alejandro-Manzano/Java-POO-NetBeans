
package ejercicio;

public class principalProducto {
    
    public static void main(String[] args) {
        
        // Crear un producto
        producto producto1 = new producto("Camiseta", 20.0, 10);

        // Mostrar información inicial
        System.out.println("Producto: " + producto1.getNombre());
        System.out.println("Precio: $" + producto1.getPrecio());
        System.out.println("Stock: " + producto1.getStock());

        // Reponer productos
        producto1.reponer(5);
        System.out.println("Nuevo stock: " + producto1.getStock());

        // Vendiendo los 15 productos que tengo
        producto1.vender(15);

        
        // Intentando vender productos qu eno tengo
        producto1.vender(8);
        System.out.println("Nuevo stock: " + producto1.getStock());
        
    }
    
}
