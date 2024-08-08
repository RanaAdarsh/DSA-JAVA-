public class PrintSubstring {
    public static void substring(String str , int si , int ei){
        String Substr = "";
        for(int i = si;i<ei;i++){
            Substr += str.charAt(i);
        }
        System.out.println(Substr);
    }
    public static void main(String[] args) {
        String str = "Hello World";
        substring(str, 0, 4);

        //Inbuilt Substring Function
        String substr = str.substring(0,4);
        System.out.println(substr);
    }
}
