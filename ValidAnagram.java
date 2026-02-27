import java.util.Arrays;
import java.util.Scanner;
public class ValidAnagram {
    public boolean anagramStrings(String s, String t) {
       if(s.length()!=t.length()){
            return false;
        }
        char [] sarray=s.toCharArray();
        char [] tarray=t.toCharArray();
        Arrays.sort(sarray);
        Arrays.sort(tarray);
        return Arrays.equals(sarray,tarray);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string:");
        String s=sc.nextLine();
        System.out.println("Enter the second string:");
        String t=sc.nextLine();
        ValidAnagram va=new ValidAnagram();
        boolean result=va.anagramStrings(s,t);
        if(result){
            System.out.println("The strings are anagrams.");
        }else{
            System.out.println("The strings are not anagrams.");
        }
    }
}
