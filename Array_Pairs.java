public class Array_Pairs {
    
    public static void printPairs(int number[]){
        for(int i=0; i<number.length; i++){
            int currNo = number[i];
            for(int j=i+1; j<number.length; j++){
                System.out.print("("+currNo+","+number[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int arr[] = {2,4,6,8,10,12};
        printPairs(arr);
    }
}
