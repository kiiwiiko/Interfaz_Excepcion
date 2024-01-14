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
                System.out.println("Ingrese la cedula del cliente: ");
                this.cedula = sc.nextInt();
                if (String.valueOf(this.cedula).length() == 10) {
                    ingresoExitosoCedula = true;
                } else {
                    System.out.println("ERROR: La cedula debe tener exactamente 10 dígitos.");
                }
            } catch (Exception e) {
                System.out.println("ERROR: La cedula solo puede contener números enteros.");
                sc.nextLine();  // Limpiar el buffer del scanner
            }
        } while (!ingresoExitosoCedula);

        boolean ingresoExitosoEdad = false;
        do {
            try {
                System.out.println("Ingrese la edad del cliente: ");
                this.edad = sc.nextInt();
                ingresoExitosoEdad = true;
            } catch (Exception e) {
                System.out.println("ERROR: La edad del cliente debe ser un dato entero.");
                sc.nextLine();  // Limpiar el buffer del scanner
            }
        } while (!ingresoExitosoEdad);
    }
}
