package Day_07;

import java.util.Scanner;

public class Switch_Demo_Four {

     public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Day: ");     
        int Day=sc.nextInt();


        switch (Day) {
            case 1:
            System.out.println("Monday");  
            System.out.println("Weakday");  
            break;
            case 2:
            System.out.println("Tuesday"); 
            System.out.println("Weakday");   
            break;
            case 3:
            System.out.println("Wednesday"); 
            System.out.println("Weakday");   
            break;
            case 4:
            System.out.println("Thursday"); 
            System.out.println("Weakday");   
            break;
            case 5:
            System.out.println("Friday"); 
            System.out.println("Weakday");   
            break;
            case 6:
            System.out.println("Saturday"); 
            System.out.println("Holiday");   
            break;
            case 7:
            System.out.println("Sunday"); 
            System.out.println("Holiday");   
            break;
            
        
            default:
            System.out.println("Invalid value");  
                
        }

        System.out.println("Smile"); 
        
        sc.close();

    }
    
}
