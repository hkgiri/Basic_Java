package pattern;

public class P6 {
	public static void main(String[] args) {
		int n=5;
		for (int i = 0; i < n; i++) {
			int num=1;
			char ch='a';
			for (int j = 0; j <n; j++) {
				if (i%2==0) {
					System.out.print(num++ +" ");
				}
				else
				System.out.print(ch++ +" ");
			}
			System.out.println();
		}
	}
}
