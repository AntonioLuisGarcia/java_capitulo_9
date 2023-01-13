abstract public class Publicacion{
    
    protected String isbn;
    protected String titulo;
    protected int anoSalida;

    public Publicacion(String isbn, String titulo, int anoSalida) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anoSalida = anoSalida;
    }
}