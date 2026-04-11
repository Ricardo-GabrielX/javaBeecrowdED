import java.util.Scanner;

import java.io.IOException;


public class bee1044 {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if (A == 0 || B == 0) {
            System.out.println("Valores inválidos");
        } else{
            if(A > B) {
                if(A % B == 0){
                    System.out.println("Sao Multiplos");
                }
                else {
                    System.out.println("Nao sao Multiplos");
                }
            }
            else {
                if(B % A == 0){
                    System.out.println("Sao Multiplos");
                }
                else {
                    System.out.println("Nao sao Multiplos");
                }
            }
        }










    }

}
