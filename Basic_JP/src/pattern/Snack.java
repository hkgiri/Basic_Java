package pattern;

public class Snack {
	public static void main(String[] args) {
		int n=4;
		int k=1;
		int l;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i>=j) {
				  k++;
				}
			}
			l=k-1;
			for (int j = 0; j < n; j++) {
				if (i>=j) {
					System.out.print(l-- +" ");
				}
				else
				System.out.print("  ");
			}
			System.out.println();
		}
	}
}
