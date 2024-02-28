//8진수가 주어졌을 때, 2진수로 변환하는 프로그램을 작성하시오.

//첫째 줄에 8진수가 주어진다. 주어지는 수의 길이는 333,334을 넘지 않는다.

//첫째 줄에 주어진 수를 2진수로 변환하여 출력한다. 수가 0인 경우를 제외하고는 반드시 1로 시작해야 한다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        try {
            str = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        StringBuilder sb = new StringBuilder();

        if (str.length() == 1 && str.charAt(0) == '0') {
            sb.append(0);
        } else {
            for (int i = 0; i < str.length(); i++) {
                if (i == 0) {
                    switch (str.charAt(i)) {
                        case '0':
                            break;
                        case '1':
                            sb.append("1");
                            break;
                        case '2':
                            sb.append("10");
                            break;
                        case '3':
                            sb.append("11");
                            break;
                        case '4':
                            sb.append("100");
                            break;
                        case '5':
                            sb.append("101");
                            break;
                        case '6':
                            sb.append("110");
                            break;
                        case '7':
                            sb.append("111");
                            break;
                        default:
                            sb.append("ERROR");
                            break;
                    }
                } else {
                    switch (str.charAt(i)) {
                        case '0':
                            sb.append("000");
                            break;
                        case '1':
                            sb.append("001");
                            break;
                        case '2':
                            sb.append("010");
                            break;
                        case '3':
                            sb.append("011");
                            break;
                        case '4':
                            sb.append("100");
                            break;
                        case '5':
                            sb.append("101");
                            break;
                        case '6':
                            sb.append("110");
                            break;
                        case '7':
                            sb.append("111");
                            break;
                        default:
                            sb.append("ERROR");
                            break;
                    }
                }
            }
        }
        System.out.println(sb);
    }
}
