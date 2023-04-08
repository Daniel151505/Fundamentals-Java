public class EjemploStringInmutable {
    public static void main(String[] args) {
        String curso = "Programación java";
        String profesor = "Andrés";

        //Crear nueva variable para el concat
        String resultado = curso.concat(profesor);

        System.out.println("curso = " + curso);
        System.out.println("resultado = " + resultado);
        System.out.println(curso == resultado);

        //Concatenación con transform, crear nueva variable
        String resultado2 = curso.transform(c -> {
            return c + " con " + profesor;
        });

        System.out.println("curso = " + curso);
        System.out.println("resultado2 = " + resultado2);

        // Replace reemplaza (lo que tengo, lo que quiero), crear nueva variable
        String resultado3 = resultado.replace("a", "A");
        System.out.println("resultado = " + resultado);
        System.out.println("resultado3 = " + resultado3);
    }
}
