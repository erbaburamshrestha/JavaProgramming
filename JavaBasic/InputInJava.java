import java.util.Scanner;

class InputInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a byte: ");
        byte b = sc.nextByte();

        System.out.print("Enter a short: ");
        short s = sc.nextShort();

        System.out.print("Enter an int: ");
        int i = sc.nextInt();

        System.out.print("Enter a long: ");
        long l = sc.nextLong();

        System.out.print("Enter a float: ");
        float f = sc.nextFloat();

        System.out.print("Enter a double: ");
        double d = sc.nextDouble();

        System.out.print("Enter a boolean: ");
        boolean bo = sc.nextBoolean();

        System.out.print("Enter a char: ");
        char c = sc.next().charAt(0);

        sc.nextLine(); // consume end of line before reading full line
        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        // Single print statement (concatenated)
        System.out.println("\nSingle print: byte=" + b + ", short=" + s + ", int=" + i +
                ", long=" + l + ", float=" + f + ", double=" + d + ", boolean=" + bo +
                ", char=" + c + ", String=\"" + str + "\"");

        // Multiple print statements
        System.out.println("Multiple prints:");
        System.out.println("byte = " + b);
        System.out.println("short = " + s);
        System.out.println("int = " + i);
        System.out.println("long = " + l);
        System.out.println("float = " + f);
        System.out.println("double = " + d);
        System.out.println("boolean = " + bo);
        System.out.println("char = " + c);
        System.out.println("String = " + str);
    }
}
