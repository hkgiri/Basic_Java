package numbersystem;
//wajp to print all the digits present in the given number from its place=12345 to 54321
public class A5 {
	public static void main(String[] args) {
		int num=12345;
		while (num>0) {
			int rem=num%10;
			System.out.print(rem);
			num=num/10;
		}
	}
}
