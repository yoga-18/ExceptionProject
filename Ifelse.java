package conditions;

public class Ifelse {

	public static void main(String[] args) {
// ifelse conditon
		int age = 18;

		if(age>=18) {
			System.out.println("Eligible to Vote");
			
		}
		else {
			System.out.println("Not Eligible to Vote");

		}
// finding retirement age

		int retirement = 60;
		
		if(retirement>=60) {
			System.out.println("Your in Retirement Stage");
		}
		else {
			System.out.println("You still need to continue");

		}
// finding value is even or odd
		int num =11;
		
		if(num%2==0) {
			System.out.println("Its an Even Number");
			
		}
		else {
			System.out.println("Its an Odd Number");

		}
//by adding first 2 value finding its equal to 3rd value
		
		int a= 10;
		int b=50;
		int c=30;
		int d=a+b;
		
		if(d==c) {
			System.out.println("Values are Equal");

		}
		else {
			System.out.println("Values are Different");

		}
//finding value is positive or negative
		
		int v =1;
		
		if(v>=1) {
			System.out.println("Its an Positive Value");

		}
		else if(v<0) {
			System.out.println("Its an Negative Value");

		}
		else {
			System.out.println("Its an Nutral Value");

		}
// finding the string value is even or odd	
		
		String s = "yoga12";
		int l = s.length();
		
		if (l%2==0) {
			System.out.println("String is an Even Number");
			
		}
		else {
			System.out.println("String is an Odd Number");

		}
//finding the pass mark above 35
		
		int m = 50;
		 
		if(m>=35) {
			System.out.println("You are Pass");

		}
		else {
			System.out.println("You Fail");

		}
		
	}

}
