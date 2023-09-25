package elseif_ladder;
// wajp to check whether than given number is Alphabet or digit or special charecters.
public class P2 {
	public static void main(String[] args) {
		char ch=68;
		if (ch>=60&&ch<=90||ch>=96&&ch<=122)
		{
			System.out.println("it is an Alphabet "+ch);
		}
		else if (ch>=48&&ch<=57)
		{
			System.out.println("it is a Numbers "+ch);
		}
		else
		{
			System.out.println("it is a Special Charecter "+ch);
		}
	}
}
