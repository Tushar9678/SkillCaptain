public class selection{
    public static void main(String[] args){

        int[] arr = {5,3,2,4,1};
    
        // selection sort

        for(int i=0; i<arr.length-1; i++){
            int min = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
             //Swap
             int temp = arr[min]; 
             arr[min] = arr[i]; 
             arr[i] = temp; 

        }
        System.out.println("Sorted array :");
        for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+" ");
        }
    }
}

/* Selection sort : repetedly selecting smallest/largest element from the unsorted portion of the list .
                     and moving it to the sorted portion of the list.

    time complexity : best case = O(N^2)
                    worst case = O(N^2)

    stable
    perform well in small list

 */
