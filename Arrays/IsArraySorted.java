package Arrays;

public class IsArraySorted {
    public static void main(String[] args) {
        int[] nums = {3, 7, 2, 9, 4};//{2,2,2,2};//{1, 2, 3, 4, 5};//{3, 7, 2, 9, 4};//
        boolean sorted = isSorted(nums);
        System.out.println("Is array sorted : "+sorted);
    }

    private static boolean isSorted(int[] nums){
    
        for (int i = 1; i < nums.length-1; i++) {
            if (nums[i]<nums[i-1]) {
                return false;
            }
        }
        return true;
    }
}
