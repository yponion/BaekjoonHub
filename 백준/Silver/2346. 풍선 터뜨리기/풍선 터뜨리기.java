import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Main {
    static int n;
    static int[] balloon;
    static Deque<Integer> deque = new ArrayDeque<>();

    public static void main(String[] args) {
        process();
    }

    public static void process() {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nTmp;
        try {
            nTmp = strToIntAry(br.readLine());
            balloon = strToIntAry(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        n = nTmp[0];

        // 덱에 자료(풍선 번호) 삽입
        for (int i = 1; i <= n; i++) {
            deque.addLast(i);
        }

        // 제일 처음에는 1번 풍선을 터뜨림
        bomb(0);
    }

    // String -> int[]
    public static int[] strToIntAry(String str) {
        String[] tmpStr = str.split(" ");
        int[] tmpInt = new int[tmpStr.length];
        for (int i = 0; i < tmpStr.length; i++) {
            tmpInt[i] = Integer.parseInt(tmpStr[i]);
        }
        return tmpInt;
    }

    // 풍선 터트리기
    public static void bomb(int move) {
        int tmp = 0;
        if (move == 0) {
            tmp = deque.removeFirst();
        } else if (move > 0) {
            for (int i = 0; i < move - 1; i++) {
                deque.addLast(deque.removeFirst());
            }
            tmp = deque.removeFirst();
        } else {
            for (int i = 0; i < Math.abs(move) - 1; i++) {
                deque.addFirst(deque.removeLast());
            }
            tmp = deque.removeLast();
        }

        System.out.print(tmp + " ");
        if (deque.size() <= 0) {
            return;
        }
//        System.out.println("tmp " + tmp);
//        System.out.println("balloon[tmp - 1] " + balloon[tmp - 1]);
        bomb(balloon[tmp - 1]);
    }
}