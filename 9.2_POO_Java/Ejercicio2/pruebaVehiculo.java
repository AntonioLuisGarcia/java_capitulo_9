
import java.util.Scanner;
public class pruebaVehiculo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int opcion;
        int km;

        Bicicleta bici = new Bicicleta(0,5);
        Coche coche1 = new Coche(0,200);

        do{

            System.out.println("\n1. Anda con la bicicleta");
            System.out.println("2. Haz el caballito con la bicicleta");
            System.out.println("3. Anda con el coche");
            System.out.println("4. Quema rueda con el coche");
            System.out.println("5. Ver kilometraje de la bicicleta");
            System.out.println("6. Ver kilometraje del coche");
            System.out.println("7. Ver kilometraje total");
            System.out.println("8. Salir");
            System.out.println("Elige una opción (1-8): ");
            opcion = sc.nextInt();

            switch(opcion){
                case 1:
                    System.out.println("Cuantos km vas a recorrer");
                    km = sc.nextInt();
                    bici.recorre(km);
                break;

                case 2:
                    bici.caballito();
                break;

                case 3:
                    System.out.println("Cuantos km vas a recorrer");
                    km = sc.nextInt();
                    coche1.recorre(km);
                break;

                case 4:
                    coche1.quemaRueda();
                break;

                case 5:
                    System.out.println("La bici ha recorrido "+ bici.getKilometrosRecorridos()+ " km");
                break;

                case 6:
                    System.out.println("El coche ha recorrido "+ coche1.getKilometrosRecorridos()+ " km");
                break;

                case 7:
                    System.out.println("Los km totales son: "+ Vehiculo.getKilometrosTotales());
                break;
            }

        }while(opcion<8 && opcion>0);


        sc.close();
    }
}