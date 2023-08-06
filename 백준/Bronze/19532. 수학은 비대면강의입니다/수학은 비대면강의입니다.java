import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ary[];
        try {
            ary = strToIntAry(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.print(((ary[2]*-ary[4])+(ary[5]*ary[1]))/((ary[0]*-ary[4])+(ary[3]*ary[1])));
        System.out.print(" ");
        System.out.print(((ary[2]*-ary[3])+(ary[5]*ary[0]))/((ary[1]*-ary[3])+(ary[4]*ary[0])));
    }
    public static int[] strToIntAry(String str){
        String tmpStr[] = str.split(" ");
        int tmpInt[] = new int[tmpStr.length];
        for(int i = 0; i<tmpStr.length; i++){
            tmpInt[i] = Integer.parseInt(tmpStr[i]);
        }
        return tmpInt;
    }

}