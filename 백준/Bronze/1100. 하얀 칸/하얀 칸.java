import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int cnt = 0;
        try {
            for (int i = 0; i < 8; i++) {
                str = br.readLine();
                if (i % 2 == 0) {
                    for (int j = 0; j < 8; j += 2) {
                        if (str.charAt(j) == 'F') cnt++;
                    }
                } else {
                    for (int j = 1; j < 8; j += 2) {
                        if (str.charAt(j) == 'F') cnt++;
                    }
                }
            }
            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(cnt);
    }
}