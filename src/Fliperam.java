import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Fliperam {


// receber duas variaveis. n é quantidade de partidas, m quantidade de linhas que devemos retornar
// m deve ser as maiores pontuações obtidas.
// exibe em ordem descrescente.

        public static void main(String[] args) throws IOException {
            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            // meu pontuacoes tem que receber o numero M de tamanho pq seria a quantidade de partidas e isso
            // teria que permitir ao usuario digitar esse tamanho de partidas

            // primeiro for para receber quantidade de pontuações de acordo com variavel N
            int[] pontuacoes =  new int[N];
            for(int i = 0; i < N; i ++){
                pontuacoes[i] = scanner.nextInt();
            }


            // ordena
            Arrays.sort(pontuacoes);

            // Exibe as maiores notas
            // Usando M como parâmetro para iterar sobre as maires notas.
            // E claro, exibe em ordem decrescente.
            for(int i = 0; i < M; i ++){
                System.out.println(pontuacoes[N - 1 - i]);
            }


        }




}
