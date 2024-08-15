import java.nio.channels.Pipe.SourceChannel;

public class CountingSort {
    public static void sort(int arr[]){
        int n = arr.length;
        int largest = Integer.MIN_VALUE;
        for(int i = 0 ;i<n;i++){
            largest = Math.max(arr[i] , largest);
        }

        int count[] = new int[largest+1];
        for(int i = 0;i<n;i++){
            count[arr[i]]++;
        }

        int j = 0;
        for(int i = 0 ;i<count.length;i++){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {9,3,8,1,7,2,4,6,5};
        sort(arr);
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
