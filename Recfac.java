import java.util.*;
public class Recfac {
    int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static void main(String args[]) {
        Recfac rf = new Recfac();
        int num = 7;
        int result = rf.factorial(num);
        System.out.println( result);
    }
}
