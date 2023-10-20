package exceptionHandling;

public class Singletrymuliplecatchexcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String  a = null;
		 
		try {
			System.out.println(a.charAt(5));
		}
		catch(NullPointerException b) {
			System.out.println("the value is null");
		}
		catch(ArithmeticException c) {
			System.out.println("can't dived by 0");
		}
		catch(NumberFormatException d) {
			System.out.println("not a valid number");
		}
		catch(Exception e) {
			System.out.println("Handled");
		}
		
	}

}
