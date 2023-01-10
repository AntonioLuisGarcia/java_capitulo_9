class Coche extends Vehiculo{

    private int caballos;

    public Coche(int kilometrosRecorridos, int caballos) {
        super(kilometrosRecorridos, caballos);
        this.caballos = caballos;
    }

    public int getCaballos(){
        return caballos;
    }

    public void quemaRueda(){
        System.out.println("Ppphhhhhhhhhsssss");
    }
}