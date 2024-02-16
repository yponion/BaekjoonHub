import javax.swing.plaf.synth.SynthUI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // 입력
        String str;
        String bombStr;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            str = br.readLine();
            bombStr = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // ----- 입력

        // 스택에 문자열을 삽입 하면서 폭발 문자열 포함 확인(존재하면 pop)
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i)); // stack에 문자 1개 삽입
            boolean flag; // 폭발 문자열 확인 flag
            if (stack.size() >= bombStr.length()) { // 스택의 크기가 폭발 문자열의 길이 이상일 때 부터 포함 확인
                flag = true;
                for (int j = 0; j < bombStr.length(); j++) { // get을 활용하여 폭발 문자열 길이만큼의 stack끝부분을 폭발 문자열과 비교
                    if (stack.get(stack.size() - 1 - j) != bombStr.charAt(bombStr.length() - 1 - j)) {  // 폭발 문자열과 다른 문자가 있다면 비교 종료
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    for (int j = 0; j < bombStr.length(); j++) {
                        stack.pop();
                    }
                }
            }
        }
        // ----- 스택에 삽입 하면서 폭발 문자열 확인

        // 출력
        if (stack.isEmpty()) {
            System.out.println("FRULA");
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < stack.size(); i++) {
                sb.append(stack.get(i));
            }
            System.out.println(sb);
        }
        // ----- 출력
    }
}