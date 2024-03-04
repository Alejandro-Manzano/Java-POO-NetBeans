package herencia;

public class Herencia {
    
    public static void main(String[] args) {
        
        //Polimorfosis para un array
        
        Persona vector[] = new Persona[5];
        vector [0] = new Persona();
        vector [1] = new Empleado();
        vector [2] = new Consultor();
        vector [3] = new Jefe();
        
        Persona perso = new Persona();
        Consultor cons = new Consultor();
        
        //permite de padre a hijo
        perso = cons;
        //pero no de hijo a padre
        //cons = perso;
        
    }
    
}
