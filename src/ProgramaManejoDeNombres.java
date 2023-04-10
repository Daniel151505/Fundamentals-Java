/*
La tarea consiste en crear una clase llamada ProgramaManejoDeNombres de la siguiente manera:

Se requiere desarrollar un programa que reciba los nombres de 3 integrantes de tu familia o amigos como argumentos de línea de comandos.

Se pide por cada nombre de la persona una nueva variable del tipo String al tomar el segundo carácter pero convertido en mayúscula y se le concatena un punto y los dos últimos caracteres de la persona.
Por ejemplo para Andres debe quedar como N.es

Debe imprimir como resultado los tres nuevos nombres separado con guion bajo (como una única variable).
 */

import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {

        int numeroFamiliares = 0;
        String nombresFormateados = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero de familiares:");

        try {
            numeroFamiliares = scanner.nextInt();
            String nombreFamiliar;

            for (int i = 0; i < numeroFamiliares; i++) {
                System.out.println("Ingrese el nombre del familiar:");
                nombreFamiliar = scanner.next();
                var largo = nombreFamiliar.length();
                var formatoMayuscula = nombreFamiliar.toUpperCase().charAt(1);
                var formato2UltimosCaracteres = nombreFamiliar.substring(largo-2);
                var nombreFormateado = formatoMayuscula + "." + formato2UltimosCaracteres;
                nombresFormateados += nombreFormateado + "_";
            }

            nombresFormateados = nombresFormateados.substring(0, nombresFormateados.length() - 1);
            System.out.println("nombres Formateados = " + nombresFormateados);

        } catch(Exception e) {
            System.out.println("Debe ingresar un numero de integrantes de los familiares");
            main(args);
            System.exit(0);
        }

    }
}
