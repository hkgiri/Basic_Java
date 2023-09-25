package numbersystem;

import java.util.Scanner;

//Design a method to check whether the given number is perfect number return perfect number else return not a perfect number.
public class PerfectNumberdesign {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		String returnn=isperfect(num);
		System.out.println(returnn);
	}
	public static String isperfect(int n)
	{
		int i=1;
		int sum=0;
		while (i<=n/2) {
			if (n%2==0) {
				sum=sum+i;
			}
			i++;
		}
		if (sum==n) {
			return "It is a Perfect Number";
		}
		else {
			return "It is not a perfect Number";
		}
	}
}
