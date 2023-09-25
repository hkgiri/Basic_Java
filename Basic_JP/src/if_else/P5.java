package if_else;

import java.util.Scanner;

public class P5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The value");
		String s=sc.next();
		if (s.equalsIgnoreCase("Hi")) {
			System.out.println("Hello");
		}
		else if (s.equalsIgnoreCase("Bye")) {
			System.out.println("Ok Bye");
		}
		else
			System.out.println("Hey Boy Come And & Join With Us");
	}
}
