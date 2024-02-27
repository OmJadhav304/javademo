public class Kadanes_Algorithm {
    
    public static void kadanes(int numbers[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i=0; i<numbers.length; i++){
            cs = cs + numbers[i];
            if(cs<0){
                cs = 0;
            } 
            ms = Math.max(cs,ms);
        }
        System.out.println("max sum: "+ms);
    }
    public static void kadanesForNegativeSubArray(int arr[]){
        int ms = arr[0];
        int cs = arr[0];
        for(int i=1; i<arr.length; i++){
            cs = Math.max(arr[i] , cs+arr[i]);
            ms = Math.max(ms,cs);
        }
        System.out.println("Max sum: "+ms);
    }

    public static void main(String args[]){
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        kadanes(numbers);
        int arr[] = {-2,-3,-4,-2,-5,-3};
        kadanesForNegativeSubArray(arr);
    }
}
