package pattern;

public class P10 {
	public static void main(String[] args) {
		int n=5;
		for (int i = 0; i < n; i++) {
			int num=1;
			char ch='A';
			for (int j = 0; j < n; j++) {
				if (i==2) {
					System.out.print("$ ");
				}
				else if (i%2==0) {
					System.out.print(num++ +" ");
				}
				else
					System.out.print(ch++ +" ");
				} 
			System.out.println();
				
		}
	}
}
