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
        int[] nm;
        String[][] guard;
        try {
            nm = strToIntAry(br.readLine());
            guard = new String[nm[0]][nm[1]];
            for (int i = 0; i < guard.length; i++) {
                guard[i] = br.readLine().split("");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        boolean inX = false;

        int rowCnt = 0;
        for (int i = 0; i < guard.length; i++) {
            inX = false;
            for (int j = 0; j < guard[i].length; j++) {
                if (guard[i][j].equals("X")) {
                    inX = true;
                    break;
                }
            }
            if (!inX) {
                rowCnt++;
            }
        }

        int colCnt = 0;
        for (int i = 0; i < guard[0].length; i++) {
            inX = false;
            for (int j = 0; j < guard.length; j++) {
                if (guard[j][i].equals("X")) {
                    inX = true;
                    break;
                }
            }
            if (!inX) {
                colCnt++;
            }
        }

        System.out.println(Math.max(rowCnt, colCnt));


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
