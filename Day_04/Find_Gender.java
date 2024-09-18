package Day_04;

import java.util.Scanner;

public class Find_Gender {

    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter gender male or female");
        String gender=sc.next();

        char any=gender.charAt(0);

        if(any=='m'){
            System.out.println("Mr");
        }else{
            System.out.println("Miss");
        }

        sc.close();
    }
    
}
