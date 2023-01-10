class Bicicleta extends Vehiculo{

    private int marchas;

    public Bicicleta(int kilometrosRecorridos, int marchas) {
        super(kilometrosRecorridos, marchas);
        this.marchas = marchas;
    }

    public int getMarchas(){
        return marchas;
    }

    public void caballito(){
        System.out.println("Mira como hago el caballito");
    }
}