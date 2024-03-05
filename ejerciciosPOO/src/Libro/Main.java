package Libro;

public class Main {
    
    public static void main(String[] args) {
        
        Libro libro = new Libro(3, "Harry Potter", "Pit", 35);
        Libro libro2 = new Libro(3, "Gormiti", "Hugo", 67);
        
        System.out.println(libro.toString());
        
        if (libro.getNumPags() > libro2.getNumPags()) {
            System.out.println(libro.getTitulo() + " tiene mas pags");
        } else{
            System.out.println(libro2.getTitulo() + " tiene mas pags");
        }
        
    }
    
}
