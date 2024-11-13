import java.util.Scanner;

public class Large_no{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
      

        System.out.println("Enter a 1st number :");
        int firstnumber = obj.nextInt();

        System.out.println("Enter a 2nd Number :");
        int secondnumber = obj.nextInt();

        int larger_no;

        if(firstnumber>secondnumber){
            larger_no = firstnumber;
        }else{
            larger_no = secondnumber;
        }

        System.out.println("The larger number is:"+ larger_no);

    }
}
