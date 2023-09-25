package numbersystem;
//wajp to print the perfect number from 1 to 100.
import java.util.Scanner;

public class PerfectnumberbyUser {
	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the  number");
		for (int j = 1; j < 100; j++) {
			//int num=sc.nextInt();
			int num=j;
			int i=0;
			int sum=0;
			while (i<=num/2) {
				if (num%2==0) {
					sum=sum+i;
				}
				i++;
			}
			if (sum==num) {
				System.out.println("it is a perfect number");
			}
			else
				System.out.println("it is not a perfect number");
			
		}
		}
	}

