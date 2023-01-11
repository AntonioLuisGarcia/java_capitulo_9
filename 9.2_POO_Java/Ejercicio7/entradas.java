import java.util.Scanner;
public class entradas{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Principal zoPrincipal = new Principal(1000);
        CompraVenta zonaCompraVenta = new CompraVenta(300);
        Vip zonaVip = new Vip(20);

        int opcion = 0;
        int zonaelegida = 0;
        int cantidadEntradas = 0;

        do{

            System.out.println("1. Mostrar número de entradas libres \n2. Vender entradas \n3. Salir");
            opcion = sc.nextInt();

            if(opcion == 1){

                System.out.println("¿De que zona quieres? \n1. Zona Principal \n2. Zona Compra-venta \n3. Zona Vip");
                zonaelegida = sc.nextInt();
                
                if(zonaelegida == 1){
                    System.out.println("De la zona 1 quedan " + zoPrincipal.getEntradasPorVender() + " entradas");
                }
                
                if(zonaelegida == 2){
                    System.out.println("De la zona 2 quedan " + zonaCompraVenta.getEntradasPorVender() + " entradas");
                }
                
                if(zonaelegida == 3){
                    System.out.println("De la zona 3 quedan " + zonaVip.getEntradasPorVender() + " entradas");
                }
            }

            if(opcion == 2){

                System.out.println("¿De que zona quieres? \n1. Zona Principal \n2. Zona Compra-venta \n3. Zona Vip");
                zonaelegida = sc.nextInt();
                System.out.println("¿Cuantas entradas quieres?");
                cantidadEntradas = sc.nextInt();
                
                if(zonaelegida == 1){
                    zoPrincipal.vender(cantidadEntradas);
                }
                
                if(zonaelegida == 2){
                    zonaCompraVenta.vender(cantidadEntradas);
                }
                
                if(zonaelegida == 3){
                    zonaVip.vender(cantidadEntradas);
                }
            }

        }while(opcion !=3);

        sc.close();
    }
}