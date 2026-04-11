// Número de Envelopes - Bee 2341
// OBI 2009

import java.io.IOException;
import java.util.Scanner;

public class Bee2341 {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // quantidade de rótulos que Aldo possui
        int K = scanner.nextInt(); // número de tipos diferentes de bala

        int[] contagem = new int[K + 1];

        for (int i = 0; i < N; i++) {
            int tipo = scanner.nextInt();
            contagem[tipo]++;
        }

        int menor = Integer.MAX_VALUE;

        for (int i = 1; i <= K; i++) {
            if (contagem[i] < menor) {
                menor = contagem[i];
            }
        }


        System.out.println(menor);
    }
}