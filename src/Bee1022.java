import java.io.IOException;
import java.util.Scanner;


public class Bee1022 {

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

        // Subtração de números racionais
        public NumeroRacional subtrair(NumeroRacional outro) {
            int novoNumerador = (this.numerador * outro.denominador)
                    - (outro.numerador * this.denominador);
            int novoDenominador = this.denominador * outro.denominador;

            return new NumeroRacional(novoNumerador, novoDenominador);
        }

        // Multiplicação de números racionais
        public NumeroRacional multiplicar(NumeroRacional outro) {
            int novoNumerador = this.numerador * outro.numerador;
            int novoDenominador = this.denominador * outro.denominador;

            return new NumeroRacional(novoNumerador, novoDenominador);
        }

        // Divisão de números racionais
        public NumeroRacional dividir(NumeroRacional outro) {
            int novoNumerador = (this.numerador * outro.denominador);
            int novoDenominador = outro.numerador * this.denominador;

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


    public static void main(String[] args)  throws IOException {

        Scanner s = new Scanner(System.in);

        int tamanho = s.nextInt();

        for (int i = 0; i < tamanho; i++) {
            // recebendo Valores
            int n1 = s.nextInt();
            String lixo = s.next(); // pegando a barra
            int d1 = s.nextInt();
            NumeroRacional X = new NumeroRacional(n1, d1);
            String operacao = s.next(); // pegando o sinal
            int n2 = s.nextInt();
            lixo = s.next(); // pegando a barra
            int d2 = s.nextInt();
            NumeroRacional Y = new NumeroRacional(n2, d2);
            NumeroRacional R = null;

            switch(operacao) {
                case "+":
                    R = X.somar(Y);
                    break;
                case "-":
                    R = X.subtrair(Y);
                    break;

                case "*":
                    R = X.multiplicar(Y);
                    break;

                case "/":
                    R = X.dividir(Y);
                    break;

            }

            NumeroRacional simplificado = R.simplificar();

            System.out.printf("%d/%d = %d/%d\n", R.num(), R.den(), simplificado.num(), simplificado.den());

        }



    }

}

