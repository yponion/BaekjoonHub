import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int minX = 0;
        int maxX = 0;
        int minY = 0;
        int maxY = 0;
        boolean flagFirst = true;
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i<n; i++){
            int xy[] = strToIntAry(br.readLine());
            if(flagFirst){
                minX = xy[0];
                maxX = xy[0];
                minY = xy[1];
                maxY = xy[1];
                flagFirst = false;
            }else{
                if(xy[0] < minX){
                    minX = xy[0];
                }
                if(xy[0] > maxX){
                    maxX = xy[0];
                }
                if(xy[1] < minY){
                    minY = xy[1];
                }
                if(xy[1] > maxY){
                    maxY = xy[1];
                }
            }
        }
        System.out.println((maxX - minX)*(maxY-minY));
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
