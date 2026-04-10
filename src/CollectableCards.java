import java.io.IOException;
import java.util.Scanner;

public class CollectableCards {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int i,temp;
        for(i=0; i < N; i++){
            int F1 = scanner.nextInt();
            int F2 = scanner.nextInt();
            int resultado = econtrarMDC(F1, F2);
            System.out.println(resultado);
            }
    }

    public static  int econtrarMDC(int F1, int F2){
        while(F2 != 0 ){
            int temp = F2;
            F2 = F1 % F2;
            F1 = temp;
        }
        return F1;
    }

    public static boolean identidade(int mat[][], int n) {
        for(int i=0; i<n; i++) {
            if(mat[i][i]!=1)
                return false;
            for(int j=i+1; j<n; j++)
                if(mat[i][j]!=0 || mat[j][i]!=0)
                    return false;
        }
        return true;
    }
}
