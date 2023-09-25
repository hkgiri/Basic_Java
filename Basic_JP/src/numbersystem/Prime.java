package numbersystem;
// wajp to check whether the given number is prime or not. 
public class Prime {
	public static void main(String[] args) {
		int num=8;
		int count=0;
		while (num/2>0) {
			if (num%2==0) {
				count++;
				break;
			}
			num--;
		}
		if (count==0) {
			System.out.println("it is a Prime Number");
		}
		else
			System.out.println("it is not a Prime Number");
	}
}
