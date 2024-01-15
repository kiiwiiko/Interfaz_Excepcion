import java.util.InputMismatchException;
import java.util.Scanner;

class Cliente implements ICliente {
    public String nombre;
    public int cedula;
    public int edad;

    @Override
    public void imprimirCliente() {
        System.out.println("El nombre del cliente es: " + nombre);
        System.out.println("La cedula del cliente es: " + cedula);
        System.out.println("La edad del cliente es: " + edad);
    }

    @Override
    public void ingresarCliente() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del cliente: ");
        this.nombre = sc.next();

        boolean ingresoExitosoCedula = false;
        do {
            try {
                System.out.println("Ingrese la cedula del cliente (debe tener exactamente 10 dígitos): ");
                this.cedula = sc.nextInt();
                if (String.valueOf(this.cedula).length() != 10) {
                    throw new IllegalArgumentException("Error: La cédula debe tener exactamente 10 dígitos.");
                }
                ingresoExitosoCedula = true;
                // Solo contener numeros
            } catch (NumberFormatException e) {
                System.out.println("ERROR: La cédula debe contener solo números.");
                sc.nextLine();
                // Excepcion para identificar el tipo de dato.
            } catch (InputMismatchException e) {
                System.out.println("ERROR: La cédula debe contener solo números.");
                sc.nextLine();
                // Excepcion para argumento ilegal o inapropiado.
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                sc.nextLine();
                // Para todas las excepciones
            } catch (Exception e) {
                System.out.println("¡Error!");
                sc.nextLine();
            }
        } while (!ingresoExitosoCedula);

        boolean ingresoExitosoEdad = false;
        do {
            try {
                System.out.println("Ingrese la edad del cliente (debe ser mayor de edad): ");
                this.edad = sc.nextInt();
                if (this.edad < 18) {
                    throw new IllegalArgumentException("Error: La edad debe ser mayor de 18 años.");
                }
                // Solo contener numeros
            } catch (NumberFormatException e) {
                System.out.println("ERROR: La edad debe contener solo números.");
                sc.nextLine();
                ingresoExitosoEdad = true;
                // Excepcion para identificar el tipo de dato.
            } catch (InputMismatchException e) {
                System.out.println("ERROR: La edad del cliente debe ser un dato entero.");
                sc.nextLine();
                // Excepcion para argumento ilegal o inapropiado.
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                sc.nextLine();
                // Para todas las excepciones
            } catch (Exception e) {
                System.out.println("¡Error!");
                sc.nextLine();
            }
        } while (!ingresoExitosoEdad);
    }
}

