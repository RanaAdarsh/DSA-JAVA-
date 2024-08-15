public class UpperToLower {
    public static void convert(){
        for(char ch = 'A' ; ch <= 'Z' ; ch++){
            System.out.print((char)(ch | ' '));
        }
    }
    public static void main(String[] args) {
        convert();
    }
}
