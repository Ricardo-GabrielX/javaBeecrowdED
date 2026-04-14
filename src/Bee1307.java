import java.io.IOException;
import java.util.Scanner;


public class Bee1307 {

    public static int calcularMDC(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) return;

        int N = scanner.nextInt(); // número de casos de teste


        for (int i = 1; i <= N; i++) {
            String texto1 = scanner.next();
            int S1 = Integer.parseInt(texto1, 2);;
            String texto2 = scanner.next();
            int S2 = Integer.parseInt(texto2, 2);

            int mdc = calcularMDC(S1, S2);
            if (mdc > 1 ) {
                System.out.println("Pair #" + i + ": All you need is love!");
            }
            else {
                System.out.println("Pair #" + i + ": Love is not all you need!");
            }
        }
        scanner.close();

    }

}
