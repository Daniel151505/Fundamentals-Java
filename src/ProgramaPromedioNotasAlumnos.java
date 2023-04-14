/*
Pedir 20 notas finales de alumnos en una escala de 1 a 7, manejar decimales en las notas (double).
Mostrar el promedio de las notas mayores a 5, promedio de notas inferiores a 4 y la cantidad de notas 1,
ademas mostrar el promedio total.

Ayuda: usar un bucle for que itere hasta 20 (notas) y dentro del ciclo pedir las notas una a una
para realizar los cálculos (contadores, sumas).

Opcional: si una de las notas ingresadas es 0 debe salirse del ciclo for y mostrar un mensaje de error finalizando el programa.
 */

import javax.swing.*;

public class ProgramaPromedioNotasAlumnos {
    public static void main(String[] args) {

        double ingresoNota, mayoresA5 = 0, inferioresA5 = 0, promedioTotalMayoresA5, promedioTotalInferioresA5;
        int cantidadNotasMayoresA5 = 0, cantidadNotasInferioresA5 = 0, cantidadNotas1 = 0;

        try {
            for (int i = 0; i < 20; i++) {
                ingresoNota = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la nota " + (i + 1) + ", recuerda que puedes ingresar números enteros o decimales, \nen una escala de 1 a 7"));
                if (ingresoNota == 0) {
                    JOptionPane.showMessageDialog(null, "!Error, no se debe ingresar una nota con valor 0!, inténtalo nuevamente");
                    main(args);
                    System.exit(0);
                    break;
                } else if (ingresoNota == 1) {
                    cantidadNotas1++;
                } else if (ingresoNota > 0 && ingresoNota < 8) {
                    if (ingresoNota > 5) {
                        mayoresA5 += ingresoNota;
                        cantidadNotasMayoresA5++;
                    } else {
                        inferioresA5 += ingresoNota;
                        cantidadNotasInferioresA5++;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "!Error, debes poner una nota en la escala de 1 a 7!, inténtalo nuevamente");
                    main(args);
                    System.exit(0);
                    break;
                }
            }

            if (cantidadNotasMayoresA5 == 0) {
                JOptionPane.showMessageDialog(null, "El promedio de la cantidad de notas mayores a 5 es : 0");
            } else {
                promedioTotalMayoresA5 = mayoresA5 / cantidadNotasMayoresA5;
                JOptionPane.showMessageDialog(null, "El promedio de la cantidad de notas mayores a 5 es : " + promedioTotalMayoresA5);
            }

            if (cantidadNotasInferioresA5 == 0) {
                JOptionPane.showMessageDialog(null, "El promedio de la cantidad de notas inferiores a 5 es : 0");
            } else {
                promedioTotalInferioresA5 = inferioresA5 / cantidadNotasInferioresA5;
                JOptionPane.showMessageDialog(null, "El promedio de la cantidad de notas inferiores a 5 es : " + promedioTotalInferioresA5);
            }

            if (cantidadNotas1 == 0) {
                JOptionPane.showMessageDialog(null, "La cantidad de notas con el valor 1 es : 0");
            } else {
                JOptionPane.showMessageDialog(null, "La cantidad de notas con el valor 1 es : " + cantidadNotas1);
            }

            JOptionPane.showMessageDialog(null, "El promedio total es : " + ((mayoresA5 + inferioresA5) / (cantidadNotasInferioresA5 + cantidadNotasMayoresA5)));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Debes ingresar una nota en el rango del 1 al 7, inténtalo nuevamente");
            main(args);
            System.exit(0);
        }

    }
}
