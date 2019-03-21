package practise;
/**
 * 题目要求：
 * 	已知有A,B,C,D,E,F,G,H,I,J属于1-9（不重复）满足：
 *  	A+B/C+DEF/GHI=10
 * 	求满足条件的解有多少种
 * @author Viaxiz
 * 	利用全排列来做这道题解法如下
 */
public class CouChushi {
	public static int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	public static int ans = 0;

	public static void main(String[] args) {
		range(a, 0, a.length - 1);
		System.out.println(ans);
	}

	public static void range(int[] arr, int start, int end) {
		if (start == end) {
			if (arr[0] * (arr[2]) * (arr[6] * 100 + arr[7] * 10 + arr[8])
					+ arr[1] * (arr[6] * 100 + arr[7] * 10 + arr[8])
					+ (arr[3] * 100 + arr[4] * 10 + arr[5]) * arr[2] == 10*arr[2]*((arr[6] * 100 + arr[7] * 10 + arr[8]))) {
				ans++;
				System.out.println(""+arr[0] + arr[1] + arr[2] + arr[3] + arr[4] + arr[5] + arr[6] + arr[7] + arr[8]);
			}			
			return;
		}
		for (int i = start; i <= end; i++) {
			swap(arr, i, start);
			range(arr, start + 1, end);
			swap(arr, i, start);//没有这一步的的话你会发现结果不对
		}

	}

	public static void swap(int[] arr, int x, int y) {
		int tmp = arr[x];
		arr[x] = arr[y];
		arr[y] = tmp;
	}

}
