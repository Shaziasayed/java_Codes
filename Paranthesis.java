import java.util.*;
public class Paranthesis {

        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '(' || c == '{' || c == '[') {
                    stack.push(c);
                } else {
                    if (stack.isEmpty()) return false;
                    char top = stack.pop();
                    
                    if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                        return false;
                    }
                }
            }
            return stack.isEmpty();// if stack is empty then paranthesis are valid
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string of paranthesis:");
        String s = sc.nextLine();
        if(isValid(s)){
            System.out.println("The paranthesis are valid");
        } else {
            System.out.println("The paranthesis are not valid");
        }
    }
}

