import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a, b;
        try {
            String str = br.readLine();
            String[] ab = str.split(" ");
            a = ab[0];
            b = ab[1];
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        long result = 0;
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                result += (long) Integer.parseInt(a.charAt(i) + "") * Integer.parseInt(b.charAt(j) + "");
            }
        }
        System.out.println(result);
    }
}