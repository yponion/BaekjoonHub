import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt();
        double res = 0;
        int tmp = 0;
        for(int i = 1; i<n; i++){
            res += ++tmp;
        }
        System.out.println(Math.round(res));
        System.out.println(2);
    }
}