import java.util.*;

public class bubble{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        // Take a array from the user

        System.out.println("Enter the size of array :");
        int arr_size =0;
        if(in.hasNextInt()){
            arr_size = in.nextInt();
        }

        int [] arr = new int[arr_size];

        System.out.println("Enter the element in array :");
        for(int i=0; i<arr_size; i++){
            if(in.hasNextInt()){
                arr[i] = in.nextInt();
            }
        }

        //bubble sort
        
        for(int i=0; i<arr.length; i++){
            for(int j=1; j<arr.length-i; j++){  // j<arr.length-i  ----- for every pass last ele will be sorted so no need to consider
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }

        System.out.println("Sorted array :");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}

/* 
bubble sort :traverse from left and compare adjacent elements and the higher one is placed at right side. 
            :also known as :sinking / exchange sort

space complexity :  O(1) : no extra space is required 
Time complexity :   Best case : O(n) 
                    worst case : O(n^2)  

Stable Sorting algo : After sorting (For same values) the privious order is maintained 
*/

