import java.util.*;

public class Exp4 {
    public static boolean duplicateValues(int num[]){
        for(int i=0; i<num.length; i++){
            for(int j=i+1; j<num.length; j++){
                if(num[i]==num[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(duplicateValues(arr));
    }
}
