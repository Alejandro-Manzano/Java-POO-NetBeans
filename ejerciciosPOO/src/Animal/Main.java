package Animal;

import java.time.LocalDate;

public class Main {
    
    public static void main(String[] args) {
        Animal animal = new Animal("Sebas", LocalDate.of(2009, 1, 10));
        Animal animal2 = new Animal("Juan");
        
        System.out.println(animal.toString());
        System.out.println(animal2.toString());
    }
    
}
