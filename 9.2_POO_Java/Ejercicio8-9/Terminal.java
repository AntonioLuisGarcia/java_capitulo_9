 public class Terminal {
    
    private String numero;
    protected int segundos;

    public Terminal(String numero) {
        this.numero = numero;
        this.segundos = 0;
    }

    public String toString(){
        return "Nº " + numero + " - " + segundos + " s de conversacion";
    }

    public void llama(Terminal t, int s){
        this.segundos += s;
        t.segundos += s;
    }

    public String getNumero() {
        return numero;
    }

    public int getSegundos() {
        return segundos;
    }
}
