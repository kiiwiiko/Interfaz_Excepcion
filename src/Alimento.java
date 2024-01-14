import java.util.Scanner;

class Alimento implements IProducto {
    String nombre;
    String fechaElaboracion;
    String fechaExpiracion;

    @Override
    public void imprimirProducto() {
        System.out.println("El nombre del alimento es: " + nombre);
        System.out.println("La fecha de elaboracion del alimento es: " + fechaElaboracion);
        System.out.println("La fecha de expiracion del alimento es: " + fechaExpiracion);
    }

    @Override
    public void ingresarProducto() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del alimento: ");
        nombre = sc.next();
        System.out.println("Ingrese la fecha de elaboracion del producto: ");
        fechaElaboracion = sc.next();
        System.out.println("Ingrese la fecha de expiracion del producto: ");
        fechaExpiracion = sc.next();
    }
}
