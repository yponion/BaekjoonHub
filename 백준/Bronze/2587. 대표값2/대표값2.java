import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ary[] = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            try {
                ary[i] = Integer.parseInt(br.readLine());
                sum += ary[i];
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(sum / 5);
        Arrays.sort(ary);
        System.out.println(ary[2]);

    }

}