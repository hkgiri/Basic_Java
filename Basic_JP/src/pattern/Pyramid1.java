package pattern;
// create a Pyramid with the help of dual tringles. 
import java.util.Iterator;

public class Pyramid1 {

	public static void main(String[] args) {
		int n=4;
		for (int i = 0; i <n; i++) {
			for (int j = 0; j <n; j++) {
				if (i+j>=n-1) {
					System.out.print("* ");
				}
				else
				System.out.print("  ");
			}
			for (int j = 1; j <n; j++) {
				if (i>=j) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
