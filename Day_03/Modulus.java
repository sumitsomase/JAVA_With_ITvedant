package Day_03;
import java.util.*;

public class Modulus {

    public static void main(String[]args){
     Scanner sc=new Scanner(System.in);

     System.out.println("Enter first number");
     int num1=sc.nextInt();
 
     System.out.println("Enter second number");
     int num2=sc.nextInt();

     int Modulus=num1%num2;

     System.out.println("remainder of two number is="+ Modulus);

     sc.close();


    }
    
}
