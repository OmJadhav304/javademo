public class BinarySearch {
    
    public static int binarySearch(int number[],int key){
        int start = 0, end = number.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(number[mid]==key){
                return mid;
            }
            if(number[mid]<key){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {2,3,5,6,8,9,10,15,20,45};
        int key = 20;
        System.out.println("Key is at index: "+binarySearch(arr,key));
    }
}
