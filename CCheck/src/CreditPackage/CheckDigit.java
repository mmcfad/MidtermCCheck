package CreditPackage;

import java.util.Scanner;

public class CheckDigit {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a credit card number as a long integer: ");
		String creditCardNumber = input.next();
		

	
	
        int sumOdds = 0, sumEvens = 0;

        
        //Loop iterates through creditCardNumber adding values to either sumOdds or sumEvens
        for(int i = 0 ; i < creditCardNumber.length(); i++) {
            int element = Character.getNumericValue(creditCardNumber.charAt(i));
            if(i % 2 == 0) {
                sumOdds += element;
              
            }
            else {
                sumEvens += 2 * element;
                if(element >= 5) {
                    sumEvens -= 9;
                }
             
            }
    }
        int sumTotal = sumOdds + sumEvens;
        
        if (sumTotal % 10 == 0) {
        	System.out.print("The number is valid");
        }
        else System.out.print("The number is invalid");

}
}