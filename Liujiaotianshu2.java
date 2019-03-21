package practise;
/**
 * 这是六角填数的2.0版，使用深搜来做的
 * @author Viaxiz
 *
 */
public class Liujiaotianshu2 {
	public static int arr[]= {2,4,5,6,7,9,10,11,12};
	public static int a[]=new int [9];//作为答案数组存储着每个位置的值
	public static int vis[]=new int [9];//判断这个位置是否已经用过了
	public static int tmp[]=new int [6];//相等的六条线
	
	public static boolean judge(int arr[]) {
		tmp[0] = 8 + arr[0] + arr[1] + arr[2];
		tmp[1] = 8 + arr[3] + arr[6] + 3;
		tmp[2] = 1 + arr[1] + arr[4] + arr[8];
		tmp[3] = arr[5] + arr[6] + arr[7] + arr[8];
		tmp[4] = 3 + arr[2] + arr[4] + arr[7];
		tmp[5] = 1 + arr[0] + arr[3] + arr[5];
		if (tmp[0] == tmp[1] && tmp[2] == tmp[3] && tmp[4] == tmp[5] && tmp[0] == tmp[5] && tmp[2] == tmp[5]) 
			return true;
		else
			return false;
	}
	
	public static void dfs(int n) {
		if(n==9) {
			if(judge(a)) System.out.printf("%d%n",a[3]);
			return;
		}
		for(int i=0;i<9;i++) {
			if(vis[i]==0) {
				a[n]=arr[i];
				vis[i]=1;
				dfs(n+1);
				vis[i]=0;//哇，深搜真是粗暴，核心代码就几句搞定，可惜粗暴却不简单（哭辽..
			}
		}
	}
	
	public static void main(String[] args) {
		dfs(0);
	}
	
}
