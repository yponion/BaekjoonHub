import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[] stack = new int[100000];
    static int top = 0;

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        try {
            n = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int input = -1;
        for (int i = 0; i < n; i++) {
            try {
                input = Integer.parseInt(br.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            if (input == -1) {
                System.out.println("error");
            } else if (input == 0) {
                pop();
            } else {
                push(input);
            }
        }

        int sum = 0;
        for (int i = 0; i < top; i++) {
            sum += stack[i];
        }
        System.out.println(sum);
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