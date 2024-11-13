public class MinimumSubarrayLength {

    public static int minSubArrayLen(int target, int[] nums) {
         int left = 0;
         int sum = 0;
         int minLength = Integer.MAX_VALUE;

         for (int right = 0; right < nums.length; right++) {
             sum += nums[right];
             while (sum >= target) {
                 minLength = Math.min(minLength, right - left + 1);
                 sum -= nums[left];
                 left++;
             }
         }

         return minLength != Integer.MAX_VALUE ? minLength : 0;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 3, 1, 2, 4, 3};
        int target1 = 7;
        System.out.println("Output: " + minSubArrayLen(target1, nums1));
    }
}