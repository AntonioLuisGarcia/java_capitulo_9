public class Linea{

    private Punto p1;
    private Punto p2;
    
    public Linea(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public String toString(){
        return "Linea formada por los puntos " + p1.toString() + " y " + p2.toString();
    }
    
}