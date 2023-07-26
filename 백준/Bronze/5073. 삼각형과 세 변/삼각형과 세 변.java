import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int[] tmpIntAry = new int[3];
            try {
                tmpIntAry = strToIntAry(br.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            if (tmpIntAry[0] == 0 && tmpIntAry[1] == 0 && tmpIntAry[2] == 0) {
                break;
            } else {
                Arrays.sort(tmpIntAry);
                checkTriangle(tmpIntAry[0], tmpIntAry[1], tmpIntAry[2]);
            }
        }
    }

    public static int[] strToIntAry(String str) {
        String[] tmpStr = str.split(" ");
        int[] tmpInt = new int[tmpStr.length];
        for (int i = 0; i < tmpStr.length; i++) {
            tmpInt[i] = Integer.parseInt(tmpStr[i]);
        }
        return tmpInt;
    }

    public static void checkTriangle(int a, int b, int c) {

        if (a + b > c) {
            if (a == b && b == c && a == c) {
                System.out.println("Equilateral");
            } else if (a != b && b != c && a != c) {
                System.out.println("Scalene");
            } else {
                System.out.println("Isosceles");
            }
        } else {
            System.out.println("Invalid");
        }
    }
}