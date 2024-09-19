package Day_07;

import java.util.Scanner;

public class Switch_Demo_six {

    public static void main(String[]args){


    System.out.println("1.Science"); 
    System.out.println("2.Commerce"); 
    System.out.println("3.Art"); 
        

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your choice"); 
    int stream=sc.nextInt(); 

   


    switch (stream) {
        case 1:
        System.out.println("Sahu college of Latur"); 
        break;

        case 2:
        System.out.println("Dayanand College of Latur"); 
        break;

        case 3:
        System.out.println("GRM College of Latur"); 
        break;
    
        default:
        System.out.println("Error:Plz Choose given value "); 
            
    }

    sc.close();




}
    
}
