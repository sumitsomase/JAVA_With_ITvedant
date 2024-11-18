package Day_13;

import java.util.Scanner;

public class loop {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int Num = sc.nextInt();
        int sum =0;
        System.out.println("odd number");
        for(int i=0;i<=Num;i++){
            if(i%2!=0){
                System.out.println(i);
             sum=sum+i;
            }
        }
        System.out.println("sum is");
        System.out.println(sum);
    }

    
}
