public class PrefixMaxSum {
    public static int prefixMaxSum(int arr[]){
        int n = arr.length;
        int max_sum = Integer.MIN_VALUE;
        int prefix[] = new int[n];
        prefix[0] = arr[0];
        for(int i = 1;i<n;i++){
            prefix[i] =prefix[i-1]+arr[i];
        }
        for(int i = 0;i<n;i++){
            for(int j = i;j<n;j++){
                int start = i;
                int end = j;
                int curr_sum = i==0?prefix[end] :prefix[end] - prefix[start-1];
                max_sum = Math.max(max_sum,curr_sum);
            }
        }
        return max_sum;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int result =prefixMaxSum(arr);
        System.out.println(result);
        
    }
}
