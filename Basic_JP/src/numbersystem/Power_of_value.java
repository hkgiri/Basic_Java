package numbersystem;
//wajp to find power of the value x and n= 4,3
public class Power_of_value {
	public static void main(String[] args) {
		int x=4;
		int n=3;
		int fact=1;
		while (n>0) {
			fact=fact*x;
			n--;
		}
		System.out.println(fact);
	}
}
