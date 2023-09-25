package pattern;

public class Snack2 {

	public static void main(String[] args) {
		int n=4;
		int k=1;
		int l;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i>=j) {
					if (i%2==0) {
						System.out.print(k+" ");
					}
					k++;
				}
			}
			l=k-1;
			for (int j = 0; j <n; j++) {
				if (i>=j) {
					if (i%2==1) {
						System.out.print(l-- +" ");
					}
				}
			}
			System.out.println();
		}
	}

}
