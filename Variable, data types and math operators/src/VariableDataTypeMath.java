
public class VariableDataTypeMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 110;
        int num2 = 15; 

        double doubleNum1 = 11.5;
        double doubleNum2 = 12.5; 

        char character = 'Z';

        boolean enjoying = true;

        String greeting = "Hello, World!";

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;
        int remainder = num1 % num2;

        double doubleSum = doubleNum1 + doubleNum2;
        double doubleDifference = doubleNum1 - doubleNum2;
        double doubleProduct = doubleNum1 * doubleNum2;
        double doubleQuotient = doubleNum1 / doubleNum2;

        System.out.println("Integer Operations:");
        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " - " + num2 + " = " + difference);
        System.out.println(num1 + " * " + num2 + " = " + product);
        System.out.println(num1 + " / " + num2 + " = " + quotient);
        System.out.println(num1 + " % " + num2 + " = " + remainder);

        System.out.println("\nDouble Operations:");
        System.out.println(doubleNum1 + " + " + doubleNum2 + " = " + doubleSum);
        System.out.println(doubleNum1 + " - " + doubleNum2 + " = " + doubleDifference);
        System.out.println(doubleNum1 + " * " + doubleNum2 + " = " + doubleProduct);
        System.out.println(doubleNum1 + " / " + doubleNum2 + " = " + doubleQuotient);

        System.out.println("\nCharacter: " + character);
        System.out.println("Are you enjoying? " + enjoying);

        System.out.println("\nString:");
        System.out.println(greeting);
    }
}