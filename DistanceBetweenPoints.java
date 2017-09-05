//Problem description: Write a program that prompts the user to enter two points (x1, y1) and (x2, y2) and displays their distance.

package a1_hubloucarly;

import java.util.Scanner;

public class problemTwo {
    
    public static void main(String[] args){
        
        //Create scanner
        Scanner input = new Scanner(System.in);
        
        //Request input from user
        System.out.println("Enter x1 and y1:");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        
        System.out.println("Enter x2 and y2:");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        
       //Calculate distance between points and display result
       double distance = Math.pow((Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2)), 0.5);
       System.out.println("The distance between the two points is " + distance);
        
    }
    
}
