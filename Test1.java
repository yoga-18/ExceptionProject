package conditions;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 4;
		
		if((a>=1 && a<=3)||(a>=13 && a<=15)) {
			System.out.println("Lunch hour");
		}
		else if ((a>=2 && a<=4)||(a>=14 && a<=16)) {
			System.out.println("Working hour");
		}
		else if ((a>=5 && a<=8)||(a>=17 && a<=20)) {
			System.out.println("Meeting hour");
		}
		else {
			System.out.println("Invalid input");
		}
	}

}
