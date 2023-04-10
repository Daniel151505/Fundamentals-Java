public class OperadoresIncrementales {
    public static void main(String[] args) {

        // Pre incremento ++a, incrementa a en uno, y luego devuelve a
        int i = 1;
        int j = ++i; // i = i + 1;

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Post incremento a++, Devuelve a, y luego incrementa a en uno
        i = 2;
        System.out.println("i = " + i);
        j = i++;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Pre decremento, Decrementa a en uno, luego devuelve a

        i = 3;
        j = --i;

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Post decremento, Devuelve a, luego decrementa a en uno
        i = 4;
        j = i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("j = " + (++j));
        System.out.println("j = " + (j++));
        System.out.println("j = " + j);

    }
}
