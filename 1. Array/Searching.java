package Array;

public class Searching {
    public static int LinearSearch(int arr[],int key){
        for(int i =0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static int BinarySearch(int arr[] , int key){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid]>key){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {9,5,11,56,47,34,2,6,4};
        int key1 = 56;
        int Lindex = LinearSearch(arr, key1);
        System.out.println(key1+" is present at index: "+Lindex+" ,through Linear Search!");

        int arr1[] = {1,3,6,9,13,15,23,34,56};
        int key = 15;
        int Bindex = BinarySearch(arr1 , key);
        System.out.println(key+" is present at index: "+Bindex+" ,through Binary Search!");

    }
}
