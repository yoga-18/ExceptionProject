package exceptionHandling;

public class Throwandthrows {

	public static void main(String[] args)throws AgeException {
		// TODO Auto-generated method stub

		String name = "Prem";
		int age = 18;
		if(age>=18) {
			System.out.println("Welcome "+ name);
		}
		else {

			throw new AgeException(name + " your Not a Valid Age to Vote");
		}
		try {
			String ano = "abc14365631";
			int no = Integer.parseInt(ano);
			System.out.println(no);
		}
		catch(Exception x) {
			System.out.println("give input with propper datatype");
		}
	
	}

}
class AgeException extends Exception{
	public AgeException(String msg) {
		super(msg);
	}
}
