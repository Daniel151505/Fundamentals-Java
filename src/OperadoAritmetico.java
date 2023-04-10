import javax.swing.*;

public class OperadoAritmetico {
    public static void main(String[] args) {

        // suma
        int i = 5, j = 4, suma = i + j;
        System.out.println("suma = " + suma);
        System.out.println("i + j = " + (i + j));

        // resta
        int resta = i - j;
        System.out.println("resta = " + resta);
        System.out.println("(i - j) = " + (1 - 2));

        // multiplicación
        int multi = i * j;
        System.out.println("multi = " + multi);

        // división
        int div = i / j;
        float div2 = (float) i / (float) j;
        System.out.println("div = " + div);
        System.out.println("div2 = " + div2);

        // resto = división, lo que sobra
        int resto = 8 % 5;
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        if (numero % 2 == 0) {
            System.out.println("Es un número par = " + numero);
        } else {
            System.out.println("Es un número impar = " + numero);
        }

    }
}
