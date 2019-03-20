/**
*十六进制转十进制
*/
import java.util.Scanner;
public class SixteenToTen{
	public static void main(String args[]){
		Scanner scan =new Scanner(System.in);
		String str=scan.next();
		System.out.print(zhuan10(str));
		
	}
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
}