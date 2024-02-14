import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        process();
    }

    public static void process() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> set = new HashSet<>();
        String input = "";
        int n, cnt = 0;

        try {
            n = Integer.parseInt(br.readLine());
            for (int i = 0; i < n; i++) {
                input = br.readLine();
                // 입력 받으며 ENTER인지 확인, ENTER가 아니라면 set에 추가, ENTER가 맞다면 set의 크기를 계산하고 clear
                if (input.equals("ENTER")) {
                    set.clear();
                } else {
                    // set에 있는 값을 추가하면 false를 반환하는 것을 이용
                    if (set.add(input)) {
                        cnt++;
                    }
                }
            }
            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(cnt);
    }
}