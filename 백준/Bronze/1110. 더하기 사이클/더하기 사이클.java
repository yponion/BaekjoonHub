import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int b = N;// befor
		int a = -1;// after
		int cnt = 0;
		while (N != a) {
			a = ((b % 10) * 10) + (((b / 10) + (b % 10)) % 10);
			b = a;
			cnt++;
		}
		System.out.println(cnt);
	}
}