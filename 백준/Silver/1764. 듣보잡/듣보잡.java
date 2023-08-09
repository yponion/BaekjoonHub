import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nm;
        try {
            nm = strToIntAry(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < nm[0]; i++) {
            try {
                set.add(br.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        HashSet<String> resultSet = new HashSet<>();
        for (int i = 0; i < nm[1]; i++) {
            try {
                String str = br.readLine();
                if (set.contains(str)) {
                    resultSet.add(str);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        String[] result = resultSet.toArray(new String[0]);
        Arrays.sort(result);
        System.out.println(result.length);
        for (String i : result) {
            System.out.println(i);
        }
    }

    public static int[] strToIntAry(String str) {
        String[] tmpStr = str.split(" ");
        int[] tmpInt = new int[tmpStr.length];
        for (int i = 0; i < tmpStr.length; i++) {
            tmpInt[i] = Integer.parseInt(tmpStr[i]);
        }
        return tmpInt;
    }
}