package Day_07;

import java.util.Scanner;

public class Switch_Demo_Seven {

    public static void main(String[]args){

    Scanner sc=new Scanner(System.in);


    System.out.println("Enter First Number"); 
    int numone=sc.nextInt(); 
    System.out.println("Enter Second Number"); 
    int numtwo=sc.nextInt(); 

    

    System.out.println("Enter your choice: \n +  \n - \n * \n / ");
                       
    char choice=sc.next().charAt(0);


    switch (choice) {
        case '+':
        int add=numone+numtwo;
        System.out.println("Addition of two number="+add); 
        break;

        case '-':
        int sub=numone-numtwo;
        System.out.println("Subtraction of two number="+sub); 
        break;

        case '*':
        int multi=numone*numtwo;
        System.out.println("Multiplication of two number="+multi); 
        break;

        case '/':
        int div=numone/numtwo;
        System.out.println("Divition of two number="+div); 
        break;
    
        default:
        System.out.println("Error:Plz Choose given value "); 
            
    }



    sc.close();





        

   


    }

    
}
