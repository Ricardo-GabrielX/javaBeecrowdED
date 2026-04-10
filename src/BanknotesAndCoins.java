import java.io.IOException;
import java.util.Scanner;

public class BanknotesAndCoins {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        double input = scanner.nextDouble();

        int valor = (int) Math.round(input * 100);

        int[] notas = {10000, 5000, 2000, 1000, 500, 200};
        int[] moedas = {100, 50, 25, 10, 5, 1};

        System.out.println("NOTAS:");
        for (int i = 0; i < notas.length; i++) {
            int qtde = valor / notas[i];
            System.out.printf("%d nota(s) de R$ %.2f\n", qtde, notas[i] / 100.0);
            valor = valor % notas[i];
        }

        System.out.println("MOEDAS:");
        for (int i = 0; i < moedas.length; i++) {
            int qtde = valor / moedas[i];
            System.out.printf("%d moeda(s) de R$ %.2f\n", qtde, moedas[i] / 100.0);
            valor = valor % moedas[i];
        }

        scanner.close();
    }
}