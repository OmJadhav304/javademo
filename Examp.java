public class Examp {
    
    public static void subArray(int num[]){
        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=i;j<num.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.println(num[k]);
                }
            }
            System.out.println();
        }
    }
        public static void main(String args[]){
            int arr[]={2,4,6,8,10};
            subArray(arr);
        }
    
}
