import java.util.InputMismatchException;
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

        // Inicializamos ingresoExitosoPrecio en falso
        boolean ingresoExitosoPrecio = false;
        do {
            try {
                System.out.println("Ingrese el precio del producto: ");
                precio = sc.nextDouble();
                ingresoExitosoPrecio = true;
                // Excepcion para identificar el tipo de dato.
            } catch (InputMismatchException e) {
                System.out.println("ERROR: La edad del cliente debe ser un dato entero.");
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("ERROR!");
                sc.nextLine(); //Salto de linea
            }
        } while (!ingresoExitosoPrecio);

        // Inicializamos ingresoExitosoCantidad en falso
        boolean ingresoExitosoCantidad = false;
        do {
            try {
                System.out.println("Ingrese la cantidad del producto: ");
                cantidad = sc.nextInt();
                ingresoExitosoCantidad = true;
                // Excepcion para identificar el tipo de dato.
            } catch (InputMismatchException e) {
                System.out.println("ERROR: La edad del cliente debe ser un dato entero.");
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("ERROR!");
                sc.nextLine();
            }
        } while (!ingresoExitosoCantidad);
    }
}