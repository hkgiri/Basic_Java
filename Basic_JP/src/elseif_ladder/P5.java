package elseif_ladder;
//wajp check with the given characters is vowel or consonants.
public class P5 {

	public static void main(String[] args) {
		char ch='D';
		if (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'&&ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.println("this charecter is vowel: "+ch);
		}
		else
		{
			System.out.println("this charecter is consonant: "+ch);
		}
	}

}
