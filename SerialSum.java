import java.util.Scanner;
/**
 *求1+2+..+n的值
 * 使用递归过了一半..
 * 所以还是使用等差数列的公式求和
 * @author ASUS
 *
 */
class SerialSum{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println(getSum(n));
		scan.close();
	}
	public static long getSum(long n) {
		if(n==1)
			return 1;
		else
			return n*(1+n)/2;
	}
}