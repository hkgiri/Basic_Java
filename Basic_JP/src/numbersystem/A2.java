package numbersystem;
//wajp to print table of 7.
public class A2 {
	public static void main(String[] args) {
		int n=1;
		int fact=7;
		while (n<=10) {
			int res=n*fact;
			System.out.println(fact+"*"+n++ +"="+res);
		}
		
	}
}
