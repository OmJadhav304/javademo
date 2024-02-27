public class LinearSearch {
    
    public static int linearSearch(int arr[],int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int key = 30;
        int number[] = {2,5,1,8,9,30,56,10};
        int index = linearSearch(number,key);
        
        if(index == -1){
            System.out.println("Not Found");
        }else{
            System.out.println("Key is at index: "+index);
        }
    }
}
