import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        process();
    }

    public static void process() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        HashSet<String> set = new HashSet<>();
        int cnt = 0;
        String input = "";
        try {
            n = Integer.parseInt(br.readLine());
            for (int i = 0; i <= n; i++) {
                if (i == n) {
                    input = "ENTER";
                } else {
                    input = br.readLine();
                }
                // 입력 받으며 ENTER인지 확인, ENTER가 아니라면 set에 추가, ENTER가 맞다면 set의 크기를 계산하고 clear
                if (input.equals("ENTER")) {
                    cnt += set.size();
                    set.clear();
                } else {
                    set.add(input);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.print(cnt);
    }
}