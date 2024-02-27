public class ReverseArray {
    
    public static void reverseArray(int number[]){
        int first=0, last=number.length-1;
        while(first<last){
            //swap
            int temp = number[last];
            number[last] = number[first];
            number[first] = temp;
            first++;
            last--;
        }

    }
    public static void main(String args[]){
        int arr[] = {2,4,6,8,10};
        reverseArray(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
