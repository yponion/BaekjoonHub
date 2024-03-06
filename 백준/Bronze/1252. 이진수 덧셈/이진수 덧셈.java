import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str;
        try {
            str = br.readLine().split(" ");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int len = 0;
        if (str[0].length() < str[1].length()) {
            len = str[0].length();
        } else {
            len = str[1].length();
        }

        StringBuilder sb = new StringBuilder();
        int append = 0;
        for (int i = 1; i <= len; i++) {
            switch (Integer.parseInt(str[0].charAt(str[0].length() - i) + "") + Integer.parseInt(str[1].charAt(str[1].length() - i) + "") + append) {
                case 0:
                    sb.append(0);
                    append = 0;
                    break;
                case 1:
                    sb.append(1);
                    append = 0;
                    break;
                case 2:
                    sb.append(0);
                    append = 1;
                    break;
                case 3:
                    sb.append(1);
                    append = 1;
                    break;
            }
        }

        if (str[0].length() == str[1].length()) {
            sb.append(append);
        } else if (str[0].length() < str[1].length()) {
            for (int i = str[1].length() - str[0].length() - 1; i >= 0; i--) {
                switch (Integer.parseInt(str[1].charAt(i) + "") + append) {
                    case 0:
                        sb.append(0);
                        append = 0;
                        break;
                    case 1:
                        sb.append(1);
                        append = 0;
                        break;
                    case 2:
                        sb.append(0);
                        append = 1;
                        break;
                }
            }
            sb.append(append);
        } else {
            for (int i = str[0].length() - str[1].length() - 1; i >= 0; i--) {
                switch (Integer.parseInt(str[0].charAt(i) + "") + append) {
                    case 0:
                        sb.append(0);
                        append = 0;
                        break;
                    case 1:
                        sb.append(1);
                        append = 0;
                        break;
                    case 2:
                        sb.append(0);
                        append = 1;
                        break;
                }
            }
            sb.append(append);
        }
        sb.reverse();
        String result = sb.toString();
        int check = result.indexOf("1");
        if (check == -1) {
            System.out.println(0);
        } else {
            System.out.println(result.substring(check));
        }
    }
}