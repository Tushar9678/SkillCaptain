import java.util.Scanner;

public class Arrayoperations{
    public static void main(String[]  args){
        Scanner in = new Scanner(System.in);

        int [] numbers = new int[5];  //creating a array to store int values

        System.out.println("Enter the 5 numbers :");

        for(int i=0;i<numbers.length;i++){
            System.out.println("Value"+(i+1)+":");
            numbers [i]= in.nextInt();           


         }

         // calculate the sum 

         int sum=0;
         for(int i=0 ; i<numbers.length; i++){
            sum= sum+numbers[i];
         }
         System.out.println("Sum :"+sum);


         // calculate the average

         double avg = sum/numbers.length;
         System.out.println("Average :"+avg);

         // Find the maximum and minimum

         int maximum = numbers[0];
         int minimum = numbers[0];

         for(int i=1;i<numbers.length;i++){

            if(numbers[i]>maximum){
                maximum= numbers[i];
            }

            if(numbers[i]<minimum){
                minimum = numbers[i];
            }
         }

         System.out.println("Maximum :"+maximum);
         System.out.println("Minimum :"+ minimum);
        
        
    }
}