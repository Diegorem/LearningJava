import javax.swing.*;
import java.sql.SQLOutput;

public class SistemasNumericos {
    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un numero entero", "Numero entero", JOptionPane.INFORMATION_MESSAGE);
        int numeroDecimal=0;
        try {
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error debe ingresar un numero entero", "Error numero entero", JOptionPane.ERROR_MESSAGE);
            main(args);
            System.exit(0);
        }


        System.out.println("numeroDecimal = " + numeroDecimal);
        System.out.println("numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));

        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario = " + numeroBinario);
        System.out.println("numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal));

        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);
        System.out.println("numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));

        int numeroHexadecimal = 0x1f4;
        System.out.println("numeroHexadecimal = " + numeroHexadecimal);

        String mensaje = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        mensaje += "\nnumero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        mensaje += "\nnumero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        JOptionPane.showMessageDialog(null, mensaje, "Conversiones", JOptionPane.INFORMATION_MESSAGE);

    }
}
