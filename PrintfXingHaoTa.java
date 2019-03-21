package practise;

/**
 * n=3: 
 *                 * 
 *                * * 
 *               *   *
 *              * * * *  
 * n=4: 
 * 					*
 *                 * * 
 *                *   *
 *               * * * *
 *              *       *
 *             * *     * *
 *            *   *   *   *
 *           * * * * * * * *
 * 请输出n=6的图形
 * @author Viaxiz
 */
public class PrintfXingHaoTa {
	public static int N = 70;
	public static char arr[][] = new char[N][N];

	public static void main(String[] args) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++)
				arr[i][j] = ' ';
		}
		f( 6, 0, 0);
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.printf("%c", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	/**
	 * 
	 * @param n 第几个图形
	 * @param row	行
	 * @param col	列
	 */
	public static void f( int n, int row, int col) {// 数组是静态变量，一改则该故不用传入；
		if (n == 1) {
			arr[row][col] = '*';
			return; // return是递归执行出口，超级超级重要！
		}

		int w = 1;
		int i;
		for (i = 0; i < n - 1; i++)
			w *= 2;

		f( n - 1, row, col + w / 2);// 这三句，我...没写出来。。哇=/_\=
		f( n - 1, row + w / 2, col);
		f( n - 1, row + w / 2, col + w);
	}
}
