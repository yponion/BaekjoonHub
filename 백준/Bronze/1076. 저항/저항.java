import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = new String[3];
        try {
            input[0] = br.readLine();
            input[1] = br.readLine();
            input[2] = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // ----- 입력

        // 색상에 따른 출력
        StringBuilder sb = new StringBuilder();
        if (findColor(input[0]) != 0) {
            sb.append(findColor(input[0]));
        }
        sb.append(findColor(input[1]));
        if (!(findColor(input[0]) == 0 && findColor(input[1]) == 0)) {
            for (int i = 0; i < findColor(input[2]); i++) {
                sb.append(0);
            }
        }
        System.out.println(sb);
        // ----- 색상에 따른 출력
    }


    public static int findColor(String str) {
        String[] color = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        // value = 0 ~ 9, mul = 1 ~ 1,000,000,000

        int result = -1;
        for (int i = 0; i < 10; i++) {
            if (color[i].equals(str)) {
                result = i;
                break;
            }
        }
        return result;
    }
}