package pattern1;

import java.util.Iterator;

public class ReversePyramid1 {
	public static void main(String[] args) {
		int n=8;
		int star=7;
		int space=0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < space; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j <star; j++) {
				System.out.print("* ");
			}
			System.out.println();
			space++;
			star=star-2;
		}
	}
}
