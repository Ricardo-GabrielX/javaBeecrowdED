import java.io.IOException;
import java.util.Scanner;

public class Bee2448 {

        public static class NumeroRacional {

            int denominador;
            int numerador;

            // Construtor compacto para validação e simplificação
            public  NumeroRacional(int numerador, int denominador) {
                if (denominador == 0) {
                    throw new IllegalArgumentException("O denominador não pode ser zero.");
                }
                // Garante que o sinal negativo fique no numerador
                if (denominador < 0) {
                    numerador = -numerador;
                    denominador = -denominador;
                }

                this.numerador = numerador;
                this.denominador = denominador;
            }

            // Adição de números racionais
            public NumeroRacional somar(NumeroRacional outro) {
                int novoNumerador = (this.numerador * outro.denominador)
                        + (outro.numerador * this.denominador);
                int novoDenominador = this.denominador * outro.denominador;

                return new NumeroRacional(novoNumerador, novoDenominador);
            }

            // Simplificação de números racionais
            public NumeroRacional simplificar() {
                // Simplifica a fração automaticamente
                int mdc = calcularMDC(Math.abs(this.numerador), this.denominador);
                int novoNumerador = this.numerador / mdc;
                int novoDenominador = this.denominador / mdc;

                return new NumeroRacional(novoNumerador, novoDenominador);
            }

            // Método privado para calcular o Máximo Divisor Comum (MDC) usando o algoritmo de Euclides
            private static int calcularMDC(int a, int b) {
                if (a < 0) a = -a;
                if (b < 0) b = -b;

                while (b != 0) {
                    int temp = b;
                    b = a % b;
                    a = temp;
                }
                return a;
            }

            // Sobrescreve o método toString para uma representação amigável (ex: "1/2")
            @Override
            public String toString() {
                if (denominador == 1) {
                    return String.valueOf(numerador);
                }
                return numerador + "/" + denominador;
            }

            public int num() {
                return numerador;
            }

            public int den() {
                return denominador;
            }
        }

        public static void main(String[] args) throws IOException {

        Scanner s = new Scanner(System.in);

            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();
            int d = s.nextInt();

            NumeroRacional X = new NumeroRacional(a,b);
            NumeroRacional Y = new NumeroRacional(c,d);

            NumeroRacional R = X.somar(Y).simplificar();

            System.out.println(R.numerador + " " + R.denominador);


        s.close();
        }
}
