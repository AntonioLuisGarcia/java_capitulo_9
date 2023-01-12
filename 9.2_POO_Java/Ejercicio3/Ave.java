public abstract  class Ave extends Animal{


    public Ave(String sexo, String nombre) {
        super(sexo, nombre);
    }

    public void volar(){
        System.out.println(nombre + " esta volando");
    }
    
    public void nacer(){
        System.out.println(nombre + " ha nacido");
    }

    public void caer(){
        System.out.println(nombre + " esta callendo");
    }
    
}