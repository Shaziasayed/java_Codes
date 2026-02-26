public class Missingnumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int missingNumber = findMissingNumber(arr);
        System.out.println("The missing number is: " + missingNumber);
    }
    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1; // Since one number is missing
        int totalSum = n * (n + 1) / 2; // Sum of first n natural numbers
        int arraySum = 0;
        for (int num : arr) {
            arraySum += num; // Sum of elements in the array
        }
        return totalSum - arraySum; // The missing number is the difference
    }
}
