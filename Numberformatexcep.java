package exceptionHandling;

public class Numberformatexcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi");
		String num = "TN63";
		try {
			int n = Integer.parseInt(num);
			System.out.println(n);
		}
		catch(Exception v) {
			System.out.println("Check before Parseing String to int");
		}
		finally {
			System.out.println("This is Important message");
		}
		
		System.out.println("Bye");
	}

}
