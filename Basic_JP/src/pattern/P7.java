package pattern;

public class P7 {
	public static void main(String[] args) {
		int n=4;
		int num=1;
		char ch='A';
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < n; j++) {
				if (j%2==0) {
					System.out.print(num++ +" ");
				}
				else
				System.out.print(ch++ +" ");
			}
			System.out.println();
			
		}
	}
}
