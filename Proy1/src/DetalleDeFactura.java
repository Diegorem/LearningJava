import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double precio2 = 0;
        double precio1 = 0;
        String descripcion = "";

        System.out.println("Ingrese el nombre de la factura: ");
        descripcion = scanner.nextLine();

        try {
            System.out.println("Ingrese el precio del primer producto: ");
            precio1 = scanner.nextDouble();

            System.out.println("Ingrese el precio del segundo producto: ");
            precio2 = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Error debe ingresar un número!");
            main(args);
            System.exit(0);
        }

        double suma = precio1 + precio2;
        double impuesto = (precio1 + precio2) * 0.19;

        double total = precio1 + precio2 + impuesto;

        System.out.println("La factura " + descripcion + " tiene un total bruto de " + suma + ", con un impuesto de " + impuesto +
                " y el monto después de impuesto es de " + total);

    }
}
