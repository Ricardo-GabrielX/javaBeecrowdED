import java.io.IOException;
import java.util.Scanner;

public class Overflow {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int P = scanner.nextInt();
        String op = scanner.next();
        int Q = scanner.nextInt();

        int resultado = 0;

        if (op.equals("+")) {
            resultado = P + Q;
        } else if (op.equals("*")) {
            resultado = P * Q;
        }

        if (resultado <= N) {
            System.out.println("OK");
        }
        else{
            System.out.println("OVERFLOW");
        }

        scanner.close();
    }
}
