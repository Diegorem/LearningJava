public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);
        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++){
            // c = c.concat(a).concat(b).concat("\n"); // 500 => 2ms, 1000 => 4ms, 10000 => 138ms, 100000 => 4337ms
            // c += a + b + "\n"; // 500 => 20ms, 1000 => 21ms, 10000 => 76ms, 100000 => 1666ms
            sb.append(a).append(b).append("\n"); // 500 => 0ms, 1000 => 0ms, 10000 => 2ms, 100000 => 13ms
        }

        long fin = System.currentTimeMillis();
        System.out.println(fin-inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
    }
}
