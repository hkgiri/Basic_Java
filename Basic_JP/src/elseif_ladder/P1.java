package elseif_ladder;

public class P1 {
	public static void main(String[] args) {
		int w=40;
		if (w>=40&&w<=50)
		{
			System.out.println("add him to category A");
		}
		else if(w>=50&&w<=60)
		{
			System.out.println("add him to category B");
		}
		else if(w>=60&&w<=70)
		{
			System.out.println("add him to category C");
		}
		else if(w>=70&&w<=80)
		{
			System.out.println("add him to category D");
		}
		else if(w>=80)
		{
			System.out.println("add him to category E");
		}
		else
		{
			System.out.println("increse the weight and come for next time");
		}
	}

}
