package pattern;

public class Tringle2 {
	public static void main(String[] args) {
		int n=5;
		for (int i = 0; i < n; i++) {
			int num=5;
			for (int j = 0; j < n; j++) {
				if (i+j<=n-1)
				{
					System.out.print(num-- +" ");
				}
				else
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}

/*

5 4 3 2 1 
5 4 3 2  
5 4 3   
5 4    
5     

*/
