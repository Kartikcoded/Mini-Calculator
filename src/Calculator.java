import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        double num1 = sc.nextDouble();

        System.out.println("Enter your second number: ");
        double num2 = sc.nextDouble();

        System.out.println("Select your operation number from below:");
        System.out.println("1 = Addition");
        System.out.println("2 = Subtraction");
        System.out.println("3 = Multiplication");
        System.out.println("4 = Division");
        int operationNum = sc.nextInt();

        double result;

        switch(operationNum){
            case 1:// addition
            result = num1 + num2;
            System.out.println(result);
            break;
            case 2: // subtraction
                result = num1 - num2;
                System.out.println(result);
            break;
            case 3: // multiplication
            result = num1 * num2;
            System.out.println(result);
            break;
            case 4: // division
                if (num2==0){
                    System.out.println("Error: Cannot divide by zero");
                }else {
                    result = num1 / num2;
                    System.out.println(result);
                }
            break;
            default:
            System.out.println("you entered invalid choice");
            break;
        }
    }
}
