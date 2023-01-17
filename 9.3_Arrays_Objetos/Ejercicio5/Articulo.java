package Ejercicio5;

public class Articulo{
    
    private int stock;
    private int codigo;
    private String descripcion;
    private double precioCompra;
    private double precioVenta;

    public Articulo(int stock, int codigo, String descripcion, double precioCompra, double precioVenta) {
        this.stock = stock;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
    }

    public Articulo(){
        this.codigo = 0;
    }
    
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }
    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }
    
    public double getPrecioVenta() {
        return precioVenta;
    }
    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String toString() {

        String cadena = "------------------------------------------";

        cadena += "\nCódigo: " + this.codigo;
        cadena += "\nDescripción: " + this.descripcion;
        cadena += "\nPrecio de compra: " + this.precioCompra;
        cadena += "\nPrecio de venta: " + this.precioVenta;
        cadena += "\nStock: " + this.stock + " unidades";

        cadena += "\n------------------------------------------";

        return cadena;
    }

    public void entradaMercancia(int n){
        this.stock += n;
    }

    public void baja(){

        this.stock = 0;
        this.codigo = 0;
        this.descripcion = "";
        this.precioCompra = 0;
        this.precioVenta = 0;
    }

    public void salidaMercancia(int s){

        if(this.stock < s){
            System.out.println("No ha sufieciente stock");
        }else{
            this.stock -= s;
        }
    }
}