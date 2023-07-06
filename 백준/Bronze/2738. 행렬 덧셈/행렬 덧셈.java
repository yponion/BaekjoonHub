import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int nm[] = strToIntAry(br.readLine());
        int matrix1[][] = new int[nm[0]][nm[1]];
        int matrix2[][] = new int[nm[0]][nm[1]];
        for(int i = 0; i<nm[0]; i++){
            int tmp[] = strToIntAry(br.readLine());
            for( int j = 0; j<nm[1]; j++){
                matrix1[i][j] = tmp[j];
            }
        }
        for(int i = 0; i<nm[0]; i++){
            int tmp[] = strToIntAry(br.readLine());
            for( int j = 0; j<nm[1]; j++){
                matrix2[i][j] = tmp[j];
            }
        }

        for(int i = 0; i<nm[0]; i++){
            for( int j = 0; j<nm[1]; j++){
                System.out.print(matrix1[i][j] + matrix2[i][j]+ " ");
            }
            System.out.println();
        }

    }
    public static int[] strToIntAry(String str){
        String tmpStr[] = str.split(" ");
        int tmpInt[] = new int[tmpStr.length];
        for(int i = 0; i<tmpStr.length; i++){
            tmpInt[i] = Integer.parseInt(tmpStr[i]);
        }
        return tmpInt;
    }
}
