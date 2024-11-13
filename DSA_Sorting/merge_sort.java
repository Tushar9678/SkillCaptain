import java.util.Arrays;

public class merge_sort{
    public static void main(String[] args){

        int[] arr ={5,4,3,2,1};
        arr = merge_sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    // if array has only one element
    static int[] merge_sort(int[] arr){
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length/2;

        int[] left = merge_sort(Arrays.copyOfRange(arr, 0 , mid));
        int[] right = merge_sort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);


    }

    private static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length + second.length];

        int i=0;
        int j=0;
        int k=0;


        //sort

        while(i<first.length && j<second.length){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        //it may be possible that one of the array is not complete
        // copy the remaining elements

        while(i<first.length){
            mix[k] = first[i];
            i++;
            k++;
        }

        while(j< second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}

//merge sort : Based On Divide and conquer algorithm 
