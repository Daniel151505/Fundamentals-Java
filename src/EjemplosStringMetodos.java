public class EjemplosStringMetodos {
    public static void main(String[] args) {
        String nombre = "Andres";

        //Longitud
        System.out.println("nombre.length() = " + nombre.length());

        // Mayúscula
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());

        // Minúscula
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());

        // Igual
        System.out.println("nombre.equals(\"Andres\") = " + nombre.equals("Andres"));

        // Diferente
        System.out.println("nombre.equals(\"andres\") = " + nombre.equals("andres"));

        // No importa el caso si es mayúscula o minúscula
        System.out.println("nombre.equalsIgnoreCase(\"aNdrEs\") = " + nombre.equalsIgnoreCase("aNdrEs"));

        // Compara cada carácter, según el sistema unicode, retorna un integer, si es igual retornara 0
        System.out.println("nombre.compareTo(\"Andres\") = " + nombre.compareTo("Andres"));
        System.out.println("nombre.compareTo(\"Andres\") = " + nombre.compareTo("Aaron"));

        // Trae un carácter de la variable, especificado en (0)
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(2) = " + nombre.charAt(2));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));

        // Trae los caracteres según se especifique(desde , hasta)
        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1, 4) = " + nombre.substring(1, 4));
        System.out.println("nombre.substring(nombre.length()-2) = " + nombre.substring(nombre.length()-2));

        String trabalenguas = "trabalenguas";

        // Cambia o reemplaza el carácter replace("carácter qué deseo cambiar", "carácter nuevo")
        System.out.println("trabalenguas = " + trabalenguas.replace("a", "."));

        // Trae la posición de la primera aparición del primer carácter que se indica, retorna un integer.
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a'));

        // Trae la posición de la última aparición del carácter que se indica, retorna un integer.
        System.out.println("trabalenguas.lastIndexOf('e') = " + trabalenguas.lastIndexOf('e'));

        // compara si contiene los siguientes caracteres, retorna un booleano
        System.out.println("trabalenguas.contains('lenguas') = " + trabalenguas.contains("lenguas"));

        // compara si termina con los siguientes caracteres, retorna un booleano
        System.out.println("trabalenguas.contains('guas') = " + trabalenguas.endsWith("guas"));

        // retorna el texto sin espacios
        System.out.println("  trabalenguas  ");
        System.out.println("  trabalenguas  ".trim());

    }
}
