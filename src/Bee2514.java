import java.io.IOException;

import java.util.Scanner;

public class Bee2514 {

    public static long calcularMDC(long a, long b) {
        while(b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static long calcularMMC(long a, long b) {
        if(a == 0 || b == 0 ) return 0;
        return Math.abs(a * b) / calcularMDC(a, b);

    }

    public static void main(String[] args) throws IOException {

        // int m = a última occorrência de alinhamento sol com as 3 luas
        // int l1 = tempo da lua para percorrer o sol.
        // int l2 = tempo da lua para percorrer o sol.
        // int l3 = tempo da lua para percorrer o sol.

        // Como eu calculo quando as 3 se alinharem, baseado no input que vou receber
        // mmc entre os 3....

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLong()) {

            long M = scanner.nextLong();
            long L1 = scanner.nextLong();
            long L2 = scanner.nextLong();
            long L3 = scanner.nextLong();

            // A sua lógica exata
            long mmcDoisValores = calcularMMC(L1, L2);
            long mmcResultado = calcularMMC(mmcDoisValores, L3);

            System.out.println(mmcResultado - M);
        }

        scanner.close();


    }


}

