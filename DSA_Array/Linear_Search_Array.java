public class Linear_Search_Array{

    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7,8,9,0};

        int target= 4;
        int index = -1;

        for(int i=0; i<nums.length; i++){
            if(nums[i]==target){
                index = i;
                break;
            }
        }

        if(index != -1){
            System.out.println("Element found at index :"+ index);
        }
        else{
            System.out.println("Element not found in Array:");

        }
    }
    
}