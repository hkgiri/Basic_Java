package elseif_ladder;
//wajp to check whether the given number is divisible by 3 or 5 or not.
public class P3 {
	public static void main(String[] args) {
		int a=16;
		if (a%3==0&&a%5==0)
		{
			System.out.println("this number is divisible "+a);
		}
		else
		{
			System.out.println("this number is not divisible "+a);
		}
	}
}
