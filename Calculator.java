import java.util.Scanner;

public class Calculator {

    public static double add(double a, double b) {
        double result = a + b;
        return result;
    }

    public static double subtract(double a, double b) {
        double result = a - b;
        return result;
    }

    public static double divide(double a, double b) {
        double result = a / b;
        return result;
    }

    public static double multiply(double a, double b) {
        double result = a * b;
        return result;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        boolean continueCalc = true;

        while (continueCalc) {
            System.out.println("Enter number 1: ");
            double number1 = sc.nextDouble();

            System.out.println("Enter number 2: ");
            double number2 = sc.nextDouble();

            System.out.println("Enter operator(+, -, /, *): ");
            String operator = sc.next();

            switch (operator) {
                case "+":
                    System.out.println(add(number1, number2));
                    break;

                case "-":
                    System.out.println(subtract(number1, number2));
                    break;

                case "/":
                    if(number2 == 0){
                        System.out.println("Cannot divide by 0");
                        break;
                    }else{
                        System.out.println(divide(number1, number2));
                    }
                    break;

                case "*":
                    System.out.println(multiply(number1, number2));
                    break;
                
                default:
                System.out.println("Invalid operator!");
                    break;
            }
            System.out.println("if you want to continue, enter 1 else enter 2 : ");
            int c = sc.nextInt();

            if(c == 1){
                continueCalc = true;
            }else{
                continueCalc = false;
            }
        }

    }
}