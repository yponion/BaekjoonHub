import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        process();
    }

    public static void process() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> set = new HashSet<>();
        String meet[];
        int n;
        try {
            n = Integer.parseInt(br.readLine());
            for (int i = 0; i < n; i++) {
                meet = br.readLine().split(" ");
                if (set.isEmpty() && (meet[0].equals("ChongChong") || meet[1].equals("ChongChong"))) {
                    set.add(meet[0]);
                    set.add(meet[1]);
                } else if (set.isEmpty() && !(meet[0].equals("ChongChong") || meet[1].equals("ChongChong"))) {
                    continue;
                } else {
                    if (set.contains(meet[0])) {
                        set.add(meet[1]);
                    } else if (set.contains(meet[1])) {
                        set.add(meet[0]);
                    }
                }
            }
            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(set.size());
    }
}