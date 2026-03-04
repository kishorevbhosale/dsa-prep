package Arrays;

import java.util.Arrays;

public class RotateArrayByK {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        System.out.println(Arrays.toString(nums));
        rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }

    private static void rotate(int[] nums, int k){
        int j = nums.length;
        reverseArray(nums, 0, j-1);
        reverseArray(nums, 0, k-1);
        reverseArray(nums, k, j-1);

    }

    private static void reverseArray(int[] nums, int i, int j){
        while (i<j) {
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
            i++;
            j--;
        }
    }
}


