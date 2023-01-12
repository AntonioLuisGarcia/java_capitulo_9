/*
 * 
 * @author Antonio Luis Garcia
 */

public class pruebaAnimal{
    public static void main(String[] args) {

        Pinguino penguin = new Pinguino("macho", "Felipe");
        Canario miniCanario = new Canario("Hembra", "Carvajal", 3);
        Perro perrete = new Perro("Hembra", "Canela", 6, "Mastin");
        Lagarto lagar = new Lagarto("Macho", "Lagartineitor");

        penguin.deslizar();
        penguin.duerme();
        System.out.println();
        
        miniCanario.volar();
        miniCanario.caer();
        System.out.println();
        
        perrete.mostrarEdad();
        perrete.duerme();
        System.out.println();

        lagar.mudarPiel();
        lagar.come();
        lagar.duerme();
    }
}