public class Swapping {
    public static void swap(int x , int y){
        System.out.println("x :"+x+", y :"+y);
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;.
        System.out.println("x :"+x+", y :"+y);
    }
    public static void main(String[] args) {
        swap(7 ,5);
    }
}
