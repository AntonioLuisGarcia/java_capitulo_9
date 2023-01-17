/*
 * Ejercicio 1
 * 
 * Utiliza la clase Gato para crear un array de cuatro gatos e introduce los datos de cada uno de ellos mediante
 * un bucle. Muestra a continuación los datos de todos los gatos utilizando también un bucle.
 * 
 * @author Antonio Luis Garcia
 */

import java.util.Scanner;

public class pruebaGatos{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Gato[] gatos = new Gato[4];

        for(int i = 0 ; i < 4 ; i++){

            gatos[i] = new Gato();

            System.out.print("Nombre: ");
            gatos[i].setNombre(sc.next());
            System.out.print("Raza: ");
            gatos[i].setRaza(sc.next());
            System.out.print("Edad: ");
            gatos[i].setEdad(sc.nextInt());
        }

        for (int i = 0; i < 4; i++) {
            System.out.println("\nGato nº" + (i + 1));
            System.out.println("Nombre: " + gatos[i].getNombre());
            System.out.println("Color: " + gatos[i].getEdad());
            System.out.println("Raza: " + gatos[i].getRaza());
          }

        sc.close();
    }
}