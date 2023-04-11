/*
Suponiendo un estanque de gasolina (gas) con capacidad 70 litros,
se requiere un programa que pida la medida actual en litros y mostrar
el resultado de la forma: Insuficiente, Suficiente, Medio...

La medida o capacidad actual del estanque puede ser en tipo double,
para una mejor precisión, pero también puede ser del tipo int.

Si la capacidad actual es 70 litros: imprimir Estanque lleno

Si está entre 60 y menor a 70: imprimir Estanque casi lleno

Si está entre 40 y menor a 60: imprimir Estanque  3/4

Si está entre 35 y menor a 40: imprimir Medio Estanque

Si está entre 20 y menor a 35: imprimir Suficiente

Si está entre 1 y menor a 20: imprimir Insuficiente
 */

import java.util.Scanner;

public class ProgramaEstanqueGasolina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double litrosIngresados;

        try {
            System.out.println("Ingresa los litros actuales de estanque de gasolina");
            litrosIngresados = scanner.nextDouble();

            if (litrosIngresados > 70) {
                System.out.println("Estanque en estado critico con " + litrosIngresados + " litros. !Warning¡");
                System.out.println("Corrígelo rápidamente");
                main(args);
                System.exit(0);
            } else if (litrosIngresados == 70) {
                System.out.println("Estanque lleno con " + litrosIngresados + " litros.");
            } else if (litrosIngresados >= 60 && litrosIngresados < 70) {
                System.out.println("Estanque casi lleno con " + litrosIngresados + " litros.");
            } else if (litrosIngresados >= 40 && litrosIngresados < 60) {
                System.out.println("Estanque 3/4 con " + litrosIngresados + " litros.");
            } else if (litrosIngresados >= 35 && litrosIngresados < 40) {
                System.out.println("Medio Estanque con " + litrosIngresados + " litros.");
            } else if (litrosIngresados >= 20 && litrosIngresados < 35) {
                System.out.println("Suficiente con " + litrosIngresados + " litros.");
            } else if (litrosIngresados >= 0 && litrosIngresados < 20) {
                System.out.println("Insuficiente con " + litrosIngresados + " litros.");
            }
        } catch (Exception e) {
            System.out.println("Litros ingresados incorrectamente");
            main(args);
            System.exit(0);
        }
    }
}
