package numbersystem;

public class ArmStrong {
	public static void main(String[] args) {
		int num=153;
		int num1=num;
		int temp=num;
		int count=0;
		int sum=0;
		while (num>0) {
			num=num/10;
			count++;
		}
		while (num1>0) {
			int rem=num1%10;
			int fact=1;
			int i=0;
			while (i<count) {
				fact=fact*rem;
				i++;
			}
			sum=sum+fact;
			num1=num1/10;
		}
		if (temp==sum) {
			System.out.println("it is a ArmStrong Number");
		}
		else
			System.out.println("it is not a ArmStrong Number");
	}
}
