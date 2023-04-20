public class EjemploClaseMath {
    public static void main(String[] args) {

        // Valor absoluto
        int abosoluto = Math.abs(-3);
        System.out.println("abosoluto = " + abosoluto);

        abosoluto = Math.abs(3);
        System.out.println("abosoluto = " + abosoluto);

        // Valor máximo
        double max = Math.max(3.5, 1.2);
        System.out.println("max = " + max);

        // Valor mínimo
        double min = Math.min(3.5 , 1.2);
        System.out.println("min = " + min);

        // Redondeo hacia arriba
        double techo = Math.ceil(3.5);
        System.out.println("techo = " + techo);

        // Rendondeo hacia abajo
        double piso = Math.floor(Math.PI);
        System.out.println("piso = " + piso);

        // Rendondeo
        long entero = Math.round(3.5);
        System.out.println("entero = " + entero);

        double exp = Math.exp(1);
        System.out.println("exp = " + exp);
        
        double log = Math.log(10);
        System.out.println("log = " + log);

        double potencia = Math.pow(10, 3);
        System.out.println("potencia = " + potencia);

        double raiz = Math.sqrt(5);
        System.out.println("raiz = " + raiz);

        // radianes a grados
        double grados = Math.toDegrees(1.57);
        grados = Math.round(grados);
        System.out.println("convertir de radiande a grados = " + grados);

        // grados a radianes
        double radianes = Math.toRadians(98.00);
        System.out.println("convertir grados a radianes = " + radianes);

        // seno
        System.out.println("sin(90) = " + Math.sin(radianes));

        // coseno
        System.out.println("cos(90) = " + Math.cos(radianes));

        radianes = Math.toRadians(180.00);

        System.out.println("cos(180) = " + Math.cos(radianes));

        radianes = Math.toRadians(0.00);

        System.out.println("cos(0) = " + Math.cos(radianes));
    }
}
