import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = -1;
        try {
            n = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int[] nAry = new int[n];
        try {
            nAry = strToIntAry(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(nAry[i], map.containsKey(nAry[i]) ? map.get(nAry[i]) + 1 : 1);
        }

        int m = -1;
        try {
            m = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int[] mAry = new int[m];
        try {
            mAry = strToIntAry(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            sb.append(map.containsKey(mAry[i]) ? map.get(mAry[i]) + " " : 0 + " ");
        }
        System.out.println(sb);
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