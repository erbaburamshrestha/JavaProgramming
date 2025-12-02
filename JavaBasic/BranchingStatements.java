public class BranchingStatements {
    // 1. If Statement
    public static void ifStatement(int age) {
        if (age > 18) {
            System.out.println("Person can Vote.");
        }
    }
    
    // 2. If-Else Statement
    public static void ifElseStatement(int num) {
        if (num > 0) {
            System.out.println("Number is Greater than Zero");
        } else {
            System.out.println("Number is less than or Equal to Zero");
        }
    }

    // 3. If-Else Statement
    public static void elseIfLadderStatement(int num) {
        if (num > 0) {
            System.out.println("Number is positive");
        } else if (num < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }
    }
    
    // 4. Switch Statement
    public static void switchStatement(int day) {
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }

    
    public static void main(String[] args) {
        System.out.println("--- If Statement ---");
        ifStatement(50);
        
        System.out.println("\n--- If Else Statement ---");
        ifElseStatement(2);

        System.out.println("\n--- Else If Ladder Statement ---");
        elseIfLadderStatement(-5);

        System.out.println("\n--- Switch Statement ---");
        switchStatement(2);
    }
}
