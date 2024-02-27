public class LargestNumber {
    
    public static int largestNumber(int number[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<number.length; i++){
            if(largest<number[i]){
                largest = number[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        int arr[] = {2,4,7,8,34,56,20};
        System.out.print("The largest number is: "+largestNumber(arr));
    }
}
