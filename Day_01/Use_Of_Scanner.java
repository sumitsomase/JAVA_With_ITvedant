package Day_01;
import java.util.*;  // java.util package

public class Use_Of_Scanner {

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);   //Scanner is a class from the java.util package used to read input from various sources

        System.out.println("Enter First Number");
        int numone=sc.nextInt();

        System.out.println("Enter second Number");
        int numtwo=sc.nextInt();

        int add=numone+numtwo;

        System.out.println("addition of two number="+add);


        sc.close();  // Closing the Scanner



    }
    
}
