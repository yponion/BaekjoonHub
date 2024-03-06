import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) {
        process();
//        test();
    }

    public static void test() {

    }

    public static void process() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] ary;
        try {
            ary = strToIntAry(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 1; i <= ary[0]; i++) {
            for (int j = 1; j <= ary[1]; j++) {
                for (int k = 1; k <= ary[2]; k++) {
                    int sum = i + j + k;
                    if (map.containsKey(sum)) {
                        map.put(sum, map.get(sum) + 1);
                    } else {
                        map.put(sum, 1);
                    }
                }
            }
        }

        // value 기준 최대값을 가지는 key, https://hianna.tistory.com/577
        Comparator<Entry<Integer, Integer>> comparator = Entry.comparingByValue();
        Entry<Integer, Integer> maxEntry = Collections.max(map.entrySet(), comparator);
        System.out.println(maxEntry.getKey());
    }

    // String -> int[]
    public static int[] strToIntAry(String str) {
        String[] strAry = str.split(" ");
        int[] intAry = new int[strAry.length];
        for (int i = 0; i < strAry.length; i++) {
            intAry[i] = Integer.parseInt(strAry[i]);
        }
        return intAry;
    }
}
