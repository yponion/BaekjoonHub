import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        process();
    }

    public static void process() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] input;
        try {
            input = strToIntAry(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int N = input[0]; // 운동 시간
        int pluse = input[1]; // 맥박
        int m = input[1]; // 맥박 최솟값
        int M = input[2]; // 맥박 최댓값
        int T = input[3]; // 맥박 증가량
        int R = input[4]; // 맥박 감소량
        int time = 0;
        if (M - m < T) {
            System.out.println(-1);
        } else {
            while (N > 0) {
                if (pluse + T <= M) {
                    pluse += T;
                    N--;
                } else if (pluse - R >= m) {
                    pluse -= R;
                } else if (pluse - R < m) {
                    pluse = m;
                }
                time++;
            }
            System.out.println(time);
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
