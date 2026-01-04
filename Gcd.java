import java.util.Scanner;
public class Gcd {
    public static void main(String[] args) {
      
        Scanner obj = new Scanner(System.in);
        int n1 = obj.nextInt();
        int n2 = obj.nextInt();
        int gcd=1;
        for (int i=1;i<=Math.min(n1,n2);i++){
            if(n1%i==0 && n2%i==0){
                gcd=i;
            }
        } 
        System.out.println(gcd);
        obj.close();
    }
}