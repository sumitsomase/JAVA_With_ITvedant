package Day_12;

import java.util.Scanner;

public class Function_Scenario_Three {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a radius");
        int radius = sc.nextInt();

        double result = areaCircle(radius);  
        System.out.println("Area of Circle is " + result);  

        sc.close();
    }

    private static double areaCircle(int radius) {  
        double result = Math.PI * radius * radius;
        return result;
    }

    
}
