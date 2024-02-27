public class Exp1 {
    public static void kadanes(int numbers[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            cs = cs+numbers[i];
            if(cs<0){
                cs=0;
            }
            ms = Math.max(ms,cs);
        }
        System.out.println("max sum : "+ms);
    }
    public static void kadanesForNegative(int arr[]){
        int cs = arr[0];
        int ms = arr[0];
        for(int i=1; i<arr.length; i++){
            cs = Math.max(arr[i],cs+arr[i]);
            ms = Math.max(cs,ms);
        }
        System.out.println(ms);
    }
    public static void main(String args[]){
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        kadanes(numbers);
        int arr[] = {-2,-3,-4,-1,-5,-3};
        kadanesForNegative(arr);
    }
}
