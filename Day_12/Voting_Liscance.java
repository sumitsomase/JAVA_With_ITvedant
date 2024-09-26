package Day_12;

import java.util.Scanner;

public class Voting_Liscance {
    

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a age");
        int age=sc.nextInt();

        vote(age);
        Liscance(age);
        
        sc.close();
    }

    private static void Liscance(int age) {
       if(age>=18){
        System.out.println("Eligible for voting_Liscance");
       }else{
        System.out.println("Not Eligible for voting_Liscance");
       }
    }

    private static void vote(int age) {
        if(age>=18){
            System.out.println("Eligible for voting");
           }else{
            System.out.println("Not Eligible for voting");
           }
    }
}
