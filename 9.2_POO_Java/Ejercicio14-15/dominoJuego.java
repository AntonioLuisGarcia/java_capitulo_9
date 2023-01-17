
public class dominoJuego{
    public static void main(String[] args){

        FichaDomino[] fichas = new FichaDomino[8];

        fichas[0] = new FichaDomino((int)(Math.random()*7), (int)(Math.random()*7));
        

        for(int i = 0 ; i < fichas.length ; i++){
            fichas[i] = new FichaDomino((int)(Math.random()*7), (int)(Math.random()*7));
        }

        for(int i = 1 ; i < fichas.length ; i++){
            do{
                fichas[i].setNumeroUno((int)(Math.random()*7));;
            }while(!fichas[i-1].encajaFila(fichas[i]));
        }

        for(int i = 0 ; i < fichas.length ; i++){

            System.out.print(fichas[i]+" ");
        }
    }
}