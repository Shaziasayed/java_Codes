public class SecondLargest {
    public static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        
        return secondLargest;
    }
    
    public static void main(String[] args) {
        int[] numbers = {10, 5, 8, 20, 15};
        System.out.println("Second Largest: " + findSecondLargest(numbers));
    }
}