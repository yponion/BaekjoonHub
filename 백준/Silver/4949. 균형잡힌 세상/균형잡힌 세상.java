import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack();

        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        while (true) {
            try {
                str = br.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            if (str.equals(".")) {
                break;
            }
            boolean flag = true;
            for (int j = 0; j < str.length(); j++) {
                switch (str.charAt(j)) {
                    case '(':
                        stack.push(1);
                        break;
                    case '[':
                        stack.push(2);
                        break;
                    case ')':
                        try {
                            if (stack.peek().equals(1)) {
                                stack.pop();
                            } else {
                                flag = false;
                                j = str.length();
                            }
                        }catch (Exception e){
                            flag = false;
                            j = str.length();
                        }
                        break;
                    case ']':
                        try {
                            if (stack.peek().equals(2)) {
                                stack.pop();
                            } else {
                                flag = false;
                                j = str.length();
                            }
                        }catch (Exception e){
                            flag = false;
                            j = str.length();
                        }
                        break;
                    default:
                }
            }
            if (flag&&stack.isEmpty()) {
                sb.append("yes" + "\n");
            } else {
                sb.append("no" + "\n");
            }
            stack.clear();
        }
        System.out.println(sb);
    }

}