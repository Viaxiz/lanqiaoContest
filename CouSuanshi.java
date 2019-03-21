package practise;
/**
 * 从1~9中不重复地完成ABC+DEF=GHI，问满足条件的有多少种情况
 * @author Viaxiz
 * 这次我不用全排列的方式来做了，用深搜的方式来做
 */
public class CouSuanshi {
	public static int arr[]= {1,2,3,4,5,6,7,8,9};
	public static int a[]=new int [9];
	public static int book[]=new int [9];
	public static int ans=0;
	
	public static void dfs(int n) {
		if(n==9) {
			if(a[0]*100+a[1]*10+a[2]+a[3]*100+a[4]*10+a[5]==a[6]*100+a[7]*10+a[8]) {
				ans++;
				//System.out.println(""+a[0]+a[1]+a[2]+a[3]+a[4]+a[5]+a[6]+a[7]+a[8]);
			}
			return ;
		}
		for(int i=0;i<9;i++) {
			if(book[i]==0) {
				a[n]=arr[i];
				book[i]=1;
				dfs(n+1);
				book[i]=0;
			}
		}
		return;//额..这句不写好像也没有什么关系
	}
	
	public static void main(String[] args) {
		dfs(0);
		ans=ans/2;//注意这里的ans需要除以2哦，因为ABC和DEF的位置可以互换
		System.out.println(ans);
	}
}
