package Day_14;

import java.util.Scanner;


public class Addition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number ");
        int number = scanner.nextInt();


        int r,sum=0;

        while (number>0) {
            r=number%10;            //123---->3     %10
            if(r%2==1){           
            sum=sum+r;
            }
            number=number/10;       //123----->12   /10
            
        }

        System.out.println(sum);

    }
    
}
