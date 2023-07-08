import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int matrix[][] = new int[9][9];
        for( int i = 0; i<9; i++){
            int tmp[] = strToIntAry(br.readLine());
            matrix[i] = tmp;
        }
        int max = 0;
        int index_i = 0;
        int index_j = 0;
        for( int i = 0; i<9; i++){
            for( int j = 0; j<9; j++){
                if(matrix[i][j]>=max){
                    max = matrix[i][j];
                    index_i = i+1;
                    index_j = j+1;
                }
            }
        }
        System.out.println(max);
        System.out.println(index_i+" "+index_j);

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
