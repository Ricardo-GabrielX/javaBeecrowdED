import java.io.IOException;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class Bee1281 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        if (!scanner.hasNextInt()) return;

        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {

            Map<String, Double> available = new HashMap<>();

            int M = scanner.nextInt();
            for (int k = 0; k < M; k++) {
                String product = scanner.next();
                double value = scanner.nextDouble();
                available.put(product, value);
            }

            int P = scanner.nextInt();
            double totalGasto = 0.0;

            for (int k = 0; k < P; k++) {
                String product = scanner.next();
                int quantity = scanner.nextInt();

                if (available.containsKey(product)) {
                    totalGasto += available.get(product) * quantity;
                }
            }

            System.out.printf("R$ %.2f\n", totalGasto);
        }

        scanner.close();
    }
}