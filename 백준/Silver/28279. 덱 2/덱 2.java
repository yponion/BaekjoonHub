import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        try {
            n = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        StringBuilder sb = new StringBuilder();

        //LinkedList와 ArrayDeque의 차이
        //https://velog.io/@djawnstj/%EC%9E%90%EB%A3%8C%EA%B5%AC%EC%A1%B0-Java%EC%9D%98-LinkedList%EC%99%80-ArrayDeque
        Deque<Integer> deque = new ArrayDeque<>();

        String str;
        int in[] = new int[2];
        for (int i = 1; i <= n; i++) {
            try {
                str = br.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            if (str.length() != 1) {
                in = strToIntAry(str);
                switch (in[0]) {
                    case 1:
                        deque.addFirst(in[1]);
                        break;
                    case 2:
                        deque.addLast(in[1]);
                        break;
                    default:
                        sb.append("error\n");
                }
            } else {
                switch (str) {
                    case "3":
                        sb.append(deque.isEmpty() ? -1 + "\n" : deque.removeFirst() + "\n");
                        break;
                    case "4":
                        sb.append(deque.isEmpty() ? -1 + "\n" : deque.removeLast() + "\n");
                        break;
                    case "5":
                        sb.append(deque.size() + "\n");
                        break;
                    case "6":
                        sb.append(deque.isEmpty() ? 1 + "\n" : 0 + "\n");
                        break;
                    case "7":
                        sb.append(deque.isEmpty() ? -1 + "\n" : deque.getFirst() + "\n");
                        break;
                    case "8":
                        sb.append(deque.isEmpty() ? -1 + "\n" : deque.getLast() + "\n");
                        break;
                    default:
                        sb.append("error\n");
                }
            }
        }
        System.out.println(sb);
    }

    public static int[] strToIntAry(String str) {
        String[] tmpStr = str.split(" ");
        int[] tmpInt = new int[tmpStr.length];
        for (int i = 0; i < tmpStr.length; i++) {
            tmpInt[i] = Integer.parseInt(tmpStr[i]);
        }
        return tmpInt;
    }
}