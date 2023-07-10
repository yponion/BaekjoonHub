import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        boolean ary[][] = new boolean[100][100];
        for( int i = 0; i<n; i++){
            int xy[] = strToIntAry(br.readLine());
            for(int j = xy[0]; j<xy[0]+10; j++){
                for(int k = xy[1]; k<xy[1]+10; k++){
                    ary[j][k] = true;
                }
            }
        }
        int cnt = 0;
        for(int i = 0; i<100; i++){
            for(int j = 0; j<100; j++){
                if(ary[i][j]){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);

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
