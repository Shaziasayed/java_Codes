import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
      
        Scanner obj = new Scanner(System.in);
        int n= obj.nextInt();
        if (n==1){
            System.out.println(1);
            return;
        }
         if (n==2){
            System.out.println(2);
            return;
         }
        int a=1;
        int b=2;
        int c=0;
        for(int i=3;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
        }
            System.out.println(b);
        
    }
}