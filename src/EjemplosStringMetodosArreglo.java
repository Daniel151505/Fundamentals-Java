public class EjemplosStringMetodosArreglo {
    public static void main(String[] args) {

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.length() = " + trabalenguas.length());
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

        char[] arreglo = trabalenguas.toCharArray();
        int largo = arreglo.length;
        System.out.println("largo = " + largo);

        for (int i = 0; i < largo; i++) {
            System.out.println("arreglo = " + arreglo[i]);
        }

        // Convierte el string en un arreglo, donde cada elemento va a ser las palabras o caracteres que
        // están separados por el carácter especificado split("carácter")
        System.out.println("trabalenguas = " + trabalenguas.split("a"));

        String[] arreglo2 = trabalenguas.split("a");
        int l = arreglo2.length;

        for (int j = 0; j < l; j++) {
            System.out.println(arreglo2[j]);
        }

        String archivo = "alguna.imagen.pdf";
        String[] archivoArr = archivo.split("\\.");  //[.]
        l = archivoArr.length;

        System.out.println("l = " + l);
        for (int k = 0; k < l; k++) {
            System.out.println(archivoArr[k]);
        }

        System.out.println("extension = " + archivoArr[l-1]);
    }
}







