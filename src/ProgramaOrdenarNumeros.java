/*
El desafío es un programa que pida dos números y los muestre ordenados de mayor a menor.

Podría ser utilizando operador ternario.
 */

import java.util.Scanner;

public class ProgramaOrdenarNumeros {
    public static void main(String[] args) {
        int numero1, numero2;
        String resultado;
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Ingresa el primer número");
            numero1 = scanner.nextInt();

            System.out.println("Ingresa el segundo número");
            numero2 = scanner.nextInt();

            resultado = (numero1 > numero2) ? numero1 + " > " + numero2 : numero2 + " > " + numero1;
            System.out.println("El orden es = " + resultado);
        } catch (Exception e) {
            System.out.println("Debe ingresar un numero entero");
            main(args);
            System.exit(0);
        }
    }
}
