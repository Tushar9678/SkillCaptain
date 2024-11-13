import java.util.*;

public class insertion{
    public static void main(String [] arg){

        Scanner in = new Scanner(System.in);

        //Take a array from the user

        System.out.println("Enter the size of the array :");
        int arr_size = 0;
        if(in.hasNextInt()){
            arr_size = in.nextInt();
        }
        int[] arr = new int[arr_size];

        System.out.println("Enter the element in the array :");
        for(int i=0; i<arr_size; i++){
            if(in.hasNextInt()){
                arr[i] = in.nextInt();
            }
        }

         //Insertion Sort

        for(int i=0; i<arr.length-1; i++){   // for(int i=0; i<= arr.length-2; i++)
            for(int j=i+1; j>0; j--){
                if(arr[j]<arr[j-1]){
                   int temp = arr[j-1];
                   arr[j-1] = arr[j];
                   arr[j] = temp;
                }else{
                    break;
                }
            }
        }
       //print sorted array
        System.out.println("Sorted array :");
       for(int i=0; i<arr_size; i++){
        System.out.print(arr[i]+" ");

       }

    }
}

/*Insertion Sort :To sort an array of size N in ascending order 
                     iterate over the array and compare the current element (key) to its predecessor,
                     if the key element is smaller than its predecessor, compare it to the elements before. 
                     Move the greater elements one position up to make space for the swapped element.

Time complexity : Best case = O(n) and Worst case : O(n^2)
Space complexity :O(1)
*/