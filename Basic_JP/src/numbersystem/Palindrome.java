package numbersystem;
//wajp to check number whether the given number is palindrome.
public class Palindrome {
	public static void main(String[] args) {
		int num=1234321;
		int n=num;
		int count=0;
		while (num>0) {
			int rem=num%10;
			count=count*10+rem;
			num=num/10;
		}
		if (n==count) {
			System.out.println(n+" is a palindrome number");
		}
		else
			System.out.println(n+" is not a palindrome number");
			
	}
}
