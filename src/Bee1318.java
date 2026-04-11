import java.io.IOException;
import java.util.*;

public class Bee1318 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            int M = scanner.nextInt(); // número de tickets originais
            int N = scanner.nextInt(); // número de pessoas presentes

            if (M == 0 && N == 0) break;

            List<Integer> bilhetes = new ArrayList<>();

            // Lê os tickets apresentados
            for (int i = 0; i < N; i++) {
                int ticket = scanner.nextInt();
                bilhetes.add(ticket);
            }

            // Map para contar quantos tickets apareceram mais de uma vez
            Map<Integer, Integer> freq = new HashMap<>();

            for (int t : bilhetes) {
                freq.put(t, freq.getOrDefault(t, 0) + 1);
            }
            // Para relembrar.
            // Esses dois pontos dentro(:) do for, é basicamente um forEach
            // Pegar cada elemento da lista bilhetes
            // coloca o valor ba variável t
            // executa o bloco for
            // é só um formato mais simples de fazer uma iteração convencional
            // encontrei esse formato em algum lugar no StackOverflow quando fui procucar pela syntax do Map


            int duplicados = 0;

            for (int contagem : freq.values()) {
                if (contagem > 1) {
                    duplicados++;
                }
            }

            System.out.println(duplicados);
        }

        scanner.close();
    }
}