public class Occurence {
    public static int firstOccurence(int arr[] , int  key , int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }

    public static int lastOccurence(int arr[] , int key , int n){
        if(n<0){
            return -1;
        }
        if(arr[n-1]==key){
            return n-1;
        }
        return lastOccurence(arr, key, n-1);
    }
    public static void main(String[] args) {
        int arr[] ={1,8,9,6,3,9,2};
        int key = 9;
        System.out.println(firstOccurence(arr, key,0));
        System.out.println(lastOccurence(arr, 2, arr.length));
    }
}
