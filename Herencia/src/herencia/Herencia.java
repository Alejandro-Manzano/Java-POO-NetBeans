package herencia;

public class Herencia {
    
    public static void main(String[] args) {
        
        Empleado emple = new Empleado();
        
        //método propio
        emple.getNum_legajo();
        //Método heredado de persona
        emple.getNombre();
        
        Consultor consul = new Consultor();
        consul.getNum_consultor();
        consul.getApellido();
        
    }
    
}
