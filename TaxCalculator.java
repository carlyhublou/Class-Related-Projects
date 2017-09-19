package taxcalculator;

import java.util.Scanner;

public class TaxCalculator {

    public static void main(String[] args) {
        // Create scanner and request user's tax status and income
        Scanner input = new Scanner(System.in);
        System.out.println("What is your tax filing status?");
        System.out.println("0 - Single");
        System.out.println("1 - Married Filing Jointly or Qualified Widow(er)");
        System.out.println("2 - Married Filing Separately");
        System.out.println("3 - Head of Household");
        int status = input.nextInt();
        
        System.out.println("What is your annual income, rounded to the nearest dollar?");
        int income = input.nextInt();
        double taxes1 = 0;
        double taxes2 = 0;
        double taxes3 = 0;
        double taxes4 = 0;
        double taxes5 = 0;
        double taxes6 = 0;
        
        
        //Use status to compute taxes
        if (status == 0){
            if (income > 0 )
                if (income < 8351)
                    taxes1 = .1 * income;
                else 
                    taxes1 = 8350 * .1;
            if (income >= 8351)
                if (income < 33951)
                    taxes2 = .15 * (income - 8350);
                else
                    taxes2 = .15 * (33950 - 8350);
            if (income >= 33951)
                if (income < 82251)
                    taxes3 = .25 * (income - 33950);
                else
                    taxes3 = .25 * (82250 - 33950);
            if (income >= 82251)
                if (income < 171551)
                    taxes4 = .28 * (income - 82250);
                else
                    taxes4 = .28 * (171550 - 82250);
            if (income >= 171551)
                if (income < 372951)
                    taxes5 = .33 * (income - 171550);
                else
                    taxes5 = .33 * (372950 - 171550);
            if (income >= 372951)
                taxes6 = .35 * (income - 372951);
        }
        
        else if (status == 1){
            if (income > 0 )
                if (income < 16701)
                    taxes1 = .1 * income;
                else 
                    taxes1 = 16700 * .1;
            if (income >= 16701)
                if (income < 67901)
                    taxes2 = .15 * (income - 16700);
                else
                    taxes2 = .15 * (67900 - 16700);
            if (income >= 67901)
                if (income < 137051)
                    taxes3 = .25 * (income - 67900);
                else
                    taxes3 = .25 * (137050 - 67900);
            if (income >= 137051)
                if (income < 208851)
                    taxes4 = .28 * (income - 137050);
                else
                    taxes4 = .28 * (208850 - 137050);
            if (income >= 208851)
                if (income < 372951)
                    taxes5 = .33 * (income - 208850);
                else
                    taxes5 = .33 * (372950 - 208850);
            if (income >= 372951)
                taxes6 = .35 * (income - 372951);
        }
        
        else if (status == 2){
            if (income > 0 )
                if (income < 8351)
                    taxes1 = .1 * income;
                else 
                    taxes1 = 8350 * .1;
            if (income >= 8351)
                if (income < 33951)
                    taxes2 = .15 * (income - 8350);
                else
                    taxes2 = .15 * (33950 - 8350);
            if (income >= 33951)
                if (income < 68526)
                    taxes3 = .25 * (income - 33950);
                else
                    taxes3 = .25 * (68525 - 33950);
            if (income >= 68526)
                if (income < 104426)
                    taxes4 = .28 * (income - 68525);
                else
                    taxes4 = .28 * (104425 - 68525);
            if (income >= 104426)
                if (income < 186476)
                    taxes5 = .33 * (income - 104425);
                else
                    taxes5 = .33 * (186475 - 104425);
            if (income >= 186476)
                taxes6 = .35 * (income - 186476);
        }
        
        else if (status == 3){
            if (income > 0 )
                if (income < 11951)
                    taxes1 = .1 * income;
                else 
                    taxes1 = 11950 * .1;
            if (income >= 11951)
                if (income < 45501)
                    taxes2 = .15 * (income - 11950);
                else
                    taxes2 = .15 * (45500 - 11950);
            if (income >= 45501)
                if (income < 117450)
                    taxes3 = .25 * (income - 45500);
                else
                    taxes3 = .25 * (117450 - 45500);
            if (income >= 117451)
                if (income < 190201)
                    taxes4 = .28 * (income - 117450);
                else
                    taxes4 = .28 * (190200 - 117450);
            if (income >= 190201)
                if (income < 372951)
                    taxes5 = .33 * (income - 190200);
                else
                    taxes5 = .33 * (372950 - 190200);
            if (income >= 372951)
                taxes6 = .35 * (income - 372951);
        }
        
        else {
            System.out.println("You entered an incorrect tax status.");
        }
        
        int endTaxes = (int)(taxes1 + taxes2 + taxes3 + taxes4 + taxes5 + taxes6);
        
        System.out.println("Your taxes are $" + endTaxes + ".");
        
    }
    
}
