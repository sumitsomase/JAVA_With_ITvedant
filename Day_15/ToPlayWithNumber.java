package Day_15;

import java.util.Scanner;

public class ToPlayWithNumber {

    public static int TotalSum(int Num){

       
        if(Num<=9){
            return Num;

        }
        int Rem,sum=0;
        
        
        while(Num>0){
            Rem=Num%10;
            
            sum+=Rem;
            Num=Num/10;
        }

        return sum;

    }

    public static int CountDigits(int Num){

        if(Num<=9){
            return 1;
        }
          int count=0;
        while (Num>0) {
            count++;
            Num=Num/10;
        }

        return count;

    }


    public static int CountDigitsOfSum(int Num) {
        if (TotalSum(Num) <=9) { 
            return 1;
        }

        int count = 0;
        while (TotalSum(Num) > 0) {
            count++;
            Num = TotalSum(Num) / 10; 
        }

        return count; 
    }


    public static boolean palindromes(int Num){
        if (Num >= 0 && Num <= 9) {
            return true;
        }
    
        int original = Num; 
        int reversed = 0;
    
        
        while (Num > 0) {
            int digit = Num % 10;          
            reversed = reversed * 10 + digit; 
            Num = Num / 10;              
        }
    
       
        return original == reversed;
    }

    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        System.out.println("please Enter a Number:");
        int Num=sc.nextInt();

        if (palindromes(Num)) {
            System.out.println("Number is palindrome");
        } else {
            System.out.println("The Number is not Palindrome");
        }

    
        System.out.println("Total Number Of Sum is:"+TotalSum(Num));
        System.out.println("Total Number Of sum of count is:"+CountDigitsOfSum(Num));
        System.out.println("Total Number Of number count is:"+CountDigits(Num));

        while (Num > 9) { 
            Num = TotalSum(Num); // Update Num with the sum of its digits
        }
        System.out.println("One Digit Sum: " + Num);



      
        



        sc.close();

    }
    
}
