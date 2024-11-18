package Day_14;

import java.util.Scanner;

public class SingleDigit {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int r, sum;

        
        while (number > 9) {
            sum = 0;

           
            while (number > 0) {
                r = number % 10;  
                sum += r;         
                number = number / 10;     
            }

            
            number = sum;
        }

        System.out.println("Single digit: " + number);
    }
}
