package conditions;

public class Elseifladder {

	public static void main(String[] args) {
		
// finding pass or fail with codition
		
		int a =-5;
		
		if(a>100) {
			System.out.println("invalid");

		}
		else if(a<0) {
			System.out.println("Invalid");

		}
		else if(a>=35) {
			System.out.println("pass");

		}
		else {
			System.out.println("Fail");

		}
// finding pass or fail with Relational condition
		
		int num = 123;
		if(num>=35 && num<100) {
			System.out.println("pass");
		}
		else if(num<35 && num>=0) {
			System.out.println("Fail");
		}
		else {
			System.out.println("Invalid");
		}
// finding big value		
//		int d=40, b=55, c= 30;
//		if(d>b && d>c) {
//			System.out.println("d is greater");
//		}
//		else if(b>d && b>c) {
//			System.out.println("b is greater");
//		}
//		else
//			System.out.println("c is greater");
//	}
// finding the grade
	 
	int m = 25 ;
	
	if(m>=90 && m<=100) {
		System.out.println("A Grade");
	}
	else if(m>=70 && m<90) {
		System.out.println("B Grade");
	}
	else if(m>=50 && m<70) {
		System.out.println("C Grade");
	}
	else if(m>=35 && m<50) {
		System.out.println("D Grade");
	}
	else if(m>=0 && m<35){
		System.out.println("Fail");
	}
	else {
		System.out.println("invalid");

	}
	
//tax value finding
	
	int t = 2546;
	
	if(t>=700000) {
		System.out.println("30% tax deducted, salary is :"+(t-((t*30)/100)));
	}
	else if(t>=500000 && t<700000) {
		System.out.println("25% tax deducted, salary is :"+(t-((t*25)/100)));
	}
	else if(t>=300000 && t<500000) {
		System.out.println("15% tax deducted, salary is :"+(t-((t*15)/100)));
	}
	else if(t>=0 && t<300000 ) {
		System.out.println("no tax deducted, salary is :"+t);
	}
	else {
		System.out.println("invalid");

	}
// finding vowels in string
	
	String s = "yoga";
	if(s.contains("a")||s.contains("e")||s.contains("i")||s.contains("o")||s.contains("u")) {
		System.out.println("Vowel exists");
	}
	else {
		System.out.println("Vowel doesnt exist");
	}
}
}
