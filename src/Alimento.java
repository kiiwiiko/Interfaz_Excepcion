import java.util.Scanner;
class Alimento extends Producto {
    String nombre;
    String fechaElaboracion;
    String fechaExpiracion;

    @Override
    public void imprimirProducto() {
        super.imprimirProducto();
        System.out.println("La fecha de elaboracion del alimento es: " + fechaElaboracion);
        System.out.println("La fecha de expiracion del alimento es: " + fechaExpiracion);
    }

    @Override
    public void ingresarProducto() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del alimento: ");
        nombre = sc.next();
        System.out.println("Ingrese la fecha de elaboracion del alimento: ");
        fechaElaboracion = sc.next();
        System.out.println("Ingrese la fecha de expiracion del alimento: ");
        fechaExpiracion = sc.next();
        super.ingresarProducto();
    }
}
