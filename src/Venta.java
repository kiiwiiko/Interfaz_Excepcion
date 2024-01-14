public class Venta {
    private Producto producto;
    private Cliente cliente;

    public Venta() {

    }

    public void ingresarVenta(IProducto producto) {
        producto.ingresarProducto();
        producto.imprimirProducto();

    }
}
