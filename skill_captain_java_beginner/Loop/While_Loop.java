package Loop;
// Program 2: Using a `while` loop to print even numbers between 1 and 20:

public class While_Loop{
    public static void main(String[] args){
        System.out.println("Even numbers between 1 and 20:");
        int num =1;

        while(num <= 20){
            if(num %2 == 0){
                System.out.println(num);
            }
            num++;
        }
    }
}