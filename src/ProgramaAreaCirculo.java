/*
Pedir el radio de un círculo y calcular su área.

utilizar la formula:

area = PI*r² (Constante PI multiplicado por el radio al cuadrado).
 */

import java.util.Scanner;

public class ProgramaAreaCirculo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Double radio, area;

        System.out.println("Ingresa el radio del círculo");
        try {
            radio = scanner.nextDouble();
            area = Math.PI * Math.pow(radio, 2);
            System.out.println("El área del círculo = " + area);

        } catch (Exception e) {
            System.out.println("Debes ingresar solo números");
            main(args);
            System.exit(0);
        }

    }
}