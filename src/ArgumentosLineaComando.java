//Abrir terminal
//Ingresar al src
// ejecutar le siguiente comando: javac ArgumentosLineaComando.java
// ejecutar el siguiente comando con los siguiente parametros: java ArgumentosLineaComando Andres pepe

public class ArgumentosLineaComando {
    public static void main(String[] args) {

        if (args.length  == 0) {
            System.out.println("Debe ingresar argumentos o parámetros");
            System.exit(-1);
        }

        for (int i = 0; i < args.length; i++) {
            System.out.println("Argumentos n°" + i + ": " + args[i]);
        }
    }
}
