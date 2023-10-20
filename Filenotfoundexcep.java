package exceptionHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Filenotfoundexcep {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File a = new File("C:\\Users\\Sabari\\Desktop\\Yoganathan.txt");
		FileReader ab = new FileReader(a);
		int temp = 0;
		while((temp=ab.read())!=-1) {
			System.out.print((char)(temp));
		}
		
	}
	

}
