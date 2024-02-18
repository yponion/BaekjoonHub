import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        // 입력
        String[] strAry;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            strAry = br.readLine().split(" ");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // ----- 입력

        if (strAry[0].length() < 4 && strAry[1].length() < 4) {
            int a = Integer.parseInt(strAry[0]);
            int b = Integer.parseInt(strAry[1]);
            System.out.println(getLCM(a, b));
        } else {
            long a = Integer.parseInt(strAry[0]);
            long b = Integer.parseInt(strAry[1]);
            System.out.println(getLCM(a, b));
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

    // 최대공약수 int
    public static int getGCD(int num1, int num2) {
        if (num1 % num2 == 0) {
            return num2;
        }
        return getGCD(num2, num1 % num2);
    }

    // 최대공약수 long
    public static long getGCD(long num1, long num2) {
        if (num1 % num2 == 0) {
            return num2;
        }
        return getGCD(num2, num1 % num2);
    }

    // 최소공배수 int
    public static int getLCM(int a, int b) {
        return a * b / getGCD(a, b);
    }

    // 최소공배수 long
    public static long getLCM(long a, long b) {
        return a * b / getGCD(a, b);
    }
}