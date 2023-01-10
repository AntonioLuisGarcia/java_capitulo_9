public abstract class Vehiculo{

    private static int kilometrosTotales;
    private static int vehiculosCreados;
    private int kilometrosRecorridos;

    Vehiculo(int kilometrosRecorridos, int vehiculosCreados){
        this.kilometrosRecorridos = kilometrosRecorridos;
        vehiculosCreados++;
    }

    public int getKilometrosRecorridos(){
        return kilometrosRecorridos;
    }

    public static int getKilometrosTotales(){
        return kilometrosTotales;
    }

    public void recorre(int distancia){
        Vehiculo.kilometrosTotales += distancia;
        this.kilometrosRecorridos += distancia;
    }

    public static int getVehiculosCreados() {
        return vehiculosCreados;
    }
}