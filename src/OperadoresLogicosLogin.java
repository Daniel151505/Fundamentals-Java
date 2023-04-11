import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        /*
        String[] usernames = new String[3];
        String[] passwords = new String[3];
        usernames[0] = "daniel";
        passwords[0] = "1234";

        usernames[1]= "admin";
        passwords[1] = "123";

        usernames[2]= "pepe";
        passwords[2] = "12";
         */

        String[] usernames = {"andres", "admin", "pepe"};
        String[] passwords = {"1234", "123", "12"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el username");

        String u = scanner.next();

        System.out.println("Ingrese el password");
        String p = scanner.next();

        boolean esAutenticado = false;

        for (int i = 0; i < usernames.length; i++) {
            if (usernames[i].equals(u) && passwords[i].equals(p)) {
                esAutenticado = true;
                break;
            }
        }

        if (esAutenticado) {
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        } else {
            System.out.println("Username o contraseña incorrecto!");
            System.out.println("Lo siento, requiere autenticación");
        }
    }
}
