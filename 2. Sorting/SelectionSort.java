public class SelectionSort {
    public static void sort(int arr[]){
        int n = arr.length;
        for(int i = 0;i<n-1;i++){
            int minpos = i;
            for(int j =i+1;j<n;j++){
                if(arr[minpos]>arr[j]){
                    minpos = j;
                }
            }
            if(minpos!=i){
                int tmp = arr[minpos];
                arr[minpos] = arr[i];
                arr[i] = tmp;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,5,4,6,9,1,7,8};
        sort(arr);
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
}
