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
    }
}
