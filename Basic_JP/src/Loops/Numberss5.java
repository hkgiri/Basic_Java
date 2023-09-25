package Loops;
//wajp to count the numbers which are divisible both 3 and 5 between 1 to 100.
public class Numberss5 {
	public static void main(String[] args) {
		int num=1;
		int count=0;
		while (num<=100)
		{
			if (num%3==0&&num%5==0)
			{
				count++;
				System.out.println(num);
			}
			num++;
		}
		System.out.println( "total divisible numbers "+count);
	}
}
