package pattern1;

import java.util.Iterator;

public class Pa14 {
	public static void main(String[] args) {
		int n=1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <5; j++) {
				System.out.print(n+++" ");
			}
			System.out.println();
		}
	}
}
