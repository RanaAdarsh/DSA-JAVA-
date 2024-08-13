public class CountSetBits {
    public static int Check(int num){
        int count = 0;
        while(num>0){
            if((num&1)!=0){
                count++;
            }
            num = num>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(Check(10));
    }
}
