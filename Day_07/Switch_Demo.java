package Day_07;

import java.util.Scanner;

public class Switch_Demo {

    public static void main(String[]args){

        System.out.println("1.English ");
        System.out.println("2.Hindi");     
        System.out.println("3.Marathi");     


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice: ");     
        int choice=sc.nextInt();

        switch (choice) {
            case 1:
            System.out.println("London"); 
            break;
            case 2:
            System.out.println("Delhi"); 
            break;
            case 3:
            System.out.println("Pune"); 
            break;
        
            default:
            System.out.println("city not found"); 
                
        }

        System.out.println("Thank you, Visit again"); 

        sc.close();



    }
    
}
