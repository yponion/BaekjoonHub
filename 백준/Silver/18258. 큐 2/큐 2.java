import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();
        int last = -1;
        StringBuilder sb = new StringBuilder();
        int n = 0;
        try {
            n = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String str;
        for (int i = 0; i < n; i++) {
            try {
                str = br.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            switch (str.charAt(1)) {
                case 'u':
                    String[] tmpStr = str.split(" ");
                    last = Integer.parseInt(tmpStr[1]);
                    queue.add(last);
                    break;
                case 'o':
                    if (queue.peek() == null) {
                        sb.append(-1 + "\n");
                    } else {
                        sb.append(queue.poll() + "\n");
                    }
                    break;
                case 'i':
                    sb.append(queue.size() + "\n");
                    break;
                case 'm':
                    sb.append(queue.isEmpty() ? 1 + "\n" : 0 + "\n");
                    break;
                case 'r':
                    sb.append(queue.isEmpty() ? -1 + "\n" : queue.peek() + "\n");
                    break;
                case 'a':
                    sb.append(queue.isEmpty() ? -1 + "\n" : last + "\n");
                    break;
                default:
                    sb.append("error\n");
            }
        }
        System.out.println(sb);
    }
}