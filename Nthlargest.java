import java.util.Arrays;

class Nthlargest {
    public int nthLargest(int[] nums, int n) {
        if (n > nums.length) return -1;

        Arrays.sort(nums);
        return nums[nums.length - n];
    }
    public static void main(String[] args) {
        Nthlargest nl = new Nthlargest();
        int[] numbers = {10, 5, 8, 20, 15};
        int n = 3;
        System.out.println(n + "th Largest: " + nl.nthLargest(numbers, n));
    }
}
