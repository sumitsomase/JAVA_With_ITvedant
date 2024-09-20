package Day_08;

import java.util.Scanner;

public class Switch_Two {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Veg Khao Ge...");
        System.out.println("2. Non-Veg Khao Ge...");

        System.out.println("Enter Your Choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                
                System.out.println("1. Veg Burger");
                System.out.println("2. Veg Pizza");
                System.out.println("3. Veg Sandwich");

                System.out.println("Enter Your Choice: ");
                int choicetwo = sc.nextInt();

                switch (choicetwo) {
                    case 1:
                    case 2:
                    case 3:
                        System.out.println("Order will be delivered in just 5 min...");
                        break;
                    default:
                        System.out.println("Invalid choice...");
                }
                break;

            case 2:
                
                System.out.println("1. Chicken 65");
                System.out.println("2. Chicken Biryani");
                System.out.println("3. Chicken Thali");

                System.out.println("Enter Your Choice: ");
                int choicethree = sc.nextInt();

                switch (choicethree) {
                    case 1:
                        System.out.println("1. Full -- 200 rs");
                        System.out.println("2. Half -- 100 rs");

                        System.out.println("Enter Your Choice: ");
                        int choicefour = sc.nextInt();

                        switch (choicefour) {
                            case 1:
                            case 2:
                                System.out.println("Order will be delivered in just 5 min...");
                                break;
                            default:
                                System.out.println("Invalid choice...");
                        }
                        break;

                    case 2:
                        System.out.println("1. Full -- 300 rs");
                        System.out.println("2. Half -- 150 rs");

                        System.out.println("Enter Your Choice: ");
                        int choicefive = sc.nextInt();

                        switch (choicefive) {
                            case 1:
                            case 2:
                                System.out.println("Order will be delivered in just 5 min...");
                                break;
                            default:
                                System.out.println("Invalid choice...");
                        }
                        break;

                    case 3:
                        System.out.println("1. Full -- 200 rs");
                        System.out.println("2. Half -- 150 rs");

                        System.out.println("Enter Your Choice: ");
                        int choicesix = sc.nextInt();

                        switch (choicesix) {
                            case 1:
                            case 2:
                                System.out.println("Order will be delivered in just 5 min...");
                                break;
                            default:
                                System.out.println("Invalid choice...");
                        }
                        break;

                    default:
                        System.out.println("Invalid choice...");
                }
                break;

            default:
                System.out.println("Invalid choice...");
        }

        sc.close();
       
        
    }
}
