package numbersystem;

public class Sunny_Number {
	public static void main(String[] args) {
		int num=80;
		int count=0;
		int i=1;
		while (i<=num/2) {
			if (num+1==i*i) {
				count++;
				break;
			}
			i++;
		}
		if (count==1) {
			System.out.println("it is Sunny Number");
		}
		else
			System.out.println("it is not Sunny Number");
	}
}
