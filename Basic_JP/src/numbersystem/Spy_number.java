package numbersystem;

public class Spy_number {
	public static void main(String[] args) {
		int num=1124;
		int fact=1;
		int sum=0;
		while (num>0) {
			int rem=num%10;
			fact=rem*fact;
			sum=rem+sum;
			num=num/10;
		}
		if (fact==sum) {
			System.out.println("it is a spy number");
		}
		else
			System.out.println("it is not a spy number");
	}
}
