package Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] nums = {2,2,2,2};//{3, 7, 2, 9, 4};//{-10, -3, -25, -1, -7};//{1, 2, 3, 4, 5};//{9, 7, 5, 3, 1};//{42}; //{1000000000, 999999999, 123456789};////////
        int secondMax = secondLargest(nums);
        System.out.println(secondMax);
    }

    private static int secondLargest(int[] nums){
        if (nums == null || nums.length <2) {
            throw new IllegalArgumentException("Array contains at least 2 element");
        }
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE; 
        for (int i : nums) {             
            if (i>first) {
                second = first;
                first = i;
            }else if (i>second && i!=first) {
                second = i;
            }
        }
        if (second==Integer.MIN_VALUE) {
            throw new IllegalArgumentException("All elements are equal!");
        }
        return second;

    }
}
