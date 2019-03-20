import java.util.Scanner;

public class Febonacci {
	/* *
	*蓝桥杯Begin-4：Febonacci数列
	*@author Viaxiz
	*/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		if(n>3)
			System.out.println(getValue(n) % 10007);
		else
			System.out.println(1);
	}

	static int getValue(int n) {
		long n_1 = 1,n_2 = 1, s = 0;
		for (int i = 2; i < n; i++) {
			if(n_1>10007){
				n_1%=10007;
			}
			if(n_2>10007){
				n_2%=10007;
			}
			s = n_1 + n_2;
			n_2 = n_1;
			n_1 = s;
		}
		return (int) (s%10007);
	}
}