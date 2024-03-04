package ejerciciointegrador;

public abstract class Pokemon {
    
    protected int numPokedex;
    protected String nombre;
    protected double peso;
    protected String sexo;
    protected int temporada;
    
    //Métodos abstractos
    protected abstract void atacar();
    protected abstract void atacarArañazo();
    protected abstract void atacarMordisco();
    
    
    
}
