public class TarjetaRegalo{
    
    private double saldo;
    private int id;

    public TarjetaRegalo(double saldo){
        this.saldo = saldo;
        id = (int)(Math.random()*89999+10001);
    }

    public String toString(){
        return "Tarjeta nº " + id + " - Saldo " + saldo;
    }

    public void gasta(double gasto){
        if(saldo-gasto < 0){
            System.out.println("No tiene suficiente saldo para gastar " + gasto);
        }else{
            saldo -= gasto;
        }
    }

    public TarjetaRegalo fusionaCon(TarjetaRegalo t1){
        
        double suma = t1.saldo + this.saldo;

        TarjetaRegalo t2 = new TarjetaRegalo(suma);
        return t2;
    }
}