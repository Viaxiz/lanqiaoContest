package practise;

/**
 * 不知道咋输入字符串。。。不知道咋个迭代字符串。。
 *
 * 解答：String.toArrayChar可以转化为字符串数组
 * 		String.Charat()可以得到在哪个位置上
 * 		同时，new String(char data[])	可以将char型数组转化成String字符串
 * =====分割线=====
 * 		注意可以用Math.sqrt	(n)开平方，Math.pow(a,b)求a的b次方，当然了开立方就是Math.pow(a,1/3);
 * 然而，这道题在十六进制数为1000000位数下还是过不了，溢出报错。。。哭辽。。看网上有人用二进制做，也就是
 * 16进制即为四位二进制，8进制即为3位二进制...机智啊！顺便说一句用switch简单
 * @author Viaxiz
 * at 14,Mar,2019
 */
import java.util.Scanner;

public class JinZhiZhuanHuan {
	
	JinZhiZhuanHuan tst =new JinZhiZhuanHuan();
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		String arr[]=new String [n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.next();
		}
		scan.close();
		for(int i=0;i<arr.length;i++) {
			System.out.println(zhuan8(zhuan10(arr[i])));
		}

	}
	
	/**
	 * 通过将字符串转化为字符串数组的方式来逐一处理
	 * @param str 
	 * @return
	 */
	public static long zhuan10(String str) {
		char []ss=str.toCharArray();//将字符串转换为字符数组
		int []value=new int [ss.length];
		for(int i=0;i<ss.length;i++) {
			if((int)ss[i]<65) //65是‘A’在ASCII码表中的位置，48是‘0’在ASCII码表中的位置，55是为了将9和A相接
				value[i]=(int)ss[i]-48; 
			else {
				value[i]=(int)ss[i]-55;} 
		}
//		for(int a:value) {
//			System.out.println(a);
//		}
		long sum=0,index=1;
		for(int i=0;i<value.length;i++) {
			for(int j=1;j<=i;j++)
				index*=16;
			sum+=value[value.length-i-1]*index;
			index=1;
		}
		return sum;
	}
	
	/**
	 * 通过除整取余的方式获得所要字符串
	 * @param x 传入的十进制数
	 * @return 返回的八进制字符串
	 */
	public static String zhuan8(long x) {
		long a[]=new long [10];
		int i=0;
		do {
			a[i]=x%8;
			x=x/8;
			i++;
		}while(x>8);
		a[i]=x;//最后一位小于8的余数需要加上
//		System.out.println(i);
		String str = new String();
		for(int j=a.length-1;j>=0;j--) {
				str+=a[j];
		}
		return str.substring(a.length-1-i, a.length);
	}

}
