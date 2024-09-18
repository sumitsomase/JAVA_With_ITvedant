package Day_04;
import java.util.*;


public class CharAt_Method {

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc.next();
        System.out.println(name);


        char store=name.charAt(0);
        System.out.println(store);

        if(store=='m'){
            System.out.println("Mr");
        }else{
            System.out.println("Miss");
        }

        sc.close();

    }
    
}
