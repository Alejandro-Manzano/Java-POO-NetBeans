package Libro2;

import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        
        Autor autor = new Autor("Alefredo", "hjegjw@nled.ws", "masculino");
        Autor autor2 = new Autor("Ale", "hjegjw@nlrfceed.ws", "masculino");
 
    
        ArrayList<Autor> autores = new ArrayList<Autor>();
        autores.add(autor);
        autores.add(autor2);
        
        Libro libro = new Libro("Ha", autores, 5, 7); // Cambio 5.9 por 5,9
        
        System.out.println(libro.toString());
        
        
    }
    
}
