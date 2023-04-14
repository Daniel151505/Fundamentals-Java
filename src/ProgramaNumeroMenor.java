import java.util.Scanner;

public class ProgramaNumeroMenor {
    public static void main(String[] args) {

        Integer cantidadTotalComparar, numeroMenor = Integer.MAX_VALUE, numeroIngresado;
        String totalNumeros = "";
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Ingresa la cantidad de números a comparar");
            cantidadTotalComparar = scanner.nextInt();

            if(cantidadTotalComparar < 10) {
                System.out.println("Debes ingresar un número entero mayor que 9");
                main(args);
                System.exit(0);
            } else {

                for (int i = 1; i <= cantidadTotalComparar ; i++) {
                    System.out.println("Ingresa el número " + i + ", recuerda que debe ser un número entero.");
                    numeroIngresado = scanner.nextInt();
                    totalNumeros += numeroIngresado + " - ";
                    numeroMenor = numeroIngresado < numeroMenor ? numeroIngresado : numeroMenor;
                }

                System.out.println("De un total de " + cantidadTotalComparar + " números");
                System.out.println("Donde los números ingresados fueron " + totalNumeros.substring(0, totalNumeros.length() - 3));
                System.out.println("El número menor es: " + numeroMenor);
                
                if (numeroMenor < 10) {
                    System.out.println("¡El número menor es menor que 10!");
                } else if (numeroMenor == 10) {
                    System.out.println("¡El número es igual que 10!");
                } else {
                    System.out.println("¡El número es mayor que 10!");
                }

            }
        } catch (Exception e) {
            System.out.println("Debe ingresar solo números enteros");
            main(args);
            System.exit(0);
        }

    }
}
