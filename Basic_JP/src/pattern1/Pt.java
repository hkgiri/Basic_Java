package pattern1;

public class Pt {
	public static void main(String[] args) {
		int n=5;
		int space=0;
		int star=n;
		for (int i = 0; i < n; i++) {
			int a=1;
			for (int j = 0; j <star; j++) {
				System.out.print(a+++" ");
			}
			for (int j = 0; j < space; j++) {
				System.out.print("  ");
			}
			System.out.println();
			space++;
			star--;
			
		}
	}
}
