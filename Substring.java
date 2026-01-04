import java.util.Scanner;
public class Substring {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();
        String sub = obj.nextLine();
        int count=0;
        for(int i=0;i<=str.length()-sub.length();i++){
            if(str.substring(i,i+sub.length()).equals(sub)){
                count++;
            }
        }
        System.out.println(count);
    }
} 
    

