import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for( int i = 0;i <n; i++){
            int money = Integer.parseInt(br.readLine());
            int change[] = new int[4];
            change[0] = money/25;
            money%=25;
            change[1] = money/10;
            money%=10;
            change[2] = money/5;
            money%=5;
            change[3] = money;
            for(int j = 0; j< change.length; j++){
                System.out.print(change[j]+" ");
            }
            System.out.println();
        }
    }
}
