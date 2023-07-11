import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int tmp = 2;

        for( int i = 0; i<n; i++ ){
            tmp = 2*tmp-1;
        }
        System.out.println(tmp*tmp);
//        2*n-1
//        0 = 4 = 2*2
//        1 = 9 = 3*3
//        2 = 25 = 5*5
//        3 = 9*9
//        4 = 17*17
//        5 = 1089 = 33*33
    }
}
