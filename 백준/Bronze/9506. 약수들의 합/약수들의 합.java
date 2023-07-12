import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            int n = Integer.parseInt(br.readLine());
            if(n == -1){
                break;
            }
            perfectCheck(n);
        }
    }
    public static void perfectCheck(int n){
        int sum = 0;
        String tmp = "";
        boolean firstInput = true;
        for(int i = 1; i<=n/2; i++){
            if(n%i==0){
                sum+=i;
                if(firstInput){
                    tmp += i;
                    firstInput = false;
                }else{
                    tmp += " + "+i;
                }
            }
        }
        if(sum==n){
            System.out.println(n+" = "+tmp);
        }else{
            System.out.println(n+" is NOT perfect.");
        }
    }
}
