/*
Mediante el teclado pedir dos números enteros positivos o negativos y multiplicarlos,
pero sin usar el símbolo de multiplicación (*).

Puede utilizar una sentencia for para realizar la multiplicación y tener en cuenta
los unarios, donde menos por menos es positivo.
 */

import java.util.Scanner;

public class ProgramaMultiplicarDosNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer numero1, numero2, resultado = 0;

        System.out.println("Ingresa 2 números enteros positivos o negativos para la multiplicación");

        try {
            System.out.println("Ingresa el primer número:");
            numero1 = scanner.nextInt();

            System.out.println("Ingresa el segundo número:");
            numero2 = scanner.nextInt();

            //Math.abs trae el valor absoluto de un número
            for (int i = 0; i < Math.abs(numero2); i++) {
                resultado += numero1;
            }

            if(numero1 < 0 || numero2 < 0) {
                resultado = -resultado;
            }

            System.out.println("El resultado de la multiplicación de los números " + numero1 + " x " + numero2 + " es " + resultado);
        }catch (Exception e){
            System.out.println("Debes ingresar solo numero enteros positivos o negativos");
            main(args);
            System.exit(0);
        }
    }
}
