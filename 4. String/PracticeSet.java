import java.lang.reflect.Array;
import java.util.Arrays;

public class PracticeSet {

    // 1.   COUNT HOW MANYTIMES LOWERCASE VOWELS OCCURRED IN A STRING ENTERED BY THE USER.
    public static int count_lowercaseVowel(String str){
        int count = 0;
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        return count;
    }

    // 2. CHECK FOR ANAGRAMS STRING
    public static void anagrams(String str1 , String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length()==str2.length()){
            char []str1arr = str1.toCharArray();
            char []str2arr = str2.toCharArray();
            Arrays.sort(str1arr);
            Arrays.sort(str2arr);
            boolean result = Arrays.equals(str1arr,str2arr);
            if(result){
                System.out.println("Both Strings are anagrams to each other!");
            }
            else{
                System.out.println("Both Strings are not anagrams to each other!");
            }
            return ;
        }
        System.out.println("Both Strings are not anagrams to each other!");


    }

    public static void main(String[] args){
        String str = "abcdejghiHGoUbbgE";
        // System.out.println(count_lowercaseVowel(str));
        String str1 = "race";
        String str2 = "care";
        anagrams(str1, str2);

    }
}
