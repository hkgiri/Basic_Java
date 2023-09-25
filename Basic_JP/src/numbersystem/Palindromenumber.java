package numbersystem;

public class Palindromenumber {
	public static void main(String[] args) {
		int n=173;
		int rev=0;
		int temp=n;
		while (n>0) {
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if (temp==rev) {
			 System.out.println("it is a palindrome Number");
			 int count=0;
			 while (temp>0) {
				count++;
				temp=temp/10;
			}
			 System.out.println(count);
		}
		else
		{
			if (temp%2==0) {
				System.out.println("it is not a palindrome number (it is divisible by 2)");
			}
			else
				System.out.println("it is not a palindrome number (it is not divisible by 2)");
		}
	}
}
