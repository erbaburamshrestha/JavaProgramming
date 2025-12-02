package LAB1;

import java.util.Scanner;

public class SumNatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int sum = n * (n + 1) / 2;  // Mathematical formula

        System.out.println("Sum of first " + n + " natural numbers = " + sum);

        sc.close();
    }
}

