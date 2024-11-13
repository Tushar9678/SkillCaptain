public class count{
    
    public static void main(String[] args){

        int[] arr = {4,2,2,8,3,3,1};

        int max=0;

        //find the maximum value in the array 

        for(int num : arr ){
            if(num> max){
                max = num;
            }
        }

          // frequency array

        int[] count = new int[max+1];

        for(int num : arr){
            count[num]++;
        }

          // Update the original array based on the frequency array

        int index = 0;

        for(int i=0; i<= max; i++){
            while(count[i]>0){
                arr[index] = i;
                index++;
                count[i]--;
            }
        }

        //print
        for(int num : arr){
            System.out.print(num +" ");
        }   
    }
}

/*
    count sort :The basic idea behind Counting Sort is to count the frequency of each distinct element in the input array and use that       
                 information to place the  elements in their correct sorted positions.
                 :non- comparison sorting algo
                 :use when limited range of values or range is given 
                 : stable
    
    time complexity : O(n+m)
 */
