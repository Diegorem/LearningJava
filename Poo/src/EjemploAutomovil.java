public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil toyota = new Automovil();

        toyota.fabricante = "Toyota";
        toyota.modelo = "Corolla";
        toyota.color = "Blanco";
        toyota.cilindrada = 1.8;


        Automovil mazda = new Automovil();
        mazda.fabricante = "Mazda";
        mazda.modelo = "BT-50";
        mazda.color = "Rojo";
        mazda.cilindrada = 2.2;
        System.out.println(toyota.detalle());
        System.out.println(mazda.detalle());





    }
}
