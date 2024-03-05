package Animal;

import java.time.LocalDate;

public class Animal {
    
    String nombre;
    LocalDate date;

    public Animal(String nombre, LocalDate date) {
        this.nombre = nombre;
        this.date = date;
    }
    
    public Animal(String nombre){
        this.nombre = nombre;
        LocalDate today = LocalDate.now();
        setDate(today);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
    
    public String toString (){
        return "Nombre: " +getNombre()+ " Edad: " +getDate();
    }
    
}
