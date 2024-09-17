import java.util.*;

public class Demo{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Length");
        double len=sc.nextDouble();

        System.out.println("width");
        double wid=sc.nextDouble();

        double area=len*wid;

        System.out.println("Area="+area);
        

        

        if(area>=500){
            System.out.println("Big room");
        }else{
            System.out.println("Small room");
        }

        System.out.println("Thank you");

    }
}