package numbersystem;

public class Happy_Number {
	public static void main(String[] args) {
		int[] a= {10,13,20};
		int[] temp= {};
		for (int i = 0; i < a.length; i++) {
			int num=a[i];
			int num1=num;
			while (num>9) {
			        int sum=0;
			while (num>0) {
					int rem=num%10;
					sum=sum+rem*rem;
					num=num/10;
				}
				num=sum;
			}
			if (num==1||num==7) {
				System.out.println(num1+" is  a Happy Number");
				
			}
			else
				System.out.println(num1+" is not a Happy Number");
		}
		
		}
	}

