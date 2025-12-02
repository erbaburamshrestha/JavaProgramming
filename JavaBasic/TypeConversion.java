public class TypeConversion {

    public static void main(String[] args) {
        // 1) Implicit widening conversions (no cast needed)
        byte b = 10;
        short s = b; // byte -> short
        int i = s; // short -> int
        long l = i; // int -> long
        float f = l; // long -> float
        double d = f; // float -> double
        char ch = 'A';
        int fromCharToInt = ch; // char -> int
        double fromCharToDouble = ch; // char -> double

        System.out.println("Widening: byte->short->int->long->float->double: " + d);
        System.out.println("char 'A' -> int: " + fromCharToInt + ", -> double: " + fromCharToDouble);

        // 2) Explicit narrowing conversions (cast required)
        double d2 = 123.98765;
        float f2 = (float) d2; // double -> float
        long l2 = (long) d2; // double -> long (fraction truncated)
        int i2 = (int) d2; // double -> int
        short s2 = (short) i2; // int -> short (may overflow)
        byte b2 = (byte) i2; // int -> byte (may overflow)
        char ch2 = (char) i2; // int -> char

        System.out.println("Narrowing: double->float->long->int->short->byte: " + b2);
        System.out.println("double " + d2 + " -> long: " + l2 + " -> int: " + i2 + " -> char: " + ch2);

        // 3) Boxing / Unboxing
        Integer boxedInt = i; // autoboxing int -> Integer
        int unboxedInt = boxedInt;// unboxing Integer -> int
        Double boxedDouble = d2; // autoboxing
        double unboxedDouble = boxedDouble;
        System.out.println("Boxing/unboxing: Integer=" + boxedInt + ", unboxed=" + unboxedInt + 
                           ", Double=" + boxedDouble + ", unboxed=" + unboxedDouble);

        // 4) String <-> primitive conversions
        String intStr = Integer.toString(i);
        String dblStr = String.valueOf(d2);
        String concatStr = "value: " + i; // primitive -> String via concatenation
        try {
            int parsedInt = Integer.parseInt("256");
            double parsedDouble = Double.parseDouble("3.14159");
            boolean parsedBool = Boolean.parseBoolean("true");
            System.out.println("Parsed: int=" + parsedInt + ", double=" + parsedDouble + ", boolean=" + parsedBool);
        } catch (NumberFormatException ex) {
            System.out.println("Parse error: " + ex.getMessage());
        }
        System.out.println("ToString examples: " + intStr + ", " + dblStr + ", concatenated: " + concatStr);

        // 5) char conversions
        char letter = 'Z';
        int letterToInt = (int) letter; // char -> int
        char intToChar = (char) 90; // int -> char
        String charToStr = Character.toString(letter);
        char strToChar = "Hello".charAt(1); // 'e'
        System.out.println("Char conversions: char='" + letter + "'->int=" + letterToInt + ", int 90->char='"
                + intToChar + "', char to String='" + charToStr + "', String to char='" + strToChar + "'");

        // 6) boolean conversions
        boolean boolVal = true;
        String boolToStr = Boolean.toString(boolVal);
        boolean parsed = Boolean.parseBoolean("false"); // returns false for any non-"true" ignoring case
        System.out.println("Boolean -> String: " + boolToStr + ", parsed: " + parsed);
    }
}
