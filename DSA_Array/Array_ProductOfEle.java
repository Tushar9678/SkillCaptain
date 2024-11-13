/* Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i]. 
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
You must write an algorithm that runs in O(n) time and without using the division operation.

Example 1:

Input: nums = [1,2,3,4] Output: [24,12,8,6]*/

import java.util.Arrays;

public class Array_ProductOfEle{

    public static int[] productexceptself(int []nums){
      
        int n = nums.length;

        int [] left = new int[n]; 
        int [] right = new int [n];

        //Array travesing from left to right AND calculate the product of left side ele from current
        left[0] =1;
        for(int i=1; i<n; i++){
            left[i] = left[i-1] * nums[i-1];
        }

        //Array travesing from right to left AND calculate the product of right side ele from current
        right[n-1] = 1;
        for(int i=n-2; i>=0; i--){
            right[i] = right[i+1]*nums[i+1];
        }

        // multifly left & right array
        
        int [] res = new int[n];
        for(int i=0; i<n; i++){
            res[i] = left[i]*right[i];
        }
        return res;
    }

    public static void main(String[] args){
        int [] nums = {1,2,3,4};
        int [] res = productexceptself(nums);
        System.out.println(Arrays.toString(res));
    }
}
