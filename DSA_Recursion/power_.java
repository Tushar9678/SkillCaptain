// Q :Implement pow(x, n), which calculates x raised to the power n (i.e., x^n).


public class power_ {
                public static void main(String[] args) {
                    
                    double base = 2;
                    int exponent = 5;
                    double result = power(base,exponent);
        
                    System.out.println("Ans :"+result);
                }
                
                public static double power (double x, int n){
                    if(n==0){
                        return 1;
                    }else if(n % 2 == 0){
                        double half = power(x,n/2);
                        return half*half;
                    } else{
                        double half = power(x, (n-1)/2);
                        return x * half *half;
                    }
                    
                }
            }