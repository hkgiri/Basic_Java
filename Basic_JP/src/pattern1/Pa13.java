package pattern1;

public class Pa13 {
	public static void main(String[] args) {
		char ch='A';
		for (int i = 0; i <3; i++) {
			for (int j = 0; j <4; j++) {
				System.out.print(ch+" ");
				ch=(char)(ch+2);
			}
			System.out.println();
		}
	}
}
