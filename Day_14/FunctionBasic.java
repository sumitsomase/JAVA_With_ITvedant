package Day_14;

import java.util.Scanner;


public class FunctionBasic {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it's a perfect number: ");
        int number = scanner.nextInt();

        if (isPerfectNumber(number)) {
            System.out.println(number + " is a Perfect Number.");
        } else {
            System.out.println(number + " is not a Perfect Number.");
        }

        scanner.close();
    }

    
    public static boolean isPerfectNumber(int num) {
        if (num <= 1) return false;

        int sum = 0;

       
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum == num;
    }
}

  
   
