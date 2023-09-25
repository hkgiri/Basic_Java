package Loops;

import java.util.Scanner;

//wajp to print all the digits given number by user.
public class Numberss6 
{	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Numbers");
	int num=sc.nextInt();
	while (num>0)
	{
		int rem=num%10;
		System.out.println(rem);
		num=num/10;
	}
	
}
}
