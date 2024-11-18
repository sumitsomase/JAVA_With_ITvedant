package Day_13;

import java.util.Scanner;


public class RatProblem {

    
  public static int solve (int r, int unit, int arr[], int n)
  {
    if (arr == null)
      return -1;
    int res = r * unit;
    int sum = 0;
    int count = 0;
    for (int i = 0; i < n; i++)
      {
	sum = sum + arr[i];
	count++;
	if (sum >= res)
	  break;
      }
    if (sum < res)
        return 0;
    return count;
  }
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter Number of Rat");
    int r = sc.nextInt ();
    System.out.println("Enter Number of Unit");
    int unit = sc.nextInt ();
    System.out.println("Enter Length of Array");
    int n = sc.nextInt ();
    System.out.println("Enter Array");
    int arr[] = new int[n];

    for (int i = 0; i < n; i++)
      arr[i] = sc.nextInt ();
    System.out.println (solve (r, unit, arr, n));
  }
}
    

