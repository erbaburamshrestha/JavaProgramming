public class CommandLineArguments {
    public static void main(String[] args) {
        if (args.length == 3) {
            // String operation = args[0];
            // String num1 = args[1];
            // String num2 = args[2];
            String operation = "add";
            String num1 = "10";
            String num2 = "14";
            if ("add".equalsIgnoreCase(operation)) {
                handleAddition(num1, num2);
            } else if ("subtract".equalsIgnoreCase(operation)) {
                handleSubtraction(num1, num2);
            } else {
                System.out.println("Invalid operation. Use 'add' or 'subtract'.");
            }
        } else {
            System.out.println("Please provide an operation and two numbers.");
        }
    }

    private static void handleAddition(String num1, String num2) {
        try {
            int sum = Integer.parseInt(num1) + Integer.parseInt(num2);
            System.out.println("Sum: " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Invalid numbers for addition.");
        }
    }

    private static void handleSubtraction(String num1, String num2) {
        try {
            int difference = Integer.parseInt(num1) - Integer.parseInt(num2);
            System.out.println("Difference: " + difference);
        } catch (NumberFormatException e) {
            System.out.println("Invalid numbers for subtraction.");
        }
    }
}
