class Pinguino extends Ave{


    public Pinguino(String sexo, String nombre) {
        super(sexo, nombre);
    }

    public void deslizar(){
        System.out.println(nombre + " se esta deslizando por el hielo" );
    }
}