public class SmallestNumber {
    
    public static int smallestNumber(int number[]){
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<number.length; i++){
            if(smallest>number[i]){
                smallest = number[i];
            }
        }
        return smallest;
    }
    public static void main(String args[]){
        int arr[] = {2,4,7,9,40,88,52};
        System.out.print("The smallest number is: "+smallestNumber(arr));
    }
}
