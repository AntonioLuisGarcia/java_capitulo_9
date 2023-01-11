public class pruebaTiempo{
    public static void main(String[] args) {

        Tiempo tiempo1 = new Tiempo(15, 30, 40);
        Tiempo tiempo2 = new Tiempo(12, 55, 30);

        System.out.println(tiempo1.toString());
        System.out.println(tiempo1.suma(tiempo1));
        System.out.println(tiempo1.suma(tiempo2));
        System.out.println(tiempo1.resta(tiempo2));
        
    }
}