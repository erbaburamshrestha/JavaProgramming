public class Operators {

    public static void main(String[] args) {
        // Arithmetic
        int a = 10, b = 3;
        System.out.println("a+b=" + (a + b));
        System.out.println("a-b=" + (a - b));
        System.out.println("a*b=" + (a * b));
        System.out.println("a/b=" + (a / b));
        System.out.println("a%b=" + (a % b));
        System.out.println("String concatenation: " + "val=" + a);

        // Unary: + - ++ -- ! ~
        int x = 5;
        System.out.println("++x=" + (++x));
        x = 5;
        System.out.println("x++=" + (x++));
        System.out.println("after x++: " + x);
        System.out.println("negation -a=" + (-a));
        boolean flag = false;
        System.out.println("!flag=" + (!flag));
        System.out.println("bitwise not ~a=" + (~a));

        // Relational: == != > < >= <=
        System.out.println("a==b? " + (a == b));
        System.out.println("a!=b? " + (a != b));
        System.out.println("a>b? " + (a > b));
        System.out.println("a<b? " + (a < b));
        System.out.println("a>=b? " + (a >= b));
        System.out.println("a<=b? " + (a <= b));

        // Logical: && || ! and boolean bitwise & | ^
        boolean p = true, q = false;
        System.out.println("p&&q=" + (p && q));
        System.out.println("p||q=" + (p || q));
        System.out.println("p & q (non-short-circuit)=" + (p & q));
        System.out.println("p | q (non-short-circuit)=" + (p | q));
        System.out.println("p ^ q (xor)=" + (p ^ q));

        // Bitwise on integers: & | ^
        int m = 0b1010, n = 0b1100;
        System.out.println("m & n = " + (m & n));
        System.out.println("m | n = " + (m | n));
        System.out.println("m ^ n = " + (m ^ n));

        // Shift operators: << >> >>>
        int s = 1;
        System.out.println("s<<2 = " + (s << 2));    // 4
        System.out.println("s>>1 = " + (s >> 1));    // 0
        System.out.println("-1 >>> 1 = " + ((-1) >>> 1)); // logical right shift

        // Assignment and compound assignment
        int ca = 7;
        ca += 3; // ca = ca + 3
        System.out.println("ca after +=3: " + ca);
        ca -= 2;
        System.out.println("ca after -=2: " + ca);
        ca *= 2;
        System.out.println("ca after *=2: " + ca);
        ca /= 5;
        System.out.println("ca after /=5: " + ca);
        ca %= 3;
        System.out.println("ca after %=3: " + ca);

        // Compound bitwise/shift assignments
        int cb = 0b0011;
        cb &= 0b0101; System.out.println("cb after &= : " + cb);
        cb |= 0b1000; System.out.println("cb after |= : " + cb);
        cb ^= 0b0100; System.out.println("cb after ^= : " + cb);
        cb <<= 1;     System.out.println("cb after <<= : " + cb);
        cb >>= 2;     System.out.println("cb after >>= : " + cb);
        cb >>>= 1;    System.out.println("cb after >>>=: " + cb);

        // Ternary ?: 
        int max = (a > b) ? a : b;
        System.out.println("max = " + max);
    }
}
