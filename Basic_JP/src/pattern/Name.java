package pattern;

public class Name
{
	public static void main(String[] args) 
	{
		int n=5;
		for (int i = 0; i < n; i++) 
		{
			for (int j = 0; j < n; j++)
			{
			if (j==0||j==n-1||i==n/2) //H
			{
			 System.out.print("* ");	
			}
			else
				System.out.print("  ");
			}
			System.out.print(" ");
			for (int j = 0; j < n; j++)
			{
			if (i==0||j==0||i==n-1||i==n/2)//E
			{
			 System.out.print("* ");	
			}
			else
				System.out.print("  ");
			}
			System.out.print(" ");
			for (int j = 0; j < n; j++)
			{
			if (j==0||j==n-1||(i==j&&i<=n/2)||(i+j==n-1&&i<=n/2))//M
			{
			 System.out.print("* ");	
			}
			else
				System.out.print("  ");
			}
			System.out.print(" ");
			for (int j = 0; j < n; j++)
			{
			if (j==0||i==0||j==n-1||i==n/2)//A
			{
			 System.out.print("* ");	
			}
			else
				System.out.print("  ");
			}
			System.out.print(" ");
			for (int j = 0; j < n; j++)
			{
			if (j==0||i==j||j==n-1)//N
			{
			 System.out.print("* ");	
			}
			else
				System.out.print("  ");
			}
			System.out.print(" ");
			for (int j = 0; j < n; j++)
			{
			if (i==0||j==n/2)//T
			{
			 System.out.print("* ");	
			}
			else
				System.out.print("  ");
			}
			System.out.println();
		   
		}
	}
}
