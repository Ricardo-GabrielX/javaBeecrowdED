import java.util.Scanner;



public class TestaRacionalUsandoClasse {
    int numerador;
    int denominador;
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

        public NumeroRacional() {
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

    public class TestaRacional {

    }

    public static void main(String[] args)  {

        Scanner s = new Scanner(System.in);

        System.out.println("Informe X: ");
        int num = s.nextInt();
        String lixo = s.next(); // pegando a barra
        int den = s.nextInt();
        NumeroRacional X = new NumeroRacional(num, den);

        System.out.println("Informe Y: ");
        num = s.nextInt();
        lixo = s.next(); // pegando a barra
        den = s.nextInt();
        NumeroRacional Y = new NumeroRacional(num, den);

        NumeroRacional R = X.somar(Y);
        System.out.printf("\n%d/%d + %d/%d = %d/%d\n",
                X.num(), X.den(),
                Y.num(), Y.den(),
                R.num(), R.den());

        R = X.subtrair(Y);
        System.out.printf("\n%d/%d - %d/%d = %d/%d\n",
                X.num(), X.den(),
                Y.num(), Y.den(),
                R.num(), R.den());

        R = X.multiplicar(Y);
        System.out.printf("\n%d/%d * %d/%d = %d/%d\n",
                X.num(), X.den(),
                Y.num(), Y.den(),
                R.num(), R.den());

        R = X.dividir(Y);
        System.out.printf("\n%d/%d / %d/%d = %d/%d\n",
                X.num(), X.den(),
                Y.num(), Y.den(),
                R.num(), R.den());

        NumeroRacional b = R;
        R = R.simplificar();
        System.out.printf("\n%d/%d = %d/%d\n",
                b.num(), b.den(),
                R.num(), R.den());

        s.close();
    }
}
