import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        process();
    }

    public static void process() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] dhw;
        try {
            dhw = strToIntAry(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int d = dhw[0];
        int h = dhw[1];
        int w = dhw[2];

//        a^2 + b^2 = d^2
        int a = (int) Math.floor(Math.sqrt((Math.pow(d, 2) / (Math.pow(h, 2) + Math.pow(w, 2))) * Math.pow(h, 2)));
        int b = (int) Math.floor(Math.sqrt((Math.pow(d, 2) / (Math.pow(h, 2) + Math.pow(w, 2))) * Math.pow(w, 2)));

        System.out.println(a + " " + b);

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
