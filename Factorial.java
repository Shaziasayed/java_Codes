import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
       
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int f=1;
        int i=1;
        while(i<=n){
            f=f*i;
            i++;
        }
        System.out.println(f);
    }
}

