package JAVA;
               public class binarypair {
    public static void main(String[] args) {
        // Example where "return immediately" would FAIL
        int[] nums = {1, 1, 2, 2, 3, 4, 4};  // answer = 3

        int ans = singleNonDuplicate(nums);
        System.out.println("Single element = " + ans);
    }

    public static int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            // force mid to be even (so it's the first element of a pair)
            if (mid % 2 == 1) {
                mid--;
            }

            System.out.println("start=" + start + ", end=" + end + ", mid=" + mid);

            if (nums[mid] == nums[mid + 1]) {
                // pair matched → single element is on the right side
                start = mid + 2;
            } else {
                // pair not matched → single element is on the left side (including mid)
                end = mid;
            }
        }

        // loop ends when start == end
        return nums[start];
    }
}
