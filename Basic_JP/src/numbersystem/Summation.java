package numbersystem;
//wajp to find summation of first 10 number 1 to 10.  
public class Summation {
	public static void main(String[] args) {
		int num=1;
		int sum=0;
		while (num<=10) {
			sum=sum+num++;
		}
		System.out.println(sum);
	}
}
