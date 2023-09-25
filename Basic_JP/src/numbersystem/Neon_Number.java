package numbersystem;

public class Neon_Number {
	public static void main(String[] args) {
		int num=9;
		int fact=num*num;
		int sum=0;
		while (fact>0) {
			int rem=fact%10;
			sum=rem+sum;
			fact=fact/10;
		}
		if (num==sum) {
			System.out.println("it is a Neon Number");
		}
		else
			System.out.println("it is not a Neon Number");
	}
}
