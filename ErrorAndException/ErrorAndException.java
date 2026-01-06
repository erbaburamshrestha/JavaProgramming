package ErrorAndException;
/**
 * Unit 5: Handling Error/Exceptions - 2 Hrs
    * 1. Basic Exceptions
    * 2. Proper use of exceptions
    * 3. User defined Exceptions
    * 4. Catching Exception: try, catch
    * 5. Throwing and re-throwing: throw, throws
    * 6. Cleaning up using the finally clause
    */
public class ErrorAndException {
    
    // ============ BASIC EXCEPTIONS ============
    // Exception: An event that disrupts normal program flow
    // Types: Checked (compile-time) and Unchecked (runtime)
    // Common: NullPointerException, ArrayIndexOutOfBoundsException, ArithmeticException
    // ============ TRY-CATCH BLOCK ============
    // Syntax: try { risky code } catch (ExceptionType e) { handle }
    public void tryCatchExample() {
        try {
            int result = 10 / 0;  // Will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero: " + e.getMessage());
        }
    }
    
    
    // ============ THROW STATEMENT ============
    // Used to explicitly throw an exception
    public void throwExample(int age) throws IllegalArgumentException {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }
    
    
    // ============ THROWS KEYWORD ============
    // Declares that a method may throw exceptions
    // Method signature: public void method() throws ExceptionType { }
    
    
    // ============ FINALLY CLAUSE ============
    // Executes regardless of exception occurrence
    // Used for cleanup (closing files, resources)
    public void finallyExample() {
        try {
            // risky code
        } catch (Exception e) {
            System.out.println("Exception caught");
        } finally {
            System.out.println("This always executes");
        }
    }

    // ============ USER DEFINED EXCEPTION ============
    // Custom exception class extending Exception or RuntimeException
    public static class CustomException extends Exception {
        public CustomException(String message) {
            super(message);
        }
    }
    
}
