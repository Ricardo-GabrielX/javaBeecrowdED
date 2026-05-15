import java.io.IOException;
import java.util.Scanner;

// Problems beecrowd | 2494 pens
public class Bee2494 {

    public static int calcularMDC(int a, int b) {
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);


        // O problema quer qtde iguais nos pacotes, isso envolve mdc.
        // cada pacote deve conter apenas canetas com a mesma cor.

        while (scanner.hasNextInt()) {
            int blue = scanner.nextInt();
            int black = scanner.nextInt();
            int teams = scanner.nextInt();

            int mdc = calcularMDC(blue, black);
            int pacotes = (blue / mdc) + (black / mdc);
            if (pacotes >= teams) {
                System.out.println("sim");
            } else {
                System.out.println("nao");
            }

        }
        scanner.close();

    }

}
