public class pruebaFraccion{
    public static void main(String[] args) {

        Fraccion fraccion1 = new Fraccion(4, 2);

        System.out.print(fraccion1.muestra()+" = "+ fraccion1.divide()+"\n");
        System.out.print("La fraccion inversa seria: "+fraccion1.invierte()+"\n");
        System.out.printf("Si multiplicamos en lugar de dividir da: %.0f",fraccion1.multiplica());
        
    }
}