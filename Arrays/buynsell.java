/*You are given an array of prices where prices[i] is the price of a given stock on an ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock. Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0. */
import java.util.*;
public class buynsell {
    static int max_profit(int[] arr){// here prices is an array
    
        int minimum=arr[0];
        int max_profit=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            int cost=arr[i] - minimum;
            max_profit=Math.max(max_profit,cost);

            minimum=Math.min(minimum,arr[i]);

        }
        return max_profit;


    }
    
    public static void main(String[]args){
        int arr[] = {7,1,5,3,6,4};

        int profit=max_profit(arr);

        System.out.println("the maximium profit is "+profit);
        
    }
}
