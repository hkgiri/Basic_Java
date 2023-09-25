package pattern1;


public class Pt5 {
	public static void main(String[] args) {
		int n=5;
		int a1=5;
		for (int i = 0; i < n; i++) {
			int a=a1;
			for (int j = 0; j < n; j++) {
				if (i<=j) {
					System.out.print(a--+" ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
			a1--;
				
			}
			
		}
	}

