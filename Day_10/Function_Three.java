package Day_10;

import java.util.Scanner;

public class Function_Three {

    public static void main(String[]args){
        acceptChar();
    }

    private static void acceptChar() {
       
      Scanner sc=new Scanner(System.in);
		System.out.println("Please enter gender male/female");
		String gender=sc.next();								//        012345
		char gen=gender.charAt(0)	;					//gender="Vedant"
		if(gen=='m')								    //g='m'
		{
			System.out.println("Mr.");
		}
		else
		{
			System.out.println("Ms.");
		}

    }
    
}
