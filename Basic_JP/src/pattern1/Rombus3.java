package pattern1;

public class Rombus3 {
	public static void main(String[] args) {
	int n=7;
	int space=n/2;
	int star=1;
	char ch='a';
	for (int i = 0; i <n; i++) {
		for (int j = 0; j < space; j++) {
			System.out.print("  ");
		}
		for (int j = 0; j < star; j++) {
			System.out.print(ch+++" ");
		}
		if (i<n/2) {
			space--;
			star+=2;
			
		}
		else {
			space++;
			star-=2;
		}
		if (i==n/2) {
			ch='a';
		}
		System.out.println();
	}
	}
}
