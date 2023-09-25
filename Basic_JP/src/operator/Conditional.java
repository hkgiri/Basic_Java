package operator;
import java.util.Scanner;
public class Conditional {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The First Number ");
		int a=sc.nextInt();
		System.out.println("Enter The Second Number ");
		int b=sc.nextInt();
		System.out.println("Enter The Third Number ");
		int c=sc.nextInt();
		
		int res=a>b?(a>c?a:c):(b>c?b:c);
		System.out.println("the grater number is: "+res);
	}
}
