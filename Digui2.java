package practise;
/**
 *   关于递归之前都没有稍微认真地去思索过，前天实验室学弟聊天的时候，经学弟指点，写了以下几行便于理解。
 *希望以后能够学习地踏实一点。
 * @author Viaxiz
 */
public class Digui2 {
	public static void f(int n) {
		if(n>0) {
			f(n-1);
			System.out.println(n);
			f(n-1);
		}
	}//递归就是把自己当作语句调用，所以为了完成语句的执行，其后面必然会出来的，想想栈的原理，先进后出，最开始调用的方法即最后一次执行的方法
	//因为执行递归语句后还要执行递归语句剩下的

	
	public static void main(String[] args) {
		f(3);
	}
}
