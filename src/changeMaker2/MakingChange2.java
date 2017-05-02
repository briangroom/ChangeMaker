package changeMaker2;

import java.util.Scanner;

/**
 * @author Brian Groom
 * 4/29/17
 *
 */
public class MakingChange2 {

	/**
	 * You have to give someone change
	 * What coins do you give that person
	 * Requirements:
	 * 	Input: user entered amount of change between 1 and 99 cents in whole number
	 * 	Output: Display the coin breakdown needed in quarters, dimes, nickels & pennies 
	 */
	public static void main(String[] args) {
	     System.out.println("Please enter the amount of change needed (1-99) : ");
	     Scanner input = new Scanner (System.in);

	     int changeNeeded = input.nextInt();
	     
	     makeChange(changeNeeded);
	     
	     	input.close();

	}
	
	public static void makeChange(int changeNeeded) {

		int coinsNeeded = 0;   // placeholder for number of coins
	    int [] result = new int[2];

		// Error messages
		// if amount not between 1 and 99 display message
		if  (changeNeeded < 1) {
		      System.out.println("Amount entered must be between 1 and 99.");
				}  // end if
		else if  (changeNeeded > 99){
		      System.out.println("Amount entered must be between 1 and 99.");
        		}  // end if
		else {
			  if (changeNeeded > 24) {
				  coinsNeeded = totalCoins(changeNeeded,25);			  
				  System.out.println("Number of quarters returned is "+coinsNeeded);
				  changeNeeded = (changeNeeded - (25*coinsNeeded));
			  }
			  if (changeNeeded > 9) {
				  coinsNeeded = totalCoins(changeNeeded,10);			  
				  System.out.println("Number of dimes returned is "+coinsNeeded);
				  changeNeeded = (changeNeeded - (10*coinsNeeded));
			  }
			  if (changeNeeded > 4) {
				  coinsNeeded = totalCoins(changeNeeded,5);			  
				  System.out.println("Number of nickels returned is "+coinsNeeded);
				  changeNeeded = (changeNeeded - (5*coinsNeeded));
			  }
			  if (changeNeeded > 0) {
				  coinsNeeded = totalCoins(changeNeeded,1);			  
				  System.out.println("Number of pennies returned is "+coinsNeeded);
				  changeNeeded = (changeNeeded - (1*coinsNeeded));
			  }
		}
	}
	      
	  	public static int totalCoins(int changeNeeded, int denomination) {
	     
	  	 int coinTot = 0;
	
	  	// Loop for specific denomination
		while (changeNeeded > (denomination - 1))   {
			coinTot = (coinTot + 1);
			changeNeeded = (changeNeeded - denomination);		
			} 
		return coinTot;

	      }

	}

