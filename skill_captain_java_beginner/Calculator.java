import java.util.Scanner;

public class Calculator{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int operator;

        System.out.println("-------------MENU-------------");
        System.out.println("1-ADD \n2-SUBTRACT \n3-MULTIPLY  \n4-DIVISION");
         System.out.println("Choose Operator");
         operator =in.nextInt();


        System.out.println("Enter a first number :");
        int num1 = in.nextInt();
        System.out.println("Enter a Second number :");
        int num2 = in.nextInt();

     
        int result =0;
        switch (operator){
            case 1:
            result = num1+num2;
            break;

            case 2: 
            result = num1-num2;
            break;

            case 3:
            result = num1*num2;
            break;

            case 4:
            result = num1/num2;
            break;

            default:
                System.out.println("Error: Invalid operation.");
                return;
        }
        System.out.println("Ans :"+result);

    }
}
