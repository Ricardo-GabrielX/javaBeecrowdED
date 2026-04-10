import java.io.IOException;
import java.util.Scanner;

public class Diferenca {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int produtoAB = A * B;

        int C = scanner.nextInt();
        int D = scanner.nextInt();

        int produtoCD = C * D;

        int DIFERENCA = produtoAB - produtoCD;


        System.out.println("DIFERENCA = " + DIFERENCA);

    }
}
