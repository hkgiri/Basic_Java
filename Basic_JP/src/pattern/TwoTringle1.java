package pattern;

public class TwoTringle1 {
	public static void main(String[] args) {
		int n=4;
		//int num=1;
		for (int i = 0; i < n; i++) {
			int k=1;
			for (int j = 0; j < n; j++) {
				if (i>=j)
				{
					System.out.print(k++ +" ");
				}
				else
					System.out.print("  ");
			}
			int num=k-1;
			for (int j = 0; j < n; j++) {
				if (i>=j) {
					System.out.print(num++ +" ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
/*
1       1       
1 2     2 3     
1 2 3   3 4 5   
1 2 3 4 4 5 6 7 
*/