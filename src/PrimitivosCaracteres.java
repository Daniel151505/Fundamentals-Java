public class PrimitivosCaracteres {
    public static void main(String[] args) {
        var caracter = '\u0040';
        var decimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = carácter: " + (decimal == caracter));

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = caracter " + (simbolo == caracter));

        // char espacio = ' ';
        char espacio = '\u0020';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';


        System.out.println("char corresponde en byte =" + retornoCarro + Character.BYTES);
        System.out.println("char corresponde en bites = " + nuevaLinea + Character.SIZE);
        System.out.println("Character.MIN_VALUE = " + System.lineSeparator() + Character.MIN_VALUE);
        System.out.println("Character.MAX_VALUE \n = " + Character.MAX_VALUE);
    }
}
