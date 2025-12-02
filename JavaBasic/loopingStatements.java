import java.util.*;

public class loopingStatements {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        List<String> names = Arrays.asList("Alice", "Bob", "Carol");
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("apples", 3);
        map.put("bananas", 5);

        // 1) classic for loop (index-based)
        System.out.println("classic for:");
        for (int i = 0; i < nums.length; i++) {
            System.out.println("i=" + i + " value=" + nums[i]);
        }

        // 2) enhanced for (for-each) for arrays/collections
        System.out.println("\nenhanced for (for-each) on array:");
        for (int n : nums) {
            System.out.println(n);
        }

        System.out.println("\nenhanced for (for-each) on list:");
        for (String s : names) {
            System.out.println(s);
        }

        // 3) while loop
        System.out.println("\nwhile loop:");
        int w = 0;
        while (w < nums.length) {
            System.out.println(nums[w]);
            w++;
        }

        // 4) do-while loop
        System.out.println("\ndo-while loop:");
        int d = 0;
        do {
            System.out.println(nums[d]);
            d++;
        } while (d < nums.length);

        // 5) Iterator with while
        System.out.println("\nIterator with while:");
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 6) forEach with lambda (Collection.forEach) — iteration via functional style
        System.out.println("\nCollection.forEach (lambda):");
        names.forEach(System.out::println);

        // 7) iterate Map entries using for-each
        System.out.println("\nMap entry iteration:");
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

        // 8) labeled loops with break and continue
        System.out.println("\nlabeled loops with break:");
        outer:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.printf("i=%d j=%d%n", i, j);
                if (i * j == 4) {
                    System.out.println("breaking out of outer loop");
                    break outer; // breaks both loops
                }
            }
        }

        System.out.println("\nlabeled loops with continue:");
        outer2:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (j == 2) {
                    continue outer2; // continues outer loop
                }
                System.out.printf("i=%d j=%d%n", i, j);
            }
        }

        // 9) nested loops example
        System.out.println("\nnested loops (multiplication table):");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print((i * j) + " ");
            }
            System.out.println();
        }

        // 10) infinite loop (commented out) — to show form; don't run it as-is
        // for (;; ) { /* infinite */ }
        // while (true) { /* infinite */ }

        // Example of an infinite loop that exits with a break:
        System.out.println("\ncontrolled infinite loop (break after one iteration):");
        int counter = 0;
        while (true) {
            System.out.println("looping once, counter=" + counter);
            counter++;
            break;
        }
    }
}
