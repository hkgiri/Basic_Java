package pattern;

public class Pyramid5 {
	public static void main(String[] args) {
		int n=4;
		for (int i = 0; i <n; i++) {
			char ch='A';
			for (int j = 0; j <n; j++) {
				if (i+j>=n-1) {
					System.out.print(ch++ +" ");
				}
				else
					System.out.print("  ");
			}
			char l=(char)(ch-2);
			for (int j = 1; j <n; j++) {
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
