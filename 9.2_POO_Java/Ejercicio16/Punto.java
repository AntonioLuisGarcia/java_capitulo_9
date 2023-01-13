public class Punto{
    private double coordenadaX;
    private double coordenadaY;

    public Punto(double coordenadaX, double coordenadaY){
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }

    public String toString(){
        return "(" + coordenadaX + ", " + coordenadaY + ")";
    }
}