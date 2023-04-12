/*
Obtener el nombre mas largo de tres personas, según los siguientes requerimientos

Mediante el teclado pedir el nombre completo (nombre + apellido) de tres miembros
de la familia o amigos usando la clase JOptionPane y método showInputDialog().

Calcular e Imprimir el nombre de la persona que tenga el nombre más largo (en cantidad de caracteres)
(Imprimir solo uno de los tres, el de más caracteres en el nombre.)

Podría usar .split(" "); del objeto String para separar nombre y apellido en un arreglo,
y con el índice cero accedemos al nombre de la persona.

Restricción no usar loops en el desarrollo de la tarea.

Ejemplo del resultado: "Guillermo Doe tiene el nombre más largo."
 */

import javax.swing.*;

public class ProgramaNombreMasLargo {
    public static void main(String[] args) {

        String persona1, persona2, persona3, resultado;

        persona1 = JOptionPane.showInputDialog("Ingresa el nombre y apellido del primer familiar.");
        persona2 = JOptionPane.showInputDialog("Ingresa el nombre y apellido del segundo familiar.");
        persona3 = JOptionPane.showInputDialog("Ingresa el nombre y apellido del tercer familiar.");

        if (persona1.matches(".*\\d.*") || persona2.matches(".*\\d.*") || persona3.matches(".*\\d.*")) {
            JOptionPane.showMessageDialog(null, "No se permiten números en los nombres de los familiares. \nDebes ingresar correctamente el nombre de tus familiares");
            main(args);
            System.exit(0);
        }

        if (persona1.isEmpty() || persona2.isEmpty() || persona3.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se permite que los nombres estén vacíos. \nDebes ingresar correctamente el nombre de tus familiares");
            main(args);
            System.exit(0);
        }

        resultado = (persona1.split(" ")[0].length() < persona2.split(" ")[0].length()) ? persona2 : persona1;
        resultado = (persona3.split(" ")[0].length() < resultado.split(" ")[0].length()) ? resultado : persona3;

        JOptionPane.showMessageDialog(null, "El familiar con el nombre mas largo es " + resultado);
    }

}
