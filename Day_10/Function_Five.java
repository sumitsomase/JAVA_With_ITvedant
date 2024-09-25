package Day_10;

import java.util.Scanner;

public class Function_Five {

    public static void main(String[]args){

        double avg;

        avg=boardExam();

        if(avg>=80.0)
	{
		System.out.println("Scholar Student");
	}
	else
	{
		System.out.println("Regular Student");
	}
    }

    private static double boardExam() {
    Scanner sc=new Scanner(System.in);						//A		   B
	System.out.println("Please enter your SSC percentage"); //90.15   65.0
	double sscPer=sc.nextDouble();
	
	System.out.println("Please enter your HSC percentage"); //87.15   75.0
	double hscPer=sc.nextDouble();
	
	double totalPer=sscPer+hscPer;
	
	System.out.println("Total Per : "+totalPer);
	double avgPer=totalPer/2;
    System.out.println("Average Per : "+avgPer);

    return avgPer;
	
    }

	
    
}
