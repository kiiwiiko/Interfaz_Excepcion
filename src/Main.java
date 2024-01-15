import java.util.ArrayList;
import java.util.InputMismatchException;
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

            // Solo inicializamos al ingresoExitosoOpcion con False
            boolean ingresoExitosoOpcion = false;

            // Repeticion para cada vez que se tenga un error de opcion
            do {
                // Excepcion para que cuando no se ingrese el dato que nos esta pidiendo la funcion
                try {
                    System.out.println("Seleccione una opción: ");
                    int opcion = sc.nextInt();
                    if (opcion > 5) {
                        throw new IllegalArgumentException("Error: Tenga en cuenta que solo hay 5 opciones.");
                    }
                    ingresoExitosoOpcion = true;

                    // Pequeña interface
                    switch (opcion) {
                        case 1:
                            IProducto nuevoAlimento = new Alimento();
                            nuevoAlimento.ingresarProducto();
                            listaProductos.add(nuevoAlimento);
                            break;
                        case 2:
                            ICliente nuevoCliente = new Cliente();
                            nuevoCliente.ingresarCliente();
                            listaClientes.add(nuevoCliente);
                            break;
                        case 3:
                            System.out.println("Productos:");
                            int contadorAlimentos = 1;
                            // Para Imprimir cada producto
                            for (IProducto producto : listaProductos) {
                                // Condicion que nos muestra cada produto por el orden de ingreso
                                if (producto instanceof Alimento) {
                                    System.out.println("ALIMENTO " + contadorAlimentos);
                                    contadorAlimentos++;
                                }

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
                    // Excepcion para identificar el tipo de dato.
                } catch (InputMismatchException e) {
                    System.out.println("ERROR: La opcion debe ser un dato entero.");
                    sc.nextLine();
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    sc.nextLine();
                    // Nos muestra el error en pantalla y ingresoExitosoOpcion toma el valor de false
                } catch (Exception e) {
                    System.out.println("ERROR!");
                    sc.nextLine();
                    break;
                }
            } while (!ingresoExitosoOpcion);


        }
    }
}