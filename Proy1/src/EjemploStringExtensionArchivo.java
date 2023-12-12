public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {

        String archivo = "imagen.jpg";
        int i = archivo.lastIndexOf("."); // Toma la ultima ocurrencia del punto
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring(archivo.lenght() - 4) = " + archivo.substring(archivo.length() - 4));


    }
}
