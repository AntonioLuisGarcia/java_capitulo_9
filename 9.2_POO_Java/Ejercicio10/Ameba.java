public class Ameba{
    private int peso;

    public Ameba(){
        this.peso = 3;
    }

    public String toString(){
        return "Soy una ameba y peso " + peso + " microgramos.";
    }

    public void come(int comida){
        this.peso += comida - 1;
    }

    public void come(Ameba a1){
        this.peso += a1.peso - 1;
    }
}