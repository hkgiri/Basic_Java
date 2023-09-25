package sWitch;

public class Break {

	public static void main(String[] args) {
		String currentday="tuesday";
		switch(currentday)
		{
		case "monday":System.out.println("play fotball");
		break;
		case "tuesday":System.out.println("play cricket");
		break;
		case "stuarday":System.out.println("play hockey");
		break;
		default :System.out.println("no game today ,Attend class");
		}
	}

}
