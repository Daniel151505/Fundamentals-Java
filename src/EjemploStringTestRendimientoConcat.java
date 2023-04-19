public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;

        // String mutable
        StringBuilder sb = new StringBuilder(a);

        //Tiempo de inicio en ms
        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {
            //c = c.concat(a).concat(b).concat("\n"); // 500 => 1ms , 1000 => 2ms
            //c += a + b + "\n"; // 500 => 10ms, 1000 => 11ms
            // Forma de concatenar
            sb.append(a).append(b).append("\n"); // 500 => 0ms, 1000 => 0ms
        }

        System.gc();

        //Tiempo de fin en ms
        long fin = System.currentTimeMillis();

        System.out.println("Tiempo transcurrido en ms " + (fin - inicio));
        System.out.println("c = " + c);

        System.out.println("sb = " + sb);
        System.exit(0);

    }
}
