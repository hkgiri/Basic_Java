package pattern1;

import java.util.Iterator;

public class P1 {
	public static void main(String[] args) {
		int n=5;
		for (int i = 0; i < n; i++) {
			int num=1;
			for (int j = 0; j <n; j++) {
				if (i>=j) {
					System.out.print(num++ +" ");
				}
			}
			System.out.println();
		}
	}
}
