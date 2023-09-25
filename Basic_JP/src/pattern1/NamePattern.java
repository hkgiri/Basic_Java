package pattern1;

import java.util.Iterator;

//HEMANT
public class NamePattern {
	public static void main(String[] args) {
		int n=5;
		for (int i = 0; i <n; i++) {
			for (int j = 0; j < n; j++) { //H
				if (j==0||j==n-1||i==n/2) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			for (int j = 0; j < n; j++) { //E
				if (j==0||i==0||i==n/2||i==n-1) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			for (int j = 0; j < n; j++) {  //M
				if (j==0||j==n-1||i==j&&j<=n/2||j+i==n-1&&i<=n/2) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			for (int j = 0; j < n; j++) {  //A
				if (j==0||j==n-1||i==0||i==n/2) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			for (int j = 0; j < n; j++) {  //N
				if (j==0||j==n-1||i==j) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			for (int j = 0; j < n; j++) {  //T
				if (i==0||j==n/2) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}


			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {   //K
				if (j==0||i==2&&j==0||i==1&&j==1||i==0&&j==2||i==2&&j==0||i==3&&j==1||i==4&&j==2) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			for (int j = 0; j < n; j++) { //U
				if (i==n-1||j==0||j==n-1) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			for (int j = 0; j < n; j++) {  //M
				if (j==0||j==n-1||i==j&&i<=n/2||i+j==n-1&&i<=n/2) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			for (int j = 0; j < n; j++) {	//A
				if (j==0||j==n-1||i==0||i==n/2) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			for (int j = 0; j < n; j++) {
				if (j==0||i==0&&j<=n/2||i+j<=n/2||i==2&&j==0||i==3&&j==1||i==4&&j==2) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
