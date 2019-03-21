package practise;
/**
 * 关于之前凑除式（可参见CouChushi)的深搜做法
 * @author Viaxiz
 */
public class CouChushi2 {
	public static int arr[]= {1,2,3,4,5,6,7,8,9};
	public static int a[]=new int [9];
	public static int book[]=new int [9];
	public static int ans=0;
	
	public static void dfs(int n) {
		if(n==9) {
			if(a[0] * (a[2]) * (a[6] * 100 + a[7] * 10 + a[8])
					+ a[1] * (a[6] * 100 + a[7] * 10 + a[8])
					+ (a[3] * 100 + a[4] * 10 + a[5]) * a[2] == 10*a[2]*((a[6] * 100 + a[7] * 10 + a[8]))) {
				ans++;
			}
			return;
		}
		for(int i=0;i<9;i++) {
			if(book[i]==0) {
				a[n]=arr[i];
				book[i]=1;
				dfs(n+1);
				book[i]=0;//这一步起到什么作用啊？回溯的作用？？
			}
		}
	}
	
	public static void main(String[] args) {
		dfs(0);
		System.out.println(ans);
	}

}
