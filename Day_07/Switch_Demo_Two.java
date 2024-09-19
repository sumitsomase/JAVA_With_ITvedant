package Day_07;

import java.util.Scanner;

public class Switch_Demo_Two {

    public static void main(String[]args){

    System.out.println("1.Area of rectangle ");
    System.out.println("2.Area of triangle");     
    System.out.println("3.Area of circle");  

     Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice: ");     
        int choice=sc.nextInt();


        switch (choice) {
            case 1: 
            System.out.println("Enter your length: ");  
            int length=sc.nextInt();

            System.out.println("Enter your width: ");  
            int width=sc.nextInt();

            int area=length*width;

            System.out.println("Area of rectangle: "+area);  
            
            break;

            case 2:

            System.out.println("Enter your base: ");  
            int base=sc.nextInt();

            System.out.println("Enter your height: ");  
            int height=sc.nextInt();

            int area_of_triangle=1/2*base*height;

            System.out.println("Area of triangle: "+area_of_triangle);  

            break;

            case 3:

            System.out.println("Enter your radies: ");  
            int radies=sc.nextInt();

            double area_of_circle=3.14*radies*radies;

            System.out.println("Area of triangle: "+area_of_circle); 
            
            break;

        
            default:
            System.out.println("Not found ");  
                
        }

        System.out.println("Thank you, visit again !!!"); 

        sc.close();
    
    
    }
    
}
