package pattern1;

public class Assig4 {
	public static void main(String[] args) {
		int n=4;
		int a=1;
		char ch='A';
		for (int i = 0; i <n; i++) {
			for (int j = 0; j <n; j++) {
				if (i+j<=n-1) {
					if (i%2==0) {
						System.out.print(a+++" ");
					}
					else
						System.out.print(ch+++" ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
			
		}
	}
}
