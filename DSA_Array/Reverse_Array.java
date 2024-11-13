public class Reverse_Array {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = nums.length;

        for (int i = 0, j = n - 1; i < j; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        // Display reversed array
        for (int i=0; i<n; i++) {
            System.out.print(nums[i]+" ");
        }
    }
}
