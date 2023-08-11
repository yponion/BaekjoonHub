import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[] stack = new int[1000000];
    static int top = 0;

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        try {
            n = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String str;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            try {
                str = br.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            switch (str) {
                case "2":
                    sb.append(pop() + "\n");
                    break;
                case "3":
                    sb.append(top + "\n");
                    break;
                case "4":
                    if (isEmpty())
                        sb.append(1 + "\n");
                    else
                        sb.append(0 + "\n");
                    break;
                case "5":
                    sb.append(peek() + "\n");
                    break;
                default:
                    String tmpStr[] = str.split(" ");
                    int tmpInt[] = new int[2];
                    tmpInt[0] = Integer.parseInt(tmpStr[0]);
                    tmpInt[1] = Integer.parseInt(tmpStr[1]);
                    push(tmpInt[1]);
            }
        }
        System.out.println(sb);
    }

    public static boolean isFull() {
        return top >= 1000000;
    }

    public static boolean isEmpty() {
        return top <= 0;
    }

    public static void push(int data) {
        if (!isFull()) {
            stack[top++] = data;
        }
    }

    public static int pop() {
        return isEmpty() ? -1 : stack[--top];
    }

    public static int peek() {
        return isEmpty() ? -1 : stack[top - 1];
    }


}