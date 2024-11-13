public class RecursiveBubbleSort {

    static void recursiveBubbleSort(int arr[], int n) {
        // Base case
        if (n == 1) {
            return;
        }

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                // Swap 
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        // Recur with a reduced size
        recursiveBubbleSort(arr, n - 1);
    }

    // function to print an array
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int [] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original array:");
        printArray(arr);

        // Perform recursive bubble sort
        recursiveBubbleSort(arr, arr.length);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}
