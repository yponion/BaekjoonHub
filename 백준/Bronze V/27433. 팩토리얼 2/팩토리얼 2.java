import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        process();
    }

    public static void process() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println(factorial(Long.parseLong(br.readLine())));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static long factorial(long n) {
        if (n == 0) return 1;
        else return n * factorial(n - 1);
    }
}