import java.util.*;

public class Exp3 {

    public static void negativeArray(int arr[] , int n){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            int start = i;
            for(int j=i; j<arr.length; j++){
                int end = j;
                int sum = 0;
                for(int k=start; k<=end; k++){
                    sum += arr[k];
                    //System.out.println(sum);
                }
                if(sum < 0){
                    count++;
                }
                System.out.println(count);
            }
        }
      //  System.out.println(count);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        negativeArray(arr,n);
    }
}
