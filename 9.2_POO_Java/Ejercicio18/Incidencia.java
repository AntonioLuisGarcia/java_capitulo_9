public class Incidencia{
    
    private int codigo;
    private int puesto;
    private String motivo;
    private String estado;
    private String frase;

    private static int pendientes;
    private static int numeroIncidencias;

    public Incidencia(int puesto, String motivo) {
        numeroIncidencias++;
        this.codigo = numeroIncidencias;
        this.puesto = puesto;
        this.motivo = motivo;
        this.estado = "Pendiente";
        this.frase = "Incidencia " + codigo + " - Puesto: " + puesto + " - " + motivo + " - " + estado;
        pendientes++;
    }

    public static int getPendientes(){
        return pendientes;
    }

    public String toString(){
        return frase;
    }

    public void resuelve(String arreglo){
        estado = "Resuelto";
        pendientes--;
        frase = "Incidencia " + codigo + " - Puesto: " + puesto + " - " + motivo + " - " + estado + " - " + arreglo;
    }

    
}