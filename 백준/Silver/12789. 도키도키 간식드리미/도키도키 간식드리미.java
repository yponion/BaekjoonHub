import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    static int n;
    static int[] ary;
    static Stack<Integer> stack = new Stack<>();
    static int cnt = 1;

    public static void main(String[] args) {
        process();
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

        // 대기열을 순회하며 번호가 맞으면 라인을 통과, 맞지 않으면 스택의 번호 조회, 스택의 번호도 맞지 않으면 stack으로 이동
        for (int i = 0; i < ary.length; i++) {
            if (ary[i] == cnt) {
                cnt++;
            } else if (!stack.empty() && stack.peek() == cnt) {
                stack.pop();
                cnt++;
                i--;
            } else {
                stack.push(ary[i]);
            }
        }
        
        // stack이 비어있다면 실행안함
        // stack을 순서대로 빼내며 순서가 맞으면 라인을 통과, 맞지 않으면 "Sad" 종료
        boolean flag = true;
        while (!stack.empty()) {
            int tmp = stack.pop();
            if (tmp == cnt) {
                cnt++;
            } else {
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
