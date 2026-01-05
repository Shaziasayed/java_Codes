import java.util.Scanner;
public class PrimeNumberCheck {
    public static void main(String[] args) {
      
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        Boolean isprime=true;
        if (n <= 1) {
            isprime = false;
        } else {
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                isprime=false;
            }
        }
        }
        if (isprime)
            System.out.println("PRIME");
        else
            System.out.println(" NOT PRIME");

    }
}