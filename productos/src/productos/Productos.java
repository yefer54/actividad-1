
package productos;

public class Productos {
    private String producto;
    private int valor;
    private int cantidad;

    public Productos(String producto, int valor, int cantidad) {
        this.producto = producto;
        this.valor = valor;
        this.cantidad = cantidad;
    }
    
    public Productos() {
        this ("sin nombre", 0, 0);
        
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public void imprimir() {
        System.out.println(" ");
        System.out.println("Producto: " + producto);
        System.out.println("Valor: " + valor);
        System.out.println("Cantidad: " + cantidad);
    }
}
