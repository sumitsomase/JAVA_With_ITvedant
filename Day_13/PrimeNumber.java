package Day_13;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[]args){

    Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int Num = sc.nextInt();
        int counter=0;
        for(int i=1;i<=Num;i++){
            if(Num%i==0){
                counter++;
            }

        }
        if(counter==2){
            System.out.println("Number is prime");
        }else{
            System.out.println("Number is not prime");
        }
       
}
    
}
