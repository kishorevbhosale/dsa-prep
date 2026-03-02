package Arrays;

public class FindLargestElement {
    public static void main(String args[]){
        int[] nums = {1000000000, 999999999, 123456789};//{42};//{9, 7, 5, 3, 1};//{1, 2, 3, 4, 5};// {-10, -3, -25, -1, -7};//{3, 7, 2, 9, 4};
        int large = largeNumber(nums);
        System.out.println("Large number is : "+large);
    }

    private static int largeNumber(int[] arr){
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
        int MAX = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i>MAX) {
                MAX = i;
            }
        }
        return MAX;
    }
}