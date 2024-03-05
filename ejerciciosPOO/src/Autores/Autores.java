package Autores;

public class Autores {
    
    String nombre;
    String email;
    String género;

    public Autores(String nombre, String email, String género) {
        this.nombre = nombre;
        this.email = email;
        this.género = género;
    }
    
    public void changeEmail(String email){
        setEmail(email);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGénero() {
        return género;
    }

    public void setGénero(String género) {
        this.género = género;
    }
    
    @Override
    public String toString(){
        return getNombre()+ " ("+getGénero()+") " +getEmail();
    }
    
    
}
