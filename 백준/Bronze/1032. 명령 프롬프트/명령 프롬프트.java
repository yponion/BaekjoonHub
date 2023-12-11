import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String oriStr = new String();
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            if (i == 0) {
                oriStr = str;
            } else {
                for (int j = 0; j < oriStr.length(); j++) {
                    if (oriStr.charAt(j) != str.charAt(j)) {
                        oriStr = oriStr.substring(0, j) + '?' + oriStr.substring(j+1, oriStr.length());
                    }
                }
            }
        }
        System.out.println(oriStr);
    }
}