public class JumpingStatements {
    // 1. Break Statement
    public static void breakStatement() {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }
    }
    
    // 2. Continue Statement
    public static void continueStatement() {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
    }
    
    public static void main(String[] args) {
        System.out.println("\n--- Break Statement ---");
        breakStatement();
        
        System.out.println("\n--- Continue Statement ---");
        continueStatement();
    }
}
