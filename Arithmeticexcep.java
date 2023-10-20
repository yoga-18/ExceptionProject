package exceptionHandling;

import day1.Sysout;

public class Arithmeticexcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hi");
		
		int a =10 ;
	try {
		int b=0; 
	
		System.out.println(a/b); }
	catch(Exception ab) {
		System.out.println("don't divide number by 0 ");
		System.out.println(ab);
		ab.printStackTrace();
	}
		System.out.println("Bye");
		
	}

}
