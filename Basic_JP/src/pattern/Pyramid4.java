package pattern;

public class Pyramid4 {

	public static void main(String[] args) {
		int n=4;
		int space=n-1;
		int star=1;
		for (int i = 0; i <n; i++) {
			char ch='A';
			for (int j = 0; j < space; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j <star; j++) {
				System.out.print(ch++ +" ");
			} 
			System.out.println();
			space--;
			star=star+2;
		}
	}

}
