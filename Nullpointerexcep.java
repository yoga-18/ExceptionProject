package exceptionHandling;

public class Nullpointerexcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hi");
		String name = null;
		try {
		System.out.println(name.toLowerCase());}
		catch(Exception ac) {
			System.out.println("Give String Value As Input ");
			System.out.println(ac);
			ac.printStackTrace();
		}
		System.out.println("Bye");
		
	}

}
