import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        process();
    }

    public static void process() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        String input;
        List<Integer> stack = new ArrayList<>();
        try {
            n = Integer.parseInt(br.readLine());
            for (int i = 0; i < n; i++) {
                input = br.readLine();
                switch (input.charAt(0)) {
                    case 'p':
                        if (input.charAt(1) == 'u') { // push x
                            stack.add(Integer.parseInt(input.substring(5)));
                        } else { // pop
                            if (stack.isEmpty()) System.out.println(-1);
                            else System.out.println(stack.remove(stack.size() - 1));
                        }
                        break;
                    case 's': // size
                        System.out.println(stack.size());
                        break;
                    case 'e': // empty
                        if (stack.isEmpty()) System.out.println(1);
                        else System.out.println(0);
                        break;
                    case 't': // top
                        if (stack.isEmpty()) System.out.println(-1);
                        else System.out.println(stack.get(stack.size() - 1));
                        break;
                }
            }
            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}