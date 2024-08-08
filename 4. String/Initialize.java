import java.util.*;


public class Initialize {

    //Print String using charAt() method
    public static void printString(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch[] = {'a' , 'b' , 'c' , 'd'};
        System.out.println(ch);

        String str1 = "AbCd";
        System.out.println(str1);

        String str2 = new String("AJH@#1234");
        System.out.println(str2);

        //Takes a word as input
        String word = sc.next();
        System.out.println(word);

        //Takes a whole line as input
        String line  = sc.nextLine();
        System.out.println(line);

        //To find length of a string
        int len = line.length();
        System.out.println(len);

        printString("I am Adarsh Rana a Software Engineer");


        sc.close();
    }
}
