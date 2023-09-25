package pattern1;

public class Pa15 {
	public static void main(String[] args) {
		int a=1;
		char ch='A';
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <4; j++) {
				if (j%2==0) {
					System.out.print(ch+++" ");
				}
				else {
					System.out.print(a+++" ");
					ch++;
				}
			}
			System.out.println();
		}
	}
}
