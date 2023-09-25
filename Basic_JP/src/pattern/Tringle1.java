package pattern;

public class Tringle1 {
	public static void main(String[] args) {
		int n=4;
		char ch='A';
		int num=1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
			if (i>=j)
			{
				if (i%2==0) {
					System.out.print(ch++ +" ");
				}
				else
				System.out.print(num++ +" ");
			}
			else
			System.out.print(" ");
			}
			System.out.println();
		}
	}
}
