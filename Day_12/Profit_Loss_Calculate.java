package Day_12;



import java.util.Scanner;

public class Profit_Loss_Calculate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Cost Price:");
        double costPrice = sc.nextDouble();
        
        System.out.println("Enter Selling Price:");
        double sellingPrice = sc.nextDouble();
        
        double profitOrLossAmount = calculateProfitOrLoss(costPrice, sellingPrice);  
        double profitOrLossPercentage = calculateProfitOrLossPercentage(costPrice, profitOrLossAmount); 
        if (profitOrLossAmount > 0) {
            System.out.println("Profit Amount: " + profitOrLossAmount);
            System.out.println("Profit Percentage: " + profitOrLossPercentage + "%");
        } else if (profitOrLossAmount < 0) {
            System.out.println("Loss Amount: " + Math.abs(profitOrLossAmount));
            System.out.println("Loss Percentage: " + Math.abs(profitOrLossPercentage) + "%");
        } else {
            System.out.println("No Profit No Loss.");
        }
        
        sc.close();
    }

    
    private static double calculateProfitOrLoss(double costPrice, double sellingPrice) {
        return sellingPrice - costPrice;
    }

    
    private static double calculateProfitOrLossPercentage(double costPrice, double profitOrLossAmount) {
        return (profitOrLossAmount / costPrice) * 100;
    }
}
