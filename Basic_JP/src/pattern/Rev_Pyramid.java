package pattern;

public class Rev_Pyramid {
	public static void main(String[] args) {
		// using duel tringle..
		/*int n=4;
		for (int i = 0; i <n; i++) {
			for (int j = 0; j <n; j++) {
			if (i<=j) {
				System.out.print("* ");
			}
			else
			System.out.print("  ");
			}
			for (int j = 1; j <n; j++) {
				if (i+j<=n-1) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}*/
		//Generalize create Pyramid..
		int n=4;
		int space=0;
		int star=2*n-1;
		for (int i = 0; i <n; i++) {
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
