package exceptionHandling;

public class Indexoutofboundexce {

	public static void main(String[] args) {
		// Stringindexoutofboundexcep
		System.out.println("Hi");
		
		String s = "abcdefgh";
		try {
			System.out.println(s.charAt(9));
		}
		catch(StringIndexOutOfBoundsException c) {
			System.out.println("check the index value only for the given string length");
		}
		
		//Arrayindexoutofboundexcep
		int[] a ={1,2,3,4,5,6};
		try {
		System.err.println(a[9]);
		}
		catch(Exception v) {
			System.out.println("check the int value only for the given Array length");
		}
		finally {
			System.out.println("Check before you get");
		}
		System.out.println("Bye");

	}

}
