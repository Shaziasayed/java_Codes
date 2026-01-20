import java.util.Scanner;
import java.util.Stack;
public class Reverseofstack02 {
    public static void main(String[] args) {
       
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();
        Stack <String> stack=new Stack<>();
        String [] words=s.split(" ");
        for(int i=0;i<words.length;i++){
            stack.push(words[i]);
        }
        String reversed=" ";
        while(!stack.isEmpty()){
            reversed=reversed+stack.pop();
            if(!stack.isEmpty()){
                reversed=reversed+" ";
            }
        }
        System.out.println(reversed);
    }
}