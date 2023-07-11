import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String tmp[] = str.split(" ");
        String n = tmp[0];
        int b = Integer.parseInt(tmp[1]);

        System.out.println(Integer.parseInt(n, b));
    }
}
