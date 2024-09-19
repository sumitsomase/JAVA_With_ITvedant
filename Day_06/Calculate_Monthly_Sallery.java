package Day_06;

import java.util.Scanner;

public class Calculate_Monthly_Sallery {

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a CTC: ");     
        int ctc=sc.nextInt();

        double tax=0;
        

        if(ctc<=750000){
            tax=0;
        }else if(ctc<=1000000){
            tax=(ctc-750000)*.10;
        }else if(ctc<=1500000){
            tax= 250000*.10 + (ctc-1000000)*.20;  
        }else{
            tax=(250000*.10) + (500000*.20) + (ctc-1500000)*.30;
        }

        System.out.println("annual goverment tax="+tax);
        System.out.println("monthly goverment  tax="+tax/12);

        System.out.println("annual sallery in taxable country is = "+(ctc-tax));
        System.out.println("monthly sallery in taxable country is = "+(ctc-tax)/12);


        System.out.println("Annual income in non-taxable country="+ctc);
        System.out.println("Monthly income in non-taxable country="+ctc/12);

        


        sc.close();

    }


    
}
