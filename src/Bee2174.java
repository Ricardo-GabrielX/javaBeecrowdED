import java.io.IOException;
import java.util.*;

public class Bee2174 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int qtdePokemons = 151;
        if (!scanner.hasNextInt()) return;

        int receivePokemons = scanner.nextInt();
        scanner.nextLine();

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < receivePokemons; i++) {
            String received = scanner.nextLine();
            map.put(received, map.getOrDefault(received, 0) + 1);
        }

        int falta = qtdePokemons - map.size();
        System.out.println("Falta(m) " + falta + " pomekon(s).");

        scanner.close();
    }
}