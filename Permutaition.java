package practise;

/**
 * 生成全排列的数组，并输出生成的全排列数组
 * 
 * @author ASUS
 *
 */
public class Permutaition {
	public static int a[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	public static int ans = 0;

	public static void main(String[] args) {
		range(a, 0, a.length - 1);
		if (10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1 == ans)//我只是确认一下全排列的数组有多少种
			System.out.println(true);
	}

	public static void range(int[] arr, int start, int end) {
		if (start == end) {
			// write(arr)输出生成的全排列数组元素
			System.out.println(
					"" + arr[0] + arr[1] + arr[2] + arr[3] + arr[4] + arr[5] + arr[6] + arr[7] + arr[8] + arr[9]);
			ans++;
			return; // 无返回值，只是起到退出的作用
		}

		// 核心代码
		for (int i = start; i <= end; i++) {
			swap(arr, i, start);
			range(arr, start + 1, end);
			swap(arr, i, start); // 没看懂啊=…=
		}

	}

	// 将元素交换
	public static void swap(int[] arr, int x, int y) {
		int tmp = arr[x];
		arr[x] = arr[y];
		arr[y] = tmp;
	}

}
