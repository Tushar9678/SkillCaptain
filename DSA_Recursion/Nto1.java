// print the numbers from  N to 1

public class Nto1{
    public static void main(String[] args){
        System.out.println("printing numbers from 5 to 1");
        solution(5);
        System.err.println("printing numbers from 1 to 5");
        fun_rev(5);

        
    }

    static void solution(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        solution(n-1);
        
    }

    // print numbers 1 to 5
    static void fun_rev(int n){
        if(n <= 0) {
            return;
        }
        fun_rev(n - 1);
        System.out.println(n);
    }
}

