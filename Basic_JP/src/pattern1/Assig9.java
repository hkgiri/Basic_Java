package pattern1;

public class Assig9 {
	public static void main(String[] args) {
		int n=4;
		int a=2;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i>=j) {
					System.out.print(a+" ");
					a=a+2;
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
