package Loops;

import java.util.*;

//wajp to reverse the number given by user.
public class Numberss8 {
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the NUmbers");
	int num=sc.nextInt();
	int rev=0;
	while (num>0)
	{
		int rem=num%10;
		rev=rev*10+rem;
		num=num/10;
	}
	System.out.println(rev);
		
}
}
