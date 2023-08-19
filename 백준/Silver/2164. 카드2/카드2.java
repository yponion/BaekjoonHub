import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();
        int n = 0;
        try {
            n = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }
        boolean flag = true;
        while (queue.size() > 1) {
            if (flag) {
                queue.poll();
                flag = false;
            } else {
                queue.add(queue.poll());
                flag = true;
            }
        }
        System.out.println(queue.peek());
    }
}