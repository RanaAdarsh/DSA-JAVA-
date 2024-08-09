public class SubArray {

    // PRINTING SUBARRAYS
    public static void subarray(int arr[]){
        int n =arr.length;
        for(int i = 0;i<n;i++){
            for(int j= i;j<n;j++){
                int start = i;
                int end = j;
                System.out.print("{ ");
                for(int k = start ; k<=end;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.print(" }");
            }
            System.out.println();
        }
    }

    //FINDING MAXIMUM SUM OF SUBARRAYS
    public static void maxsum(int arr[]){
        int maxsum = Integer.MIN_VALUE;

        int n =arr.length;
        for(int i = 0;i<n;i++){
            for(int j= i;j<n;j++){
                int cursum = 0;
                int start = i;
                int end = j;
                for(int k = start ; k<=end;k++){
                    cursum += arr[k];
                }
                maxsum = Math.max(cursum,maxsum);
            }
        }
        System.out.println("Maximum Sum of Subarray is :"+maxsum);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        subarray(arr);
        maxsum(arr);
    }
}
