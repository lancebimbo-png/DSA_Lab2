public class LibraryFinder {

    public static int findFirst(String[] items, String target) {
        for (int i = 0; i < items.length; i++) {
            System.out.println("Inspecting index " + i + ": " + items[i]);
            if (items[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static int countMatches(String[] items, String target) {
        int count = 0;
        for (int i = 0; i < items.length; i++) {
            System.out.println("Inspecting index " + i + ": " + items[i]);
            if (items[i].equals(target)) {
                count = count + 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] library = { "C", "Java", "DSA", "Java", "SQL" };

        System.out.println("===== TEST 1: Target at first position (C) =====");
        testFindFirst(library, "C");
        testCountMatches(library, "C");

        System.out.println("\n===== TEST 2: Target at last position (SQL) =====");
        testFindFirst(library, "SQL");
        testCountMatches(library, "SQL");

        System.out.println("\n===== TEST 3: Target missing (Python) =====");
        testFindFirst(library, "Python");
        testCountMatches(library, "Python");

        System.out.println("\n===== TEST 4: Repeated titles, adjacent duplicates (Java) =====");
        String[] withAdjacent = { "C", "Java", "Java", "DSA", "SQL" };
        testFindFirst(withAdjacent, "Java");
        testCountMatches(withAdjacent, "Java");

        System.out.println("\n===== TEST 5: Manual trace for Java (original array) =====");
        testFindFirst(library, "Java");
        testCountMatches(library, "Java");

        System.out.println("\n===== TEST 6: Manual trace for Python (original array) =====");
        testFindFirst(library, "Python");
        testCountMatches(library, "Python");
    }

    public static void testFindFirst(String[] items, String target) {
        System.out.println("--- findFirst(\"" + target + "\") ---");
        int index = findFirst(items, target);
        if (index != -1) {
            System.out.println("Result: Found at index " + index);
        } else {
            System.out.println("Result: Not found (-1)");
        }
    }

    public static void testCountMatches(String[] items, String target) {
        System.out.println("--- countMatches(\"" + target + "\") ---");
        int count = countMatches(items, target);
        System.out.println("Result: " + count + " match(es)");
    }
}