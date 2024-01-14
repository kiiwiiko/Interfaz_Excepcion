import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<IProducto> listaProductos = new ArrayList<>();
        List<ICliente> listaClientes = new ArrayList<>();

        while (true) {
            System.out.println("1. Ingresar Producto");
            System.out.println("2. Ingresar Cliente");
            System.out.println("3. Ver Productos");
            System.out.println("4. Ver Clientes");
            System.out.println("5. Salir");

            boolean ingresoExitosoOpcion = false;

            do {
                try {
                    System.out.println("Seleccione una opción: ");
                    int opcion = sc.nextInt();
                    ingresoExitosoOpcion = true;

                    switch (opcion) {
                        case 1:
                            IProducto nuevoProducto = new Producto();
                            nuevoProducto.ingresarProducto();
                            listaProductos.add(nuevoProducto);
                            break;
                        case 2:
                            ICliente nuevoCliente = new Cliente();
                            nuevoCliente.ingresarCliente();
                            listaClientes.add(nuevoCliente);
                            break;
                        case 3:
                            System.out.println("Productos:");
                            for (IProducto producto : listaProductos) {
                                producto.imprimirProducto();
                                System.out.println("----------");
                            }
                            break;
                        case 4:
                            System.out.println("Clientes:");
                            for (ICliente cliente : listaClientes) {
                                cliente.imprimirCliente();
                                System.out.println("----------");
                            }
                            break;
                        case 5:
                            System.out.println("Saliendo del programa...");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("ERROR: Opción no válida. Intente de nuevo.");
                            break;
                    }
                } catch (Exception e) {
                    System.out.println("ERROR: La opcion debe ser numerico.");
                    sc.nextLine();
                    break;
                }
            } while (!ingresoExitosoOpcion);


        }
    }
}