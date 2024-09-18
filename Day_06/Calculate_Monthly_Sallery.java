package Day_06;
import java.util.Scanner;


public class Calculate_Monthly_Sallery {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Please enter CTC");  
		Double ctc=sc.nextDouble(); 
        double monthlysallery=0;
        double annualtaxamount=0;
        

        if(ctc<=750000){

            annualtaxamount=0;
            
        }else if(ctc<=1000000){
            annualtaxamount=(ctc-750000)*.10;
        }else if(ctc<=1500000){
            annualtaxamount=(250000)*.10+(ctc-1000000)*.20;
        }else{
            annualtaxamount=(250000)*.10+(500000)*.20+(ctc-1500000)*.30;
        }
        System.out.println("Annual sallery="+ctc);
        System.out.println("Annual tax ammount="+annualtaxamount);

        double nontaxablemonthlysalary=ctc/12;
        System.out.println("monthly income in a non taxable country="+nontaxablemonthlysalary);


        double montlytaxamount=annualtaxamount/12;
        System.out.println("monthly tax amount="+montlytaxamount);

        monthlysallery=nontaxablemonthlysalary-montlytaxamount;

        System.out.println("monthly income in a taxable country="+monthlysallery);



     sc.close();



    }
    
}
