import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a, b, c, d;
        try {
            int ab[] = strToIntAry(br.readLine());
            a = ab[0];
            b = ab[1];
            ab = strToIntAry(br.readLine());
            c = ab[0];
            d = ab[1];
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int x = a * d + b * c;
        int y = b * d;

        /* x와 y의 공약수를 구해서 나누고를 반복 */
        while (true) {
            int tmp = getGCD(x, y);
            if (tmp > 1) {
                x /= tmp;
                y /= tmp;
            } else {
                break;
            }
        }
        
        System.out.println(x + " " + y);
    }

    public static int[] strToIntAry(String str) {
        String tmpStr[] = str.split(" ");
        int tmpInt[] = new int[tmpStr.length];
        for (int i = 0; i < tmpStr.length; i++) {
            tmpInt[i] = Integer.parseInt(tmpStr[i]);
        }
        return tmpInt;
    }

    // 최대 공약수
    public static int getGCD(int num1, int num2) {
        if (num1 % num2 == 0) {
            return num2;
        }
        return getGCD(num2, num1 % num2);
    }
}
