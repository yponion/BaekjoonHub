import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = -1;
        try {
            t = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String str = "";
        for (int i = 0; i < t; i++) {
            try {
                str = br.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            int cnt = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '(') {
                    cnt++;
                } else if (str.charAt(j) == ')') {
                    cnt--;
                } else {
                    System.out.println("error");
                }
                if (cnt < 0) {
                    break;
                }
            }
            if (cnt == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }


}