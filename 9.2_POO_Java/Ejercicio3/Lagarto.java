class Lagarto extends Animal{

    public Lagarto(String sexo, String nombre) {
        super(sexo, nombre);
    }

    public void mudarPiel(){
        System.out.println(nombre + " ha mudando de piel");
    }
    
}