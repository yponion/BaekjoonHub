import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        try {
            n = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        HashSet<String> set = new HashSet<String>();
        for (int i = 0; i < n; i++) {
            try {
                String str = br.readLine();
                String strAry[] = str.split(" ");
                if (strAry[1].charAt(0) == 'e') {
                    set.add(strAry[0]);
                } else {
                    set.remove(strAry[0]);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        String strAry[] = set.toArray(new String[0]);
        Arrays.sort(strAry);
        for (int i = strAry.length - 1; i >= 0; i--) {
            System.out.println(strAry[i]);
        }
    }
}