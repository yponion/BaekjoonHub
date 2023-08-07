import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nm[] = new int[2];
        try {
            nm = strToIntAry(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String strAry[] = new String[nm[0]];
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < nm[0]; i++) {
            try {
                strAry[i] = br.readLine();
                map.put(strAry[i], i + 1);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        for (int i = 0; i < nm[1]; i++) {
            String tmpStr = new String();
            try {
                tmpStr = br.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            int t = -1;
            try {
                t = Integer.parseInt(tmpStr);
            } catch (NumberFormatException nfe) {
            }
            if (t == -1) {
                System.out.println(map.get(tmpStr));
            } else {
                System.out.println(strAry[t - 1]);
            }
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