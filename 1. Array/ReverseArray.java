public class ReverseArray {


    //BY USING EXTRA SPACE.
    public static void reverse1(int arr[]){
        int newarr[] = new int[arr.length];
        int i = arr.length-1;
        int j =0 ;
        while(i>=0 && j<=arr.length-1){
            newarr[j] = arr[i];
            i--;
            j++;
        }
        printArray(newarr);
    }


    //WITHOUT USING EXTRA SPACE
    public static void reverse2(int arr[]){
        int i= 0;
        int j=arr.length-1;
        while(i<j){
            int temp =arr[i];
            arr[i] = arr[j];
            arr[j] = temp; 
            i++;
            j--;
        }
        printArray(arr);
    }

    public static void printArray(int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        reverse1(arr);
        reverse2(arr);

    }
}
