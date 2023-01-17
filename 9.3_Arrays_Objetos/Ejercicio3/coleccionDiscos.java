/*
 * Ejercicio 3
 * 
 * Realiza el programa “Colección de discos” por tu cuenta, mirando lo menos posible el ejemplo que se proporciona. 
 * Pruébalo primero para ver cómo funciona y luego intenta implementarlo tú mismo.
 * 
 * @author Antonio Luis Garcia
 */

public class coleccionDiscos{
    public static void main(String[] args){

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

    }
}