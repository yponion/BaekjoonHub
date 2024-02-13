import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        process();
    }

    public static void process() {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nk;
        try {
            nk = strToIntAry(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(factorial(nk[0]) / (factorial(nk[1]) * factorial(nk[0] - nk[1])));
    }

    // 팩토리얼
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // String -> int[]
    public static int[] strToIntAry(String str) {
        String[] tmpStr = str.split(" ");
        int[] tmpInt = new int[tmpStr.length];
        for (int i = 0; i < tmpStr.length; i++) {
            tmpInt[i] = Integer.parseInt(tmpStr[i]);
        }
        return tmpInt;
    }
}