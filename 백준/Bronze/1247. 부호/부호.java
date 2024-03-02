import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 3; i++) {
            System.out.println(signCheck(br));
        }
        br.close();
    }

    public static String signCheck(BufferedReader br) throws IOException {
        int n = Integer.parseInt(br.readLine());
        BigInteger s = new BigInteger("0");
        BigInteger bi;
        for (int i = 0; i < n; i++) {
            bi = new BigInteger(br.readLine());
            s = s.add(bi);
        }
        String result;
        //compareTo(0)이 -1이면 음수, 1이면 양수, 0이면 0
        if (s.compareTo(BigInteger.ZERO) == 0) {
            result = "0";
        } else if (s.compareTo(BigInteger.ZERO) == 1) {
            result = "+";
        } else {
            result = "-";
        }
        return result;
    }
}