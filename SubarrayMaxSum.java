import java.util.*;

public class SubarrayMaxSum {
    
    public static void subarrayMaxSum(int number[]){
        int MaxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0; i<number.length; i++){
            int start=i;
            for(int j=i; j<number.length; j++){
                int end = j;
                currSum = 0;
                for(int k=start; k<=end; k++){
                    currSum += number[k];

                }
                System.out.println(currSum);
                if(MaxSum<currSum){
                    MaxSum = currSum;
                }
            }
           // System.out.println();
        }
        System.out.println("Maximum subarray sum: "+MaxSum);
    }
    public static void main(String args[]){
        int arr[] = {2,4,6,8,10};
        subarrayMaxSum(arr);
    }
}
