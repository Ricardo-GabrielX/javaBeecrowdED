import java.io.IOException;
import java.util.Scanner;

public class Soma {

        public static void main(String[] args) throws IOException {

            Scanner scanner = new Scanner(System.in);

            int A = scanner.nextInt();
            int B = scanner.nextInt();

            int SOMA = A + B;

            System.out.println("SOMA = " + SOMA);
        }


}
