package pattern1;

public class Pa12 {
	public static void main(String[] args) {
		int n=4;
		char ch='A';
		int a=1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <n; j++) {
				if (i%2==0) {
					System.out.print(ch+++" ");
				}
				else
					System.out.print(a+" ");
			}
			System.out.println();
			if (!(i%2==0)) {
				a++;
			}
		}
	}
}
