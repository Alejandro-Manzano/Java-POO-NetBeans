package Autores;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Autores autor = new Autores("Juan", "juanito@juan.com", "masculino");
        
        System.out.println(autor.toString());
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Deseas cambiar el email");
        String respuesta = scanner.next();
        
        if (respuesta.equals("si")) {
            System.out.println("Introduce el nuevo email");
            String newEmail = scanner.next();
            autor.changeEmail(newEmail);
            System.out.println(autor.toString());
        } else{
            System.out.println("Acabaste");
        }
    }
    
}
