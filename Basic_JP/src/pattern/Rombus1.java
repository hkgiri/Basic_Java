package pattern;
public class Rombus1 {
	public static void main(String[] args) {
		int n=4;
		int space=n-1;
		int star=1; 
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <space;j++) {
				System.out.print("  ");
			}
			for (int j = 0; j < star; j++) {
				System.out.print("* ");
			}
			System.out.println();
			space--;
			star=star+2;
		}
		space=1;
		star=star-4;
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
