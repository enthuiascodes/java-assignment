import java.util.HashSet;

public class SetExample {
    public static void main(String[] args) {
        // Create a Set
        HashSet<String> set = new HashSet<>();
        
        // Add elements to the Set
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple");  // Duplicate element, won't be added
        
        // Print the Set
        System.out.println("Set: " + set);
        
        // Check if an element exists in the Set
        if (set.contains("Banana")) {
            System.out.println("Banana is in the Set.");
        }
        
        // Remove an element
        set.remove("Orange");
        System.out.println("Set after removing Orange: " + set);
    }
}
