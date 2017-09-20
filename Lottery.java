//Prompts user to enter a two-digit number that does not start with zero and compares that number to a
//randomly-generated lottery number to evaluate if the numbers match completely, in part, or not at all.

package lottery;

import java.util.Scanner;

public class Lottery {

    public static void main(String[] args) {
        // Generate random lottery numbers
        int lottery = (int)(Math.random() * 100);        
        int lottery1 = lottery/10;
        int lottery2 = lottery % 10;
                
        // Prompt user for input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a two-digit number.");
        int userResponse = input.nextInt();
        int userResponse1 = userResponse/10;
        int userResponse2 = userResponse % 10;
        
        // Evaluate response against random number
        if (userResponse == lottery){
            System.out.println("Congratulations! Exact match. You have won $10,000.");
        } else if (userResponse1 == lottery2 && userResponse2 == lottery1){
            System.out.println("Congratulations! You matched the digits. You have won $3,000.");
        } else if (userResponse1 == lottery1 || userResponse2 == lottery2 || userResponse1 == lottery2
                || userResponse2 == lottery1){
            System.out.println("Congratulations! You matched one digit You have won $1,000.");
        } else {
            System.out.println("Sorry. You did not win.");
        }
        
    }
    
}
