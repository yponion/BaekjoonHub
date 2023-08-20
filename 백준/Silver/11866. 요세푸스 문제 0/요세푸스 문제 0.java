import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nk = new int[2];
        try {
            String[] tmp = br.readLine().split(" ");
            nk[0] = Integer.parseInt(tmp[0]);
            nk[1] = Integer.parseInt(tmp[1]);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= nk[0]; i++) {
            queue.add(i);
        }
        String str = "";
        int cnt = 0;
        while (!queue.isEmpty()) {
            if (++cnt < nk[1]) {
                queue.add(queue.poll());
            } else {
                str += queue.poll() + ", ";
                cnt = 0;
            }
        }
        System.out.println("<" + str.substring(0, str.length() - 2) + ">");
    }
}