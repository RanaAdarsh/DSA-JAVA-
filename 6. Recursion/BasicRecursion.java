public class BasicRecursion {
    //Print N numbers in increasing order
    public static void Ninc(int N){
        if(N==1){
            System.out.print(N+" ");
            return;
        }
        else{
            Ninc(N-1);
            System.out.print(N+" ");
        }
    }

    //Print N numbers in Decreasing order
    public static void Ndec(int N){
        if(N==1){
            System.out.print(N+" ");
        }
        else{
            System.out.print(N+" ");
            Ndec(N-1);
        }
    }

    //Sum of N Natural Numbers
    public static int sum(int N){
        if(N==1){
            return 1;
        }
        else{
            return N+sum(N-1);
        }
    }
    public static void main(String[] args) {
        Ninc(20);
        System.out.println();
        Ndec(20);
        System.out.println();
        System.out.println(sum(10));
    }
}
