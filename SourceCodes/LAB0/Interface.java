public class Interface {
    public interface Greeter {
        void greet();
    }

    private static class GreeterImpl implements Greeter {
        @Override
        public void greet() {
            System.out.println("Hello from GreeterImpl");
        }
    }

    public static void main(String[] args) {
        Greeter greeter = new GreeterImpl();
        greeter.greet();
    }
}
