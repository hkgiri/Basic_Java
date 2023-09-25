package pattern;

public class TwoTringle2 {

	public static void main(String[] args) {
		int n=4;
		int num=1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i>=j) {
					System.out.print(num++ +" ");
				}
				else
					System.out.print("  ");
			}
			System.out.print("  ");
			int l=num-1;
			for (int j = 0; j < n; j++) {
				if (i>=j) {
					System.out.print(l-- +" ");
				}
				
			}
			System.out.println();
		}
		
	}

}
