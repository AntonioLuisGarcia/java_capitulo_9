public class Piramide{
    
    private int altura;
    private static int piramidesCreadas = 0;


    public Piramide(int altura) {
        this.altura = altura;
        piramidesCreadas++;
    }

    public String toString(){

        String piramide = "";

        for(int i = 1; i <= altura ; i++){
            for(int j = altura ; j > i ; j--){
                piramide += " ";
            }

            for(int j = 1 ; j<=2*i-1;j++){
                piramide += "*";
            }

            piramide += "\n";
        }

        return piramide;
    }

    public static int getPiramidesCreadas(){
        return piramidesCreadas;
    }
}