import java.io.IOException;
import java.util.Scanner;

public class SimpleSort {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int t = 1; t <= T; t++) {

            String filtro = scanner.next();

            int r = scanner.nextInt();
            int g = scanner.nextInt();
            int b = scanner.nextInt();

            int p = 0;

            switch (filtro) {
                case "min":
                    p = Math.min(r, Math.min(g, b));
                    break;

                case "max":
                    p = Math.max(r, Math.max(g, b));
                    break;

                case "mean":
                    p = (r + g + b) / 3;
                    break;

                case "eye":
                    p = (int) ((0.30 * r) + (0.59 * g) + (0.11 * b));
                    break;
            }

            System.out.println("Caso #" + t + ": " + p);
        }

        scanner.close();
    }
}