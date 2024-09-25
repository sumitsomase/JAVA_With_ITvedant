package Day_10;

import java.util.Scanner;

public class Function_Four {


     public static void main(String[]args){

        int areaJr;
        areaJr=areaRectangle();

        System.out.println("Area of rectangle:"+areaJr);
     }

    private static int areaRectangle() {

         Scanner sc=new Scanner(System.in);
         System.out.println("enter length");
         int len=sc.nextInt();
         System.out.println("enter width");
         int width=sc.nextInt();


         int areaNrc=len*width;

         return areaNrc;

         
      
    }

    
}
