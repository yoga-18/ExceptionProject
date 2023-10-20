package conditions;

public class Test {
	public static void main(String[] args) {

		String s = "yoga123";
		int l = s.length();
		
		if (l%2==0) {
			System.out.println("String is an Even Number :"+s+s);
			
		}
		else {
			System.out.println("String is an Odd Number :"+s+s+s);

		}
		
		
	
//finding first letter is uppercase or not

		String a = "Yoga123";
		//String b = a.substring(0, 1);
		
		if(a.charAt(0)>='A'&&a.charAt(0)<='Z') {
			System.out.println("is UpperCase");
			
		}
		else {
			System.out.println("not is UpperCase");
		}
		
		
		
//		if(b.equals(b.toUpperCase())) {
//		System.out.println("String starts with uppercase");
//		}
//		else {
//			System.out.println("String starts with lowercase");
//		}
		
//string is even or odd if even print middle 2 char if odd print middel char
		
		String c = "fruit";
		//int i = c.length();
		String m = c.substring(c.length()-1);
		//String n = c.substring(c.length()/2, c.length()/2+1);

		//char[] z = m.toCharArray();
		char w = c.charAt(c.length()-1);
		char e = m.charAt(0);

		
//		if (i%2==0) {
//			System.out.println("String is an Even Number "+m);
//			
//		}
//		else {
//			System.out.println("String is an Odd Number "+n );
//			
//
//		}
		
		if (e==w) {
			System.out.println("String contains u");
		}
		else {
			System.out.println("String differs");
		}

//checking the value is equal or not		
		
		int g=10, k=23, j=35, h=12;
		
		if(g==k && g==j &&g==h) {
			System.out.println("all are equal");
		}
		else if((g==k && g==j)||(g==j && g==h)||(k==j && k==h)) {
			System.out.println("any 2 are equal");
		}
		
		
		
	}

}

