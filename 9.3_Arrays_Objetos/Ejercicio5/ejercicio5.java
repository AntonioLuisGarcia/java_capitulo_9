package Ejercicio5;
/*
 * Ejercicio 5
 * 
 * @author Antonio Luis Garcia
 */

import java.util.Scanner;

public class ejercicio5{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int opcion;
        int numerosStock = 2;

        Articulo[] lista = new Articulo[10];

        lista[0] = new Articulo(8, 1, "Television", 100, 200);
        lista[1] = new Articulo(17, 2, "Tocadiscos", 30, 70);

        do{

            System.out.println("1. Listado\n2. Alta\n3. Baja\n4. Modificación\n5. Entrada de mercancía\n6. Salida de mercancía\n7. Salir");
            opcion = sc.nextInt();

            switch(opcion){
                case 1: 

                    for(int i = 0 ; i < numerosStock ; i++){
                        System.out.println(lista[i]); 
                    }

                break;

                case 2:
                    numerosStock++;
                    lista[numerosStock-1] = new Articulo();
                    lista[numerosStock-1].setStock(sc.nextInt());
                    lista[numerosStock-1].setCodigo(sc.nextInt());
                    lista[numerosStock-1].setDescripcion(sc.next());
                    lista[numerosStock-1].setPrecioCompra(sc.nextInt());
                    lista[numerosStock-1].setPrecioVenta(sc.nextInt());
                
                break;

                case 3:

                    lista[sc.nextInt()].baja();
                
                break;

                case 4:

                    int eleccion = sc.nextInt();

                    lista[eleccion] = new Articulo();
                    lista[eleccion].setStock(sc.nextInt());
                    lista[eleccion].setCodigo(sc.nextInt());
                    lista[eleccion].setDescripcion(sc.next());
                    lista[eleccion].setPrecioCompra(sc.nextInt());
                    lista[eleccion].setPrecioVenta(sc.nextInt());

                break;

                case 5:

                    eleccion = sc.nextInt();
                    int aumento = sc.nextInt();

                    lista[eleccion].entradaMercancia(aumento);

                break;
                    
                case 6:
                    
                    eleccion = sc.nextInt();
                    aumento = sc.nextInt();

                    lista[eleccion].salidaMercancia(aumento);

                break;

                default:
                    
            }

        }while(opcion !=7);

        sc.close();
    }
}