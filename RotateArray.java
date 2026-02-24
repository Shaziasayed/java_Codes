import java.util.*;
public class RotateArray {
    public void rotate(int[] nums, int k) {
      int n=nums.length;
      k=k%n; 
      reverse(nums,0,n-1);
      reverse(nums,0,k-1);
      reverse(nums,k,n-1);

    }
    public void reverse(int [] nums,int left,int right){
        while(left<right)
        {
        int temp=nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
        left++;
        right--;
    }
}
public static void main(String... abc){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    int n=sc.nextInt();
    int [] nums=new int[n];
    System.out.println("Enter the elements of the array:");
    for(int i=0;i<n;i++){
        nums[i]=sc.nextInt();
    }
    System.out.println("Enter the number of rotations:");
    int k=sc.nextInt();
    RotateArray ra=new RotateArray();
    ra.rotate(nums,k);
    System.out.println("Rotated array:");
    for(int i=0;i<n;i++){
        System.out.print(nums[i]+" ");
    }
}
}

