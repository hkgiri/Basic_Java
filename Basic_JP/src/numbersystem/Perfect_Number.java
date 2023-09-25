package numbersystem;

public class Perfect_Number {
	public static void main(String[] args) {
		int num=28;
		int n=1;
		int sum=0;
		while (num>n) {
			if (num%n==0) {
				sum=sum+n;
			}
			n++;
		}
		if (num==sum) {
			System.out.println("it is a Perfect Number");
		}
		else
			System.out.println("it is not a Perfect Number");
			
	}
}
