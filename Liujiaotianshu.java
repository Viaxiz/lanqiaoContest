package practise;

/**
 * ahahhhhhhhhhhhhhh~全排列好用啊，老铁！一次就出结果了，完全没问题哈哈哈哈哈~开心死了 唯一不足是一开始没有记住全排列的写法...
 * 
 * @author Viaxiz
 *
 */

public class Liujiaotianshu {
	public static int arr[] = { 2, 4, 5, 6, 7, 9, 10, 11, 12 };
	public static int tmp[] = new int[6];

	public static void main(String[] args) {
		f(arr, 0, arr.length - 1);
	}

	public static void f(int arr[], int start, int end) {
		if (start == end) {
			// 8+arr[0]+arr[1]+arr[2]==8+arr[3]+arr[6]+3==1+arr[1]+arr[4]+arr[8]==arr[5]+arr[6]+arr[7]+arr[8]==3+arr[2]+arr[4]+arr[7]

			tmp[0] = 8 + arr[0] + arr[1] + arr[2];
			tmp[1] = 8 + arr[3] + arr[6] + 3;
			tmp[2] = 1 + arr[1] + arr[4] + arr[8];
			tmp[3] = arr[5] + arr[6] + arr[7] + arr[8];
			tmp[4] = 3 + arr[2] + arr[4] + arr[7];
			tmp[5] = 1 + arr[0] + arr[3] + arr[5];
			if (tmp[0] == tmp[1] && tmp[2] == tmp[3] && tmp[4] == tmp[5] && tmp[0] == tmp[5] && tmp[2] == tmp[5]) {
				System.out.println(arr[3]);
			}
			return;
		}
		for (int i = start; i <= end; i++) {
			swap(arr, i, start);
			f(arr, start + 1, end);
			swap(arr, i, start);
		}
	}

	public static void swap(int arr[], int x, int y) {
		int tmp = arr[x];
		arr[x] = arr[y];
		arr[y] = tmp;
	}
}
