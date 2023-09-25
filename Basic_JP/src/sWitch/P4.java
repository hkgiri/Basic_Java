package sWitch;

public class P4 {
	public static void main(String[] args) {
		char ch=65;
		if (ch>=65&&ch<=90||ch>=97&&ch<=122) 
		{
			switch(ch)
			{
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
			case 'a':
			case 'e':
			case 'i':
			case 'u':System.out.println(ch+" is a vowel ");
			break;
			default:System.out.println(ch+" is a consonant");
			break;
			}
		}
		else
			System.out.println("please pass alphabet only");
	}
}
