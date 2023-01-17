/*
 * Ejercicio 2
 * 
 * Cambia el programa anterior de tal forma que los datos de los gatos se introduzcan directamente en el código de la forma 
 * gatito[2].setColor("marrón") o bien mediante el constructor, de la forma gatito[3] = new Gato("Garfield", "naranja", "macho"). 
 * Muestra a continuación los datos de todos los gatos utilizando un bucle.
 * 
 * @author Antonio Luis Garcia
 */

import java.util.Scanner;

public class pruebaGatos2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Gatitos[] gatos = new Gatitos[4];

        gatos[0] = new Gatitos("Blanquito",5,"Siames");
        gatos[1] = new Gatitos("Garfield",10,"Persa");
        gatos[2] = new Gatitos("Paco",2,"Mini");
        gatos[3] = new Gatitos("Pantera",13,"Abisinio");

        for (int i = 0; i < 4; i++) {
            System.out.println("\nGato nº" + (i + 1));
            System.out.println("Nombre: " + gatos[i].getNombre());
            System.out.println("Color: " + gatos[i].getEdad());
            System.out.println("Raza: " + gatos[i].getRaza());
          }

        sc.close();
    }
}