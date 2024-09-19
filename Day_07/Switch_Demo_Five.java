package Day_07;

import java.util.Scanner;

public class Switch_Demo_Five {

 public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Vowel: ");     
        char Vowel=sc.next().toLowerCase().charAt(0);

        switch (Vowel) {
            case 'a':
            System.out.println("Amitabh "); 
            break;

            case 'e':
            System.out.println("emesh"); 
            break;

            case 'i':
            System.out.println("imran"); 
            break;

            case 'o':
            System.out.println("orange"); 
            break;

            case 'u':
            System.out.println("umesh"); 
            break;
        
            default:
            System.out.println("Invalid"); 
                
        }

        sc.close();


 }
    
}
