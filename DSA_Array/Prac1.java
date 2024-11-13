public class Prac1{
    public static void main(String[] args){
        int[] numbers = {1,2};
        int max = numbers[0];
        int min = numbers[0];
        double sum=0;

        for(int i=0; i<numbers.length; i++){
            if(numbers[i]>max){
                max=numbers[i];
            }
            if(numbers[i]<min){
                min=numbers[i];
            }

            sum = numbers[i]+sum;

            System.out.println(numbers[i]);

        }

        double res = (double) sum/numbers.length;

        System.out.println("Max :"+max);
        System.out.println("Min :"+min);
        System.out.println("AVG : " + res);


    }
}