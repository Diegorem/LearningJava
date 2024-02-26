public class Test {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int a = 1;
        int b = 2;
        int c = a + b;
        System.out.println("c = " + c);

        // Crear clase Persona
        class Persona {
            String nombre;
            int edad;
        }

        // Crear objeto persona
        Persona p = new Persona();
        p.nombre = "Juan";
        p.edad = 20;
        System.out.println("Nombre: " + p.nombre + ", Edad: " + p.edad);

        // Herencia de clase Persona
        class Empleado extends Persona {
            int sueldo;
        }

        // Crear objeto empleado
        Empleado e = new Empleado();
        e.nombre = "Pedro";
        e.edad = 30;
        e.sueldo = 1000;
        System.out.println("Nombre: " + e.nombre + ", Edad: " + e.edad + ", Sueldo: " + e.sueldo);

        Persona p2 = new Empleado();
        p2.nombre = "Maria";
        p2.edad = 40;
        System.out.println("Nombre: " + p2.nombre + ", Edad: " + p2.edad);

        // Clase abstracta
        abstract class Figura {
            abstract double area();
        }

        // Clase concreta
        class Circulo extends Figura {
            double radio;

            double area() {
                return Math.PI * radio * radio;
            }
        }

        // Crear objeto circulo
        Circulo circulo = new Circulo();
        circulo.radio = 5.0;
        System.out.println("Area del circulo: " + circulo.area());

        // Interfaz
        interface Figura2 {
            double area();
        }

        // Clase concreta
        class Circulo2 implements Figura2 {
            double radio;

            public double area() {
                return Math.PI * radio * radio;
            }
        }

        // Crear objeto circulo
        Circulo2 circulo2 = new Circulo2();
        circulo2.radio = 5.0;
        System.out.println("Area del circulo: " + circulo2.area());

        // Clase anonima
        Figura2 figura2 = new Figura2() {
            double radio = 5;

            public double area() {
                return Math.PI * radio * radio;
            }
        };

        // Crear objeto circulo

        System.out.println("Area del circulo: " + figura2.area());

        // Clase interna
        class Externa {
            class Interna {
                public void imprimir() {
                    System.out.println("Clase interna");
                }
            }
        }

        // Crear objeto interno
        Externa.Interna interna = new Externa().new Interna();
        interna.imprimir();

        // Clase interna estatica
        class Externa2 {
            static class Interna {
                public void imprimir() {
                    System.out.println("Clase interna estatica");
                }
            }
        }

        // Crear objeto interno estatico
        Externa2.Interna interna2 = new Externa2.Interna();
        interna2.imprimir();

        // Clase anonima
        Externa2.Interna interna3 = new Externa2.Interna() {
            public void imprimir() {

            }
        };
    }
}