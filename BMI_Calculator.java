package bmi_calculator;

import java.util.Scanner;

public class BMI_Calculator {

    public static void main(String[] args) {
        //Body Mass Index (BMI) measures health on weight. It can be calculated
        //by taking your weight in kg and dividing by the square of your height
        //in meters. The interpretation of BMI for people 16 years or older is:
        //BMI < 18.5 = Underweight
        //18.5 <= <25 = Normal
        //25 <= 30 = Overweight
        //>30 = Obese
        
        //Create scanner and prompt user for input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your weight in pounds.");
        double weightLB = input.nextDouble();
        System.out.println("Enter your height in inches.");
        double heightIN = input.nextDouble();
        
        //Convert to metric system
        double weightKG = weightLB * 0.45359237;
        double heightM = heightIN * 0.0254;
        
        //Find BMI
        double BMI = weightKG / Math.pow(heightM, 2);
        double BMIround = (int)(BMI * 100) / 100.0;       
        
        //Find and print result
        if (BMI < 18.5)
            System.out.println("Your BMI is " + BMIround + ". You are underweight!");
        else if (BMI >= 18.5 && BMI < 25)
            System.out.println("Your BMI is " + BMIround + ". You are normal!");
        else if (BMI >= 25 && BMI < 30)
            System.out.println("Your BMI is " + BMIround + ". You are overweight!");
        else 
            System.out.println("Your BMI is " + BMIround + ". You are obese!!!");
                
    }
    
}
