import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n;
    static int[] ary;
    static Stack<Integer> stack = new Stack<>();
    static int cnt = 1;

    public static void main(String[] args) {
        process();
//        test();
    }

    public static void test() {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        System.out.println(10);
        for (int i : list) {
            System.out.print(i + " ");
        }
    }

    public static void process() {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nTmp;
        try {
            nTmp = strToIntAry(br.readLine());
            ary = strToIntAry(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        n = nTmp[0];

        // 대기열을 순회하며 번호가 맞으면 라인을 통과, 맞지 않으면 stack으로 이동
        for (int i = 0; i < ary.length; i++) {
            if (ary[i] == cnt) {
                cnt++;
//                System.out.println("현재 cnt = " + cnt + ", list에서 나온 값 = " + ary[i] + " 통과");
            } else if (!stack.empty() && stack.peek() == cnt) {
//                System.out.println("현재 cnt = " + cnt + ", stack에서 나온 값 = " + stack.peek() + " 통과");
                stack.pop();
                cnt++;
                i--;
            } else {
//                System.out.println("현재 cnt = " + cnt + ", list에서 나온 값 = " + ary[i] + " stack");
                stack.push(ary[i]);
            }
        }

//        System.out.println("--스택--");
//        System.out.println(stack);

        // stack이 비어있다면 실행안함
        // stack을 순서대로 빼내며 순서가 맞으면 라인을 통과, 맞지 않으면 "Sad" 종료
        boolean flag = true;
        while (!stack.empty()) {
            int tmp = stack.pop();
            if (tmp == cnt) {
//                System.out.println("현재 cnt = " + cnt + ", stack에서 나온 값 = " + tmp + " 통과");
                cnt++;
            } else {
//                System.out.println("현재 cnt = " + cnt + ", stack에서 나온 값 = " + tmp + " 종료");
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.print("Nice");
        } else {
            System.out.print("Sad");
        }

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
}