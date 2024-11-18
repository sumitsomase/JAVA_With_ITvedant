package Day_13;

import java.util.Scanner;

public class loopthree {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of student in a class");
        int student = sc.nextInt();
        int result=0;
        for(int i=1;i<=student;i++)
        {
         
            System.out.println("Choclate bought"+i);
            int choclate = sc.nextInt();
            
            result=result+choclate;
            
        }
        System.out.println("Total choclate:"+result);
    }
    
}
