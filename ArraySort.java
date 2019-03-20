/**
*这道题就是说给一个输入数组排序，
* 记住Arrays.sort(arr)就好
*/
import java.util.Arrays;
import java.util.Scanner;
class ArraySort{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int arr[]=new int[n];
		for(int a=0;a<n;a++) {
			arr[a]=scan.nextInt();
		}
		scan.close();
		//quickSort(arr, 0, arr.length-1); 我当时写快排出了一点问题
		Arrays.sort(arr);
		for(int a:arr) {
			System.out.print(a+" ");
		}
	}
}