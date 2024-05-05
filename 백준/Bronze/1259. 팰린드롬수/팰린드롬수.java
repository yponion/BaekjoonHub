import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        process();
//        test();
    }

    public static void test() {

    }

    public static void process() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num;
        while (true) {
            try {
                num = br.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            if (num.equals("0")) break;
            String a = num.substring(0, num.length() / 2);
            String b;
            if (num.length() % 2 == 0) b = num.substring(num.length() / 2);
            else b = num.substring(num.length() / 2 + 1);

            StringBuffer sb = new StringBuffer(b);
            b = sb.reverse().toString();
            if (a.equals(b)) System.out.println("yes");
            else System.out.println("no");
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
