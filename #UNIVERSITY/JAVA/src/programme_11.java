import java.util.ArrayList;
public class programme_11{
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        // Display all elements
        System.out.println("Fruits List: " + fruits);

        // Access an element by index
        System.out.println("First fruit: " + fruits.get(0));

        // Update an element
        fruits.set(2, "Grapes"); // replaces "Mango" with "Grapes"
        System.out.println("Updated Fruits List: " + fruits);

        // Remove an element
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        // Loop through the list
        System.out.println("All Fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Get the size of the list
        System.out.println("Total fruits: " + fruits.size());
    }
}