package practise;

/**
 * 如题： ABCAB*A=DDDDDD
 * 
 * @author ASUS 通过暴力的方式来做这道题
 */
public class BaoliCouChusi {
	public static void main(String[] args) {
		int d = 0;
		for (int i = 1; i <= 9; i++) {
			d = i * 100000 + i * 10000 + i * 1000 + i * 100 + i * 10 + i;
			for (int a = 3; a <= 9; a++) {
				if (d % a == 0) {
					int e = d / a;
					if (e / 10000 == a && (e % 100) / 10 == a)
						if (e / 1000 % 10 == e % 10)
							System.out.println(e);
				}
			}
		}
	}
}
