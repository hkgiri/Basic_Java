package elseif_ladder;
//wajp to check whether given character is special charecter or not.
public class P4 {
	public static void main(String[] args) {
		char ch='&';
		if (ch>=65&&ch<=90||ch>=97&&ch<=122)
		{
			System.out.println("it is not a special Character "+ch);
		}
		else
		{
			System.out.println("it is a special Character "+ch);
		}
	}
}
