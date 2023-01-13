public class Movil extends Terminal{

    private String tarifa;
    private double totalTarificado;
    

    public Movil(String numero, String tarifa) {
        super(numero);
        this.tarifa = tarifa;
        this.totalTarificado = 0;
        this.segundos = 0;
    }

    @Override
    public void llama(Terminal t,int s){

        super.llama(t, s);
        double min = s/60;

        switch (this.tarifa) {

            case "rata":
                this.totalTarificado += min * 0.06;
                break;
            case "mono":
                  this.totalTarificado += min * 0.12;
                  break;
            case "bisonte":
                  this.totalTarificado += min * 0.30;
                  break;
            default:
        }
    }

    @Override
    public String toString(){

        return "Nº " + this.getNumero() + " - " + this.getSegundos() + " s de conversacion - tarificados " + this.getTotalTarificado() +"euros";
    }

    public String getTarifa() {
        return tarifa;
    }

    public double getTotalTarificado() {
        return totalTarificado;
    }
    
}