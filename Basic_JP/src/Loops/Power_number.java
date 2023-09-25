package Loops;

import java.util.Scanner;

//wajp to find power of the number.given by the user.
public class Power_number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Pass the number");
		int num=sc.nextInt();
		System.out.println("Pass the power number");
		int num1=sc.nextInt();
		int res=1;
		while (num1>0)
		{
			res=res*num;
			num1--;
		}
		System.out.println(res);
	}
}
