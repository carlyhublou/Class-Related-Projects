//Simple program that prompts the user for a dollar amount and then returns the dollars and cents that make up that amount.

package monetaryunits;

import static java.lang.Math.round;
import java.util.Scanner;

public class MonetaryUnits {

    public static void main(String[] args) {
        //Create new scanner
        Scanner input = new Scanner(System.in);
        
        //Prompt user for dollar amount and get amount
        System.out.println("Enter a dollar amount in dollars and cents (e.g., 15.43)");
        double totalAmount = input.nextDouble();
        
        //Find total cents
        int remainingAmount = (int)Math.round(totalAmount * 100);
                
        //Find dollars
        int dollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;
                
        //Find quarters
        int totalQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;
             
        //Find dimes
        int totalDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;
                
        //Find nickels
        int totalNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;
                
        //Find pennies
        int totalPennies = remainingAmount;
        
        //Print result
        System.out.println("You have " + dollars + " dollars, " + totalQuarters + 
                " quarters, " + totalDimes + " dimes, " + totalNickels + " nickels, and " + 
                totalPennies + " pennies.");
                
    }
    
}
