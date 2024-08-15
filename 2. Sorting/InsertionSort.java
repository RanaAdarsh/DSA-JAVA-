public class InsertionSort {
    public static void sort(int arr[]){
        int n = arr.length;
        for(int i = 1;i<n;i++){
            int current = arr[i];
            int prev = i-1;
            while(prev >= 0 && arr[prev]>current){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = current;
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,1,3,9,8,6,7};
        sort(arr);
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}
