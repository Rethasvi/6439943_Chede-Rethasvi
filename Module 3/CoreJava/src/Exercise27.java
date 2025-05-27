import java.util.*;

public class Exercise27 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("John", "Alice", "Bob", "Diana"));
        Collections.sort(names, (a, b) -> a.compareToIgnoreCase(b));
        System.out.println("Sorted names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}