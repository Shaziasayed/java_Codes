 import java.util.Scanner;
public class Binary {
    public static void main(String[] args) {
       
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        int sum=a+b;
        String binary=Integer.toBinaryString(sum);
        System.out.println(binary);
    }
} 
    

