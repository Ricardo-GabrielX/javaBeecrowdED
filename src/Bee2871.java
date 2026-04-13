    import java.io.IOException;
    import java.util.Scanner;

    public class Bee2871 {
        // cada safra fosse representada por uma matriz na qual a borra de café fosse representada por cada célula.
        // Cada célula (planta de café) da matriz (safra) é preenchida com os valores de quantos litros (em grãos) de café o pé irá produzir naquele ano.
        // Supondo que cada saca equivale a 60 litros de café
        // Jhin precisa saber quantas sacas e quantos litros cada safra produzirá naquele ano.
            public static void main(String[] args) throws IOException {

                Scanner scanner = new Scanner(System.in);

                // while para garantir que todos os números sejam salvos, ou que todos façam completamente parte de uma operação.
                while (scanner.hasNextInt()) {

                    int M = scanner.nextInt(); // número de linhas
                    int N = scanner.nextInt(); // número de colunas
                    int[][] several = new int[M][N];

                    for(int i = 0; i < M; i++) {
                        for (int j = 0; j < N; j++) {
                            several[i][j] = scanner.nextInt();
                        }
                    }

                    int soma = 0;

                    for(int i = 0; i < M; i++) {
                            for(int j = 0; j < N; j++) {
                                soma += several[i][j] ;
                            }
                    }

                    int sacos = soma / 60;
                    int litros = soma % 60;

                    System.out.println(sacos + " saca(s) e " + litros + " litro(s)");

                }
                scanner.close();
            }



    }
