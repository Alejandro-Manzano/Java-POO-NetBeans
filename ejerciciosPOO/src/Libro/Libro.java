package Libro;


//Clase libro con: ISBN, titulo, autor, numero de paginas
//Crear gets y sets
//CRear toString "El libro <titulo> con <ISBN> creado por <autor> tiene <nºpags>"
//En el main crear dos objetos libro y mostrarlos por pantalla
//Indicar cual de los dos tiene mas paginas

public class Libro {
    
    int ISBN;
    String titulo;
    String autor;
    int numPags;

    public Libro(int ISBN, String titulo, String autor, int numPags) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPags = numPags;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPags() {
        return numPags;
    }

    public void setNumPags(int numPags) {
        this.numPags = numPags;
    }
    
    @Override
    public String toString(){
        return "El libro " +getTitulo()+ " con " +getISBN()+ " creado por " +getAutor()+ " tiene " +getNumPags();
    }
    
}
