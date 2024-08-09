package Array;

public class Initialize {
    //LARGEST ELEMENT IN THE ARRAY.
    public static int Largest(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i= 0;i<arr.length;i++){
            if(arr[i]>largest){
                largest =arr[i];
            }
        }
        return largest;
    }


    //SMALLEST ELEMENT IN ARRAY.
    public static int Smallest(int arr[]){
        int smallest  = Integer.MAX_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest = arr[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int arr[] = {9,5,11,56,47,34,2,6,4};
        int largest = Largest(arr);
        System.out.println("Largest element in the array is :"+largest);


        int smallest = Smallest(arr);
        System.out.println("Smallest element in the array is :"+smallest);
    }
}
