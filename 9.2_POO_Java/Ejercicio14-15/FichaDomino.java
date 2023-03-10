public class FichaDomino{
    
    private int numeroUno;
    private int numeroDos;

    public FichaDomino(int numeroUno, int numeroDos){

        this.numeroUno = numeroUno;
        this.numeroDos = numeroDos;
    }

    public String toString(){
        return "[" + numeroUno + "|" + numeroDos +"]";
    }

    public FichaDomino voltea(){
        return new FichaDomino(numeroDos, numeroUno);
    }

    public boolean encaja(FichaDomino ficha){
        return (this.numeroDos == ficha.numeroUno) || (this.numeroUno == ficha.numeroUno) || (this.numeroDos == ficha.numeroDos) || (this.numeroUno == ficha.numeroUno);
    }

    public boolean encajaFila(FichaDomino ficha){
        return numeroDos == this.numeroUno;
    }

    public void setNumeroUno(int numeroUno) {
        this.numeroUno = numeroUno;
    }

    public void setNumeroDos(int numeroDos) {
        this.numeroDos = numeroDos;
    }
}