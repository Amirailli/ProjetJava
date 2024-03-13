package e11;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		while (true) {
	try {
		System.out.println("donner le :");
		Scanner sc  = new Scanner(System.in);
		String a = sc.nextLine();
		Number b = sc.nextDouble();
		b.setconteneur(4.1);
        System.out.println(b.toString());
		//Container <String> n = new Container <String>();
		//Container <Number> s = new Container <Number>(); 
	}
	catch(Exception e){
	   System.out.println("il ya une error");
	}
	
		//System.out.println(n.getconteneur());
		 //System.out.println(s.getconteneur());
		//s.setconteneur(4);
       //System.out.println(s.toString());
	
	finally {
		System.out.println("fin.");
	}
	}
	}
}
