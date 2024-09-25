package Day_09;

public class Functionone {

    public static void main(String[] args) {

        System.out.println("i am in main");
        brazil();
        System.out.println("i am finally back in  main");
 }

    private static void brazil(){

      System.out.println("i am in brazil");

      argentina();

      System.out.println("i am finally back in  brazil");

 }

    private static void argentina(){
       System.out.println("i am in argentina");
    }

 
    
  }
