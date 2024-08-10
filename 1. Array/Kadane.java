public class Kadane {
    public static int kadane(int arr[]){
        int n = arr.length;
        int curr_sum = 0;
        int max_sum = 0;
        for(int i = 0;i<n;i++){
            curr_sum += arr[i];
            if(curr_sum<0){
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        return max_sum;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int result = kadane(arr);
        System.out.println(result);
    }
}
