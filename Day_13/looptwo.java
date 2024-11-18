package Day_13;

import java.util.Scanner;

public class looptwo {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number first number");
        int Numone = sc.nextInt();
        System.out.println("Enter a number second number");
        int Numtwo = sc.nextInt();
        System.out.println("Enter increment");
        int increment = sc.nextInt();
       int result=0;
        for(int i=Numone;i<=Numtwo;i+=increment){
             result=result+i;
        }

        System.out.println(result);

    }

    
}
