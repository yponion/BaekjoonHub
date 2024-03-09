import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        process();
//        test();
    }

    public static void test() {

    }

    public static void process() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] ab;
        try {
            ab = strToIntAry(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int a = ab[0];
        int b = ab[1];

        // 1 22 333 4444 55555 666666

        int index = 0;
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            for (int j = 1; j <= i; j++) {
                index++;
                if (index >= a) {
                    if (index > b) {
                        System.out.println(sum);
                        return;
                    }
//                    System.out.println("i: " + i + ", j: " + j);
                    sum += i;
                }
            }
        }

    }

    // String -> int[]
    public static int[] strToIntAry(String str) {
        String[] strAry = str.split(" ");
        int[] intAry = new int[strAry.length];
        for (int i = 0; i < strAry.length; i++) {
            intAry[i] = Integer.parseInt(strAry[i]);
        }
        return intAry;
    }
}
