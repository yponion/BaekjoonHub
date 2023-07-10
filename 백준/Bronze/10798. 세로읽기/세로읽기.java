import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;
        int len[] = new int[5];
        String str[] = new String[5];
        for(int i = 0; i<5; i++){
            str[i] = br.readLine();
            len[i] = str[i].length();
            if( max < len[i] ){
                max = len[i];
            }
        }

        for(int i = 0; i<max; i++){
            for(int j = 0;j<5; j++){
                if (i<len[j]){
                    System.out.print(str[j].charAt(i));
                }
            }
        }

    }
}
