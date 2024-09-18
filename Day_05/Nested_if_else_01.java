package Day_05;

import java.util.Scanner;

public class Nested_if_else_01 {

    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter HSC percentage");
        double perc=sc.nextDouble();


        if(perc>=70){
        System.out.println("Destinction");
        System.out.println("Enter Physics marks");
        double phy=sc.nextDouble();
        System.out.println("Enter Chemistry marks");
        double che=sc.nextDouble();

        double avg=(phy+che)/2;

        System.out.println("Avarage of Physics and Chemistry is "+avg);

        }else if(perc>=60){
        System.out.println("First class");

        System.out.println("Enter English marks");
        double eng=sc.nextDouble();
        System.out.println("Enter Hindi marks");
        double hindi=sc.nextDouble();
        System.out.println("Enter Marathi marks");
        double marathi=sc.nextDouble();

        double lanavg=(eng+hindi+marathi)/3;

        System.out.println("Avarage of english, hindi and marathi is "+lanavg);


        }else if(perc>=50){
            System.out.println("Second class");
        }else if(perc>=35){
            System.out.println("Third class");
        }else {
            System.out.println("Fail");

        }

        System.out.println("all the best");

        sc.close();

    }
    
    
}
