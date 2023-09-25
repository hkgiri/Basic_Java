package Loops;

import java.util.Scanner;

//wajp to count of numbers of digit number given by the user.
public class Numberss7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Numbers");
		int num=sc.nextInt();
		int count=0;
		while (num>0)
		{
			count++;
			num=num/10;
		}
		System.out.println("Total Count Numbers Are: "+count);
	}
}
