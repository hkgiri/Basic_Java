package pattern1;

public class AllRightAngleProgram {
	public static void main(String[] args) {
		int n=5;
		System.out.println("1st set tringle group");
		for (int i = 0; i < n; i++) { //1
			for (int j = 0; j < n; j++) {
				if (i>=j) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			for (int j = 0; j < n; j++) {
				if (i>=j) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("2nd set tringle group");
		for (int i = 0; i < n; i++) { //2
			for (int j = 0; j < n; j++) {
				if (i>=j) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			for (int j = 0; j < n; j++) {
				if (i<=j) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("3rd set tringle group");
		for (int i = 0; i < n; i++) { //3
			for (int j = 0; j < n; j++) {
				if (i>=j) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			for (int j = 0; j < n; j++) {
				if (i+j<=n-1) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("4th set tringle group");
		for (int i = 0; i < n; i++) {  //4
			for (int j = 0; j < n; j++) {
				if (i>=j) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			for (int j = 0; j < n; j++) {
				if (i+j>=n-1) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("5th set tringle group");
		for (int i = 0; i < n; i++) {  //5
			for (int j = 0; j < n; j++) {
				if (i<=j) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			for (int j = 0; j < n; j++) {
				if (i>=j) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("6th set tringle group");
		for (int i = 0; i < n; i++) {  //6
			for (int j = 0; j < n; j++) {
				if (i<=j) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			for (int j = 0; j < n; j++) {
				if (i<=j) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("7th set tringle group");
		for (int i = 0; i < n; i++) {   //7
			for (int j = 0; j < n; j++) {
				if (i<=j) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			for (int j = 0; j < n; j++) {
				if (i+j<=n-1) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("8th set tringle group");
		for (int i = 0; i < n; i++) {  //8
			for (int j = 0; j < n; j++) {
				if (i<=j) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			for (int j = 0; j < n; j++) {
				if (i+j>=n-1) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("9th set tringle group");
		for (int i = 0; i < n; i++) { //9
			for (int j = 0; j < n; j++) {
				if (i+j<=n-1) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			for (int j = 0; j < n; j++) {
				if (i>=j) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("10th set tringle group");
		for (int i = 0; i < n; i++) { //10
			for (int j = 0; j < n; j++) {
				if (i+j<=n-1) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			for (int j = 0; j < n; j++) {
				if (i<=j) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("11th set tringle group");
		for (int i = 0; i < n; i++) {  //11
			for (int j = 0; j < n; j++) {
				if (i+j<=n-1) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			for (int j = 0; j < n; j++) {
				if (i+j<=n-1) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("12th set tringle group");
		for (int i = 0; i < n; i++) {  //12
			for (int j = 0; j < n; j++) {
				if (i+j<=n-1) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			for (int j = 0; j < n; j++) {
				if (i+j>=n-1) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("13th set tringle group");
		for (int i = 0; i < n; i++) {  //13
			for (int j = 0; j < n; j++) {
				if (i+j>=n-1) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			for (int j = 0; j < n; j++) {
				if (i>=j) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("14th set tringle group");
		for (int i = 0; i < n; i++) {  //14
			for (int j = 0; j < n; j++) {
				if (i+j>=n-1) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			for (int j = 0; j < n; j++) {
				if (i<=j) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("15th set tringle group");
		for (int i = 0; i < n; i++) {  //15
			for (int j = 0; j < n; j++) {
				if (i+j>=n-1) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			for (int j = 0; j < n; j++) {
				if (i+j<=n-1) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("16th set tringle group");
		for (int i = 0; i < n; i++) {   //16
			for (int j = 0; j < n; j++) {
				if (i+j>=n-1) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			for (int j = 0; j < n; j++) {
				if (i+j>=n-1) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
