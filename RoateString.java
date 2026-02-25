public class RoateString {
    public static void main(String[] args) {
        String str = "Hello World";
        int n = 2;
        String rotated = rotateString(str, n);
        System.out.println("Original string: " + str);
        System.out.println("Rotated string: " + rotated);
    }

    public static String rotateString(String str, int n) {
        if (n == 0) return str;
        n = n % str.length();
        return str.substring(n) + str.substring(0, n);
    }
}