import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        process();
//        test();
    }

    public static void test() {

    }

    public static void process() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] ary;
        try {
            ary = strToIntAry(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Arrays.sort(ary);

        for (int i = ary[0]; ; i++) {
            int cnt = 0;
            for (int j = 0; j < ary.length; j++) {
                if (i % ary[j] == 0) {
                    cnt++;
                }
                if (cnt >= 3) {
                    break;
                }
            }
            if (cnt >= 3) {
                System.out.println(i);
                break;
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
