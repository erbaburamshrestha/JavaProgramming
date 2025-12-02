public class MathematicalOperations {
    public static double add(double a, double b) { 
        return a + b; 
    }
    public static long add(long a, long b) { 
        return a + b; 
    }

    public static double subtract(double a, double b) { 
        return a - b; 
    }
    public static long subtract(long a, long b) { 
        return a - b; 
    }

    public static double multiply(double a, double b) { 
        return a * b; 
    }
    public static long multiply(long a, long b) { 
        return a * b; 
    }

    public static double divide(double a, double b) {
        if (b == 0.0){
            System.err.println("Error: Division by zero");
        };
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println("Addition (double): " + add(5.5, 2.3));
        System.out.println("Addition (long): " + add(5L, 2L));

        System.out.println("Subtraction (double): " + subtract(5.5, 2.3));
        System.out.println("Subtraction (long): " + subtract(5L, 2L));

        System.out.println("Multiplication (double): " + multiply(5.5, 2.3));
        System.out.println("Multiplication (long): " + multiply(5L, 2L));

        System.out.println("Division (double): " + divide(5.5, 2.0));
        System.out.println("Division (double) by zero: " + divide(5.5, 0.0));
        return;
    }
}
