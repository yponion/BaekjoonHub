import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Main {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int nb[] = strToIntAry(br.readLine());
        String str = Integer.toString(nb[0], nb[1]);
        System.out.println(str.toUpperCase());
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
