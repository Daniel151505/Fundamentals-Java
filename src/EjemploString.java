public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programación java";
        String curso2 = new String("Programación java");
        
        // Comparación por instancia o referencia
        boolean esIgual = curso == curso2;
        System.out.println("curso == curso2 = " + esIgual);

        //Comparación por valor
        esIgual = curso.equals(curso2);
        System.out.println("curso.equals(curso2) = " + esIgual);

        String curso3 = "Programación java";
        esIgual = curso == curso3;
        System.out.println("curso == curso3 = " + esIgual);
    }
}
