package a1_hubloucarly;

import java.util.Scanner;

public class A1_hublouCarly {

    public static void main(String[] args) {
        
        //Create scanner
        Scanner input = new Scanner(System.in);
        
        //Request input from user
        System.out.print("Enter a number between 0 and 1000: ");
        int userNumber = input.nextInt();
        
        //Find each digit of the number individually
        int hundredsPlace = userNumber / 100;
        int tensPlace = (userNumber % 100) / 10;
        int onesPlace = userNumber % 10;
        
        //Add numbers and print result
        System.out.println(hundredsPlace + tensPlace + onesPlace);
        
    }
    
}
