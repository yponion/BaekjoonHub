import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(Math.round(4.0*n));

//        4*n
//        1 = 4
//        2 = 8
//        3 = 12
//        4 = 16
//        5 = 20
    }
}
