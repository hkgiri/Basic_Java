package pattern1;

public class Alphabet {
	public static void main(String[] args) {
		int n=5;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <n; j++) {
				if (j==0||i==0&&j<=n/2||j==n/2&&i<=n/2||i==n/2&&j<=n/2) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			for (int j = 0; j <n; j++) {
				if (j==0&&i<=3||i==0&&j<=3||i==n-2&&j<=3||j==n-2&&i<=3||j==i&&j+i>=n-1) {
					System.out.print("* ");
				}
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
