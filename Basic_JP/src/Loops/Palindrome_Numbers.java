package Loops;
//wajp to check numbers is palindrome or not..the given input by user. 
import java.util.Scanner;

public class Palindrome_Numbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Pass the numbers");
		int num=sc.nextInt();
		int temp=num;
		int rev=0;
		while (num>0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println(rev);
		if (temp==rev)
		{
		System.out.println(temp+"="+rev+" This Number Is Plindrome Number ");	
		}
		else
		System.out.println(temp+"="+rev+" This Is Not Plindrome Number:" +temp);
	}

}
