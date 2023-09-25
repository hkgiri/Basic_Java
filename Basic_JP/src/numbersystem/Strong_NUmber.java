package numbersystem;

public class Strong_NUmber {
	public static void main(String[] args) {
		int num=145;
		int num1=num;
		int sum=0;
		while (num>0) {
			int rem=num%10;
			int fact=1;
			while (rem>0) {
				fact=fact*rem;
				rem--;
			}
			sum=sum+fact;
			num=num/10;
		}
		if (num1==sum) {
			System.out.println("it is Strong Number");
		}
		else
			System.out.println("it is not Strong Number");
	}
}
