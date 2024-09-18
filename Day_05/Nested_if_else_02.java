package Day_05;

import java.util.Scanner;

public class Nested_if_else_02 {

    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Monthly Income");
        double income=sc.nextDouble();


        if(income>=100000){
            System.out.println("Excellent");
        }else if(income>=75000){
            System.out.println("Very Good");

        }else if(income>=50000){
            System.out.println("Good");
        }else if(income>=25000){
            System.out.println("OK");
        }else {
            System.out.println("Fresher");

        }

        System.out.println("all the best");

        sc.close();

    }
    
}
