/*
Para esta tarea se pide ingresar una fecha de
nacimiento en formato string, convertirla a una fecha del tipo
java.util.Date y calcular la edad de la persona de acuerdo a la fecha actual.

 */

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ProgramaCalcularEdad {
    public static void main(String[] args) {

        String fechaIngresada;
        Date fechaActual = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su fecha de nacimiento con el siguiente formato yyyy-MM-dd");

        fechaIngresada = scanner.next();

        try {
            Date fechaNacimiento = df.parse(fechaIngresada);

            // creamos un patron de fecha numérico con el año mes y día
            df = new SimpleDateFormat("yyyyMMdd");

            // luego convertimos ambas fechas la actual y la fecha de nacimiento
            // en enteros que contiene el año mes y día
            int desde = Integer.parseInt(df.format(fechaNacimiento));
            int hasta = Integer.parseInt(df.format(fechaActual));

            System.out.println("hasta = " + hasta);
            System.out.println("desde = " + desde);

            // luego restamos ambas fechas y dividimos en 10000 para quitar decimales y
            // dejar la fecha en decenas o centenas
            int edad = (hasta - desde) / 10000;
            System.out.println("La edad es: " + edad);

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
