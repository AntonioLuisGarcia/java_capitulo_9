class Tiempo{

    private int horas;
    private int minutos;
    private int segundos;

    public Tiempo(int horas, int minutos, int segundos){
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public int getHoras(){
        return horas;
    }

    public int getMinutos(){
        return minutos;
    }

    public int getSegundos(){
        return segundos;
    }

    public String toString(){
        
        String tiempo = "";

        if(horas != 0){
            tiempo = horas + " horas ";
        }

        if(minutos != 0){
            tiempo += minutos + " minutos "; 
        }

        if(segundos != 0){ 
            tiempo += segundos + " segundos";
        }

        return tiempo;
    }

    private int totalSegundos(Tiempo tiempo1){
        int totalDeSegundos = 0;

        totalDeSegundos += tiempo1.getHoras()*3600;
        totalDeSegundos += tiempo1.getMinutos()*60;
        totalDeSegundos += tiempo1.getSegundos();

        return totalDeSegundos;
    }

    private Tiempo segundosAHoryMin(int segundosTotales){
        
        int horas;
        int minutos;
        int segundos;

        horas = segundosTotales / 3600;
        segundosTotales -= horas * 3600;
        minutos = segundosTotales / 60;
        segundosTotales -= minutos * 60;
        segundos = segundosTotales;

        Tiempo tiempo = new Tiempo(horas, minutos, segundos);

        return tiempo;
    }

    public Tiempo suma(Tiempo tiempo2){

        Tiempo tiempo1 = new Tiempo(this.horas, this.minutos,this.segundos);
        
        int segundosTotales1 = totalSegundos(tiempo1); 
        int segundosTotales2 =  totalSegundos(tiempo2);
        
        Tiempo suma = segundosAHoryMin(segundosTotales1 + segundosTotales2);

        return suma;
    }

    public Tiempo resta(Tiempo tiempo2){
        
        Tiempo tiempo1 = new Tiempo(this.horas, this.minutos,this.segundos);
        
        int segundosTotales1 = totalSegundos(tiempo1); 
        int segundosTotales2 =  totalSegundos(tiempo2);
        
        Tiempo resta = segundosAHoryMin(segundosTotales1 - segundosTotales2);

        return resta;

    }
}