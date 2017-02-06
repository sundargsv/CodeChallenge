package com.sundar.codeChallenge;

import java.util.Scanner;
import java.util.Random;

public class PrintPattern {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner( System.in ); 
		char ch;
		
		/* Can able to print pattern as many times we need until the user exits from it*/
		do{
			printPattern();
			System.out.println("\nDo you want to continue (Type y or n) \n");
	        ch = scan.next().charAt(0);
	        /*If there is an other option except yes, then exit*/
	        if(ch != 'Y' || ch != 'y'){
	        	System.out.println("Program exits !!! ");
	        	System.exit(0);
	        
	        }
		}while (ch == 'Y'|| ch == 'y'); 
		
		/*Data members*/
		

	}
	
	/*Method to print pattern (Name GeneratedNumber)*/
	
	private static void printPattern() {
		
		String name, choice;
		int randomNo, min, max;
		
		
		Scanner scan = new Scanner( System.in );        
        System.out.println("Enter the name");
        
        /*Scanning the values*/
		name = scan.next();
		System.out.println("Do you want to generate randomNo with your own custom range ?");
		System.out.println("1. Yes");
		System.out.println("2. No");
		choice = scan.next();
		
		if(choice.equals("1") || choice.equals("yes") || choice.equals("Yes") || choice.equals("y")){
			System.out.println("Enter the min & max number");
			min = scan.nextInt();
			max = scan.nextInt();
			randomNo = randInt(min, max);
		}else{
			randomNo = randInt(6, 15);
		}
		
		
		System.out.println("Your pattern is :" +name+" " +randomNo);
	}

	public static int randInt(int min, int max) {
		
		Random rand = new Random();
		
		/* nextInt is normally exclusive to the top value,
	    so adding 1 to make it inclusive */
		int randomNo = rand.nextInt((max - min) + 1) + min;
		return randomNo;
	
	}

}
