package Sec3Strings;

import java.util.Scanner;

public class Tarea5 {
    public static void main(String[] args) {
        // Recibir los nombres de 3 familiares por linea de comando
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del primer familiar: ");
        String familiar1 = scanner.nextLine();
        System.out.println("Ingrese el nombre del segundo familiar: ");
        String familiar2 = scanner.nextLine();
        System.out.println("Ingrese el nombre del tercer familiar: ");
        String familiar3 = scanner.nextLine();

        // Tomar el segundo carácter pero convertido en mayúscula y se le concatena un punto y los dos últimos caracteres de la persona.
        String familiar1Short = familiar1.substring(1, 2).toUpperCase() + "." + familiar1.substring(familiar1.length() - 2);
        String familiar2Short = familiar2.substring(1, 2).toUpperCase() + "." + familiar2.substring(familiar2.length() - 2);
        String familiar3Short = familiar3.substring(1, 2).toUpperCase() + "." + familiar3.substring(familiar3.length() - 2);

        System.out.println("El nombre corto del primer familiar es: " + familiar1Short);
        System.out.println("El nombre corto del segundo familiar es: " + familiar2Short);
        System.out.println("El nombre corto del tercer familiar es: " + familiar3Short);

    }
}
