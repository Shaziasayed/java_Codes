public class Gcdofnum {
    public static void main(String[] args) {
        int num1 = 48;
        int num2 = 18;

        int gcd = findGCD(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        int lcm = lcm(num1, num2);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
    
    // public static int findGCD(int a, int b) {
    //     int gcd = 1;
    //     int min = Math.min(a, b);
    //     for (int i = 1; i <= min; i++) {
    //         if (a % i == 0 && b % i == 0) {
    //             gcd = i;
    //         }
    //     }
    //     return gcd;
    //}
    public static int gcd(int a,int b){
        while(b!=0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }
    public static int findGCD(int a, int b) {
        return gcd(a, b);
    }
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}
