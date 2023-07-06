import java.util.Scanner;

public class Main {
    public static void main(String []args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(isPalindrome(str));

    }

    public static int isPalindrome(String str){
        for( int i = 0; i<str.length()/2; i++){
            if (str.charAt(i) != str.charAt(str.length()-1-i)){
                return 0;
            }
        }
        return 1;
    }

}