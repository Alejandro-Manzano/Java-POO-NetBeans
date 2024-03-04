package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Lst {
    
    public static void main(String[] args) {
        
        List <Persona> lista= new ArrayList<Persona>();
    
        lista.add(new Persona(1, "Luis", 30));
        lista.add(new Persona(2, "L", 3));
        lista.add(new Persona(3, "Lu", 2));
        lista.add(new Persona(4, "Lui", 4));
        
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getNombre());
        }
        
        for (Persona persona : lista) {
            System.out.println(persona.getNombre());
        }
        
    }
    
   
    
}
