import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class Bee1926 {
    static final int MAX = 1000000;

    public static void main(String[] args) throws IOException {
        boolean[] isPrime = new boolean[MAX + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i <= MAX; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= MAX; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int[] somaAcumulada = new int[MAX + 1];
        for (int i = 2; i <= MAX; i++) {
            somaAcumulada[i] = somaAcumulada[i - 1];
            if (isPrime[i]) {
                if ((i - 2 >= 2 && isPrime[i - 2]) || (i + 2 <= MAX && isPrime[i + 2])) {
                    somaAcumulada[i]++;
                }
            }
        }

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int Q = scanner.nextInt();
            for (int i = 0; i < Q; i++) {
                int X = scanner.nextInt();
                int Y = scanner.nextInt();

                int menor = Math.min(X, Y);
                int maior = Math.max(X, Y);

                int resposta = somaAcumulada[maior] - somaAcumulada[menor - 1];
                System.out.println(resposta);
            }
        }
        scanner.close();
    }
}