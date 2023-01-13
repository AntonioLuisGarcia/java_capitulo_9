public class CuentaCorriente{

    private long codigo;
    private double saldo;

    public CuentaCorriente(double saldo){

        this.saldo = saldo;
        this.codigo = (long)(Math.random()*(899999999)+100000000);
    }

    public CuentaCorriente(){
        this.saldo = 0;
        this.codigo = (long)(Math.random()*(899999999)+100000000);
    }

    public String toString(){
        return "Numero de cuenta: " + codigo + " Saldo: " + saldo;
    }

    public void ingreso(double aumento){
        saldo += aumento;
    }

    public void cargo(double decremento){
        saldo -= decremento;
    }

    public void transferencia(CuentaCorriente cuenta, double dinero){
        this.saldo -= dinero;
        cuenta.saldo += dinero;
    }
}