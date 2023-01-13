public class Libro extends Publicacion{

    private boolean estaPrestado;

    public Libro(String isbn, String titulo, int anoSalida) {
        super(isbn, titulo, anoSalida);
        estaPrestado = false;
    }

    public boolean estaPrestado(){
        return estaPrestado;
    }

    public String toString(){
        if(estaPrestado()){
            return "ISBN: " + isbn + ", título: " + titulo + ", año de publicación: " + anoSalida +  "(prestado)";
        }
        return "ISBN: " + isbn + ", título: " + titulo + ", año de publicación: " + anoSalida +  "(no prestado)";
    }

    public void presta(){
        if(estaPrestado()){
            System.out.println("Lo siento, este libro ya se ha prestado.");
        }else{
            estaPrestado = true;
        }
    }

    public void devuelve(){
        estaPrestado = false;
    } 


}