import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int n, f;
        try {
            str = br.readLine();
            f = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                n = Integer.parseInt(str.substring(0, str.length() - 2) + i + "" + j);
                if (n % f == 0) {
                    System.out.println(i + "" + j);
                    return;
                }
            }
        }
        
    }
}
