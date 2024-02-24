import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();
        int n;
        String c;
        try {
            n = Integer.parseInt(br.readLine());
            for (int i = 0; i < n; i++) {
                c = br.readLine().charAt(0) + "";
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        ArrayList<String> keySet = new ArrayList<>();
        for (String key : map.keySet()) {
            if (map.get(key) >= 5) {
                keySet.add(key);
            }
        }
        if (keySet.isEmpty()) {
            System.out.println("PREDAJA");
        } else {
            Collections.sort(keySet);
            for (String key : keySet) {
                System.out.print(key);
            }
        }

    }
}
