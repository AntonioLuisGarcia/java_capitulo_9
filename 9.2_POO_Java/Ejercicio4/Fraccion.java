class Fraccion{

    private float numerador;
    private float denominador;

    public Fraccion(float numerador, float denominador){
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public float multiplica(){
        return numerador*denominador;
    }

    public float divide(){
        return numerador/denominador;
    }

    public float invierte(){
        return denominador/numerador;
    }

    public String muestra(){
        return numerador + "/" + denominador;
    }
}