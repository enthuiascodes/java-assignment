import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {
        // Create a List
        ArrayList<String> list = new ArrayList<>();
        
        // Add elements to the List
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Apple");  // Duplicate element is allowed
        
        // Print the List
        System.out.println("List: " + list);
        
        // Get an element by index
        System.out.println("Element at index 1: " + list.get(1));
        
        // Remove an element by index
        list.remove(2);  // Removes "Orange"
        System.out.println("List after removing element at index 2: " + list);
        
        // Size of the List
        System.out.println("Size of List: " + list.size());
    }
}


