public class BubbleSort {

    public static void sort(int arr[]){
        int n = arr.length;
        int swap = 0;
        for(int i = 0;i<n-1;i++){
            for(int j = 0 ;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                    swap++;
                }
            }
                if(swap==0){
                    System.out.println("Array already sorted.");
                    break;
                
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {2 ,3, 4, 5, 6 ,7, 8 ,9};
        sort(arr);
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
