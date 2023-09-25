package pattern;

public class Pyramid3 {
	public static void main(String[] args) {
		// tringle way..
		/*int n=4;
		int num=1;
		for (int i = 0; i <n; i++) {
			for (int j = 0; j <n; j++) {
				if (i+j>=n-1) {
					System.out.print(num+" ");
				}
				else
				System.out.print("  ");
			}
			for (int j = 1; j <n; j++) {
				if (i>=j) {
					System.out.print(num+" ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
			num++;
		}*/
		// generalize way..
		int n=4;
		int space=n-1;
		int star=1;
		int num=1;
		for (int i = 0; i <n; i++) {
			for (int j = 0; j <space; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j <star; j++) {
				System.out.print(num+" ");
			}
			System.out.println();
			num++;
			space--;
			star+=2;
		}
	}
}
