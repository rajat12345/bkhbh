/**
 * 
 */
package Wrestlingrepeat;

import java.util.Scanner;

/**
 * @author
 *
 */
public class game {

	public static Scanner userInput =new Scanner(System.in);
	
	public static void main(String[] args) {
		int choice =0;
				
		Wrestler wrestler1 = new Wrestler("undertaker",2,6.5,80.9,20,2);
		wrestler1.display();
		
		Wrestler wrestler2 = new Wrestler("hulk hogan",4,5.5,85.9,30,5);
		wrestler1.display();
							
		while(choice!=7){
	    System.out.println("on what attribute");
		System.out.println("1 rank");
		System.out.println("2 height");
		System.out.println("3 weight");
		System.out.println("4 matches won");
		System.out.println("5 matches lost");		
		System.out.println("6 total matches");
	
		if(userInput.hasNextInt())
		{
			choice=userInput.nextInt();
		}
		
		switch(choice)
		{
		case 1:
			System.out.println("user wants to play on rank");
		
		case 2:
			System.out.println("user wants to play on height");
			break;
		case 3:
			System.out.println("user wants to play on weight");
			break;
		case 4:
			System.out.println("user wants to play on matches won");
			break;
		case 5:
			System.out.println("user wants to play on matches lost");
			break;
		case 6:
			System.out.println("user wants to play on totalmatches");
			break;
		default:
			System.out.println("invalid choice");
			break;
			
		}
		if( )
		
		
		
		
		
		
		}
		
		
		
			
		
		
	}

}
