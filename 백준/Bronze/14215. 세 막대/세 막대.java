import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] tmpIntAry;
        try {
            tmpIntAry = strToIntAry(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Arrays.sort(tmpIntAry);
        makeTriangle(tmpIntAry[0], tmpIntAry[1], tmpIntAry[2]);

    }

    public static int[] strToIntAry(String str) {
        String[] tmpStr = str.split(" ");
        int[] tmpInt = new int[tmpStr.length];
        for (int i = 0; i < tmpStr.length; i++) {
            tmpInt[i] = Integer.parseInt(tmpStr[i]);
        }
        return tmpInt;
    }

    public static void makeTriangle(int a, int b, int c) {

        if (a + b > c) {
            System.out.println(a + b + c);
        } else {
            System.out.println(a + b + (a + b - 1));
        }
    }
}