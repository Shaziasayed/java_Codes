import java.util.Scanner;
import java.util.Stack;
public class ReverseOfStack {
    public static void main(String[] args) {
       
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();
        Stack <Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            stack.push(s.charAt(i));
        }
        String reversed=" ";
        while(!stack.isEmpty()){
            reversed=reversed+stack.pop();
        }
        System.out.println(reversed);
        obj.close();
    }
}