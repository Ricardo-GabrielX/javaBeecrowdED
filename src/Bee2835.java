import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bee2835 {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);

        // P = peso da cabine mais pesada
        // Q = peosa da cabine mais leve.
        // condição: P - Q <= 8 | Ou seja, entre as caixas não pode haver diferença maior que 8.

        // int N = numero de caixas
        // array pesos
        // ordenar e iterar sobre array para verificar condição aceita.

        ArrayList<Integer> pesos = new ArrayList<>();

        int N = scanner.nextInt();

        for(int i = 0; i < N; i ++) {
            pesos.add(scanner.nextInt());
        }

        Collections.sort(pesos);

        char possivel = 'S';

        if(pesos.get(0) > 8) {
            possivel = 'N';
        }
        else {
            for( int i = 1; i < pesos.size(); i++) {
                if(pesos.get(i) - pesos.get(i-1) > 8) {
                    possivel = 'N';
                    break;
                }
            }
        }

        System.out.println(possivel);

        scanner.close();

    }

}

