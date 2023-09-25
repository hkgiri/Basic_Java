package sWitch;
//wajp to check whether the characters is vowel or consonants using switch statement. 
public class P3
{

	public static void main(String[] args) 
	{
		char ch='C';
		if (ch>=65&&ch<=90||ch>=97&&ch<=122)
		{
			switch(ch)
			{
			case'A':
			case'E':
			case'I':
			case'O':
			case'U':
			case'a':
			case'e':
			case'i':
			case'o':
			case'u':
			System.out.println(ch+" is a vowel");
			break;
			default :System.out.println(ch+" is a consonant");
				
				
			}
			
		} 
	}

}
