import java.util.Scanner;

class Producto implements IProducto {
    String codigo;
    double precio;
    int cantidad;

    @Override
    public void imprimirProducto() {
        System.out.println("El código del producto es: " + codigo);
        System.out.println("El precio del producto es: " + precio);
        System.out.println("La cantidad del producto es: " + cantidad);
    }

    @Override
    public void ingresarProducto() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el código del producto: ");
        codigo = sc.next();

        boolean ingresoExitosoPrecio = false;
        do {
            try {
                System.out.println("Ingrese el precio del producto: ");
                precio = sc.nextDouble();
                ingresoExitosoPrecio = true;
            } catch (Exception e) {
                System.out.println("ERROR: El precio del producto debe ser un número.");
                sc.nextLine();
            }
        } while (!ingresoExitosoPrecio);

        boolean ingresoExitosoCantidad = false;
        do {
            try {
                System.out.println("Ingrese la cantidad del producto: ");
                cantidad = sc.nextInt();
                ingresoExitosoCantidad = true;
            } catch (Exception e) {
                System.out.println("ERROR: La cantidad del producto debe ser un número.");
                sc.nextLine();
            }
        } while (!ingresoExitosoCantidad);
    }
}