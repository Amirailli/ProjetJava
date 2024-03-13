/**
 * 
 */
package e11;

import java.util.Scanner;

import java.util.InputMismatchException;

/**
 * 
 */
	 
 class MonEcept extends Exception{
	 private String Msg="erreur , inf à 10";
	 public  String getMsg() {
		 return Msg;
	 }
 }

public class TP1 {

	/**
	 * @param args
	 */
	
	public static void saisieCorrect()throws MonEcept{
		System.out.println("entre la valeur:");
		 Scanner scanner = new Scanner (System.in);
		int valeur =scanner.nextInt();
		if(valeur<10) {
			throw new MonEcept();
		}
	}
	public static void main(String[] args) {
		MonEcept m =new MonEcept();
		 
		while(true) {
		try{
			saisieCorrect();
			break;
		}
		
		catch(InputMismatchException e){
			System.out.println("il esxit une erreur de InputMisnatchException:");
		}
		catch(MonEcept e) {
	    	   System.out.println(e.getMsg());
	       } 
		finally {
			System.out.println("fin:");
		}
		}
	}
}


