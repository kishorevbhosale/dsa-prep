package Arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5};
        reverse(nums);
    }

    private static void reverse(int[] nums){
        if (nums == null || nums.length <= 1) return;
        System.out.println(Arrays.toString(nums));
        int l = 0;
        int r = nums.length-1;
        while (l<r) {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
        System.out.println(Arrays.toString(nums));
    }
}
