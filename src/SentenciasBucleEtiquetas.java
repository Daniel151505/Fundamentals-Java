public class SentenciasBucleEtiquetas {
    public static void main(String[] args) {

        bucle1:
        for (int i = 0; i < 5; i++) {

            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    continue bucle1;
                }
                System.out.print("[i = " + i + ", j = " + j + "], ");
            }
        }

        System.out.println("\n=============================");

        bucle2:
        for (int i = 0; i < 5; i++) {

            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    break bucle2;
                }
                System.out.print("[i = " + i + ", j = " + j + "], ");
            }
        }

        System.out.println("\n=============================");

        bucle3:
        for (int k = 0; k < 5; k++) {

            System.out.println();
            int l = 0;
            while (l < 5) {
                if (k == 2) {
                    continue bucle3;
                }
                System.out.print("[k = " + k + ", l = " + l + "], ");
                l++;
            }
        }

        System.out.println("\n=============================");

        bucle3:
        for (int k = 0; k < 5; k++) {

            System.out.println();
            int l = 0;
            while (l < 5) {
                if (k == 2) {
                    continue bucle3;
                }
                System.out.print("[k = " + k + ", l = " + l + "], ");
                l++;
            }
        }

        System.out.println("\n=============================");

        bucle4:
        for (int k = 1; k <= 7; k++) {
            int l = 1;
            while (l <= 8) {
                if (k == 6 || k == 7) {
                    System.out.println("Día " + k + ": descanso de fin de semana!");
                    continue bucle4;
                }
                System.out.println("Día = " + k + ", trabajando a las = " + l + "hrs. ");
                l++;
            }
        }
    }
}
