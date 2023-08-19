import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        try {
            n = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        if (n == 1) {
            System.out.println(1);
        } else {
            int pow = 1;
            while (n > Math.pow(2, pow)) {
                pow++;
            }
            System.out.println(Math.round((n - Math.pow(2, pow - 1)) * 2));
        }

//        //규칙 찾기
//        Queue<Integer> queue = new LinkedList<>();
//        for (int i = 1; i < 100; i++) {
//            queue.clear();
//            for (int j = 1; j <= i; j++) {
//                queue.add(j);
//            }
//            boolean flag = true;
//            while (queue.size() > 1) {
//                if (flag) {
//                    queue.poll();
//                    flag = false;
//                } else {
//                    queue.add(queue.poll());
//                    flag = true;
//                }
//            }
//            System.out.println(i + " : " + queue.peek());
//        }
    }
}