import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int nk[] = strToIntAry(br.readLine());
        int cnt = 0;
        for(int i = 1; i<=nk[0]; i++){
            if(nk[0] % i == 0){
                cnt++;
                if(nk[1]==cnt){
                    System.out.println(i);
                    break;
                }
            }
        }
        if (cnt<nk[1]){
            System.out.println(0);
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
