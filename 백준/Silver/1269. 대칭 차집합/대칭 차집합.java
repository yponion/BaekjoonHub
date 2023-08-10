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
        int nAry[];
        try {
            nAry = strToIntAry(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        HashSet<Integer> set1 = new HashSet<>();
        for (int i = 0; i < nm[0]; i++) {
            set1.add(nAry[i]);
        }

        int mAry[];
        try {
            mAry = strToIntAry(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        HashSet<Integer> set2 = new HashSet<>();
        for (int i = 0; i < nm[1]; i++) {
            set2.add(mAry[i]);
        }

        set1.retainAll(set2); //교집합
        System.out.println(nm[0] + nm[1] - set1.size() * 2);
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