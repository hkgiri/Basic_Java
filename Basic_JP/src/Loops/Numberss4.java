package Loops;
//wajp count to even numbers between 1 to 50. 
public class Numberss4 {
	public static void main(String[] args) 
	{
		int n=1;
		int count=0;
		while (n<=50)
		{
		 if (n%2==0)
		 {
			 count++;
		 }
		 n++;
		}
		System.out.println(count);
	}
}
