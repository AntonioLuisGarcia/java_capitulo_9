public class Revista extends Publicacion{

    private int numeroSerie;

    public Revista(String isbn, String titulo, int anoSalida, int numeroSerie) {
        super(isbn, titulo, anoSalida);
        this.numeroSerie = numeroSerie;        
    }

    public String toString(){
        return "ISBN: " + isbn + ", título: " + titulo + ", año de publicación: " + anoSalida;
    }

    public int getNumeroSerie(){
        return numeroSerie;
    }
}