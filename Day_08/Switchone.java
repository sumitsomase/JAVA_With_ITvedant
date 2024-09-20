package Day_08;

import java.util.Scanner;

public class Switchone {

    public static void main(String[]args){

     Scanner sc=new Scanner(System.in);

     System.out.println("1.English \n 2.urbic  \n 3.Exits"); 

     System.out.println("Enter Your Choice"); 
     int choice=sc.nextInt(); 

     

     switch (choice) {
        case 1:

        System.out.println("1.US \n 2.UK  \n 3.Aus \n 4.Exits"); 
        System.out.println("Enter Your Choice"); 
        int choicetwo=sc.nextInt(); 

        


        switch (choicetwo) {
            case 1:
            System.out.println("London"); 
            break;
            case 2:
            System.out.println("New york"); 
            break;
            case 3:
            System.out.println("sydney"); 
            break;
            case 4:
            System.out.println("Exit"); 
            break;
        
            default:
            System.out.println("Invalid"); 
        }


        case 2:

        System.out.println("1.Qatar \n 2.Dubai  \n 3.Exits "); 
        System.out.println("Enter Your Choice"); 
        int choicethree=sc.nextInt(); 

        

        switch (choicethree) {
            case 1:
            System.out.println("Lahor"); 
            break;
            case 2:
            System.out.println("Abudabi"); 
            break;
           
            case 3:
            System.out.println("plz Exit"); 
            break;
        
            default:
            System.out.println("Invalid"); 
        }

        case 3:
        System.out.println("Visit Again"); 
        break;
     
        default:
        System.out.println("Invalid"); 
            
     }


     sc.close();



    }

    
}
