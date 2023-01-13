public class Rectangulo{
    
    private int altura;
    private int anchura;
    private static int rectangulosCreados = 0;

    public Rectangulo(int altura, int anchura) {
        this.altura = altura;
        this.anchura = anchura;
        rectangulosCreados++;
    }

    public static int getRectangulosCreados(){
        return rectangulosCreados;
    }

    public String toString(){
        String rectangulo = "";

        for(int i = 1; i<=anchura; i++){
            for(int j = 1; j<= altura;j++){
                rectangulo += "*";
            }
            rectangulo += "\n";
        }

        return rectangulo;
    }
}