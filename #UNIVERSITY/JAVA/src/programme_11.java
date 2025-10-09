import java.util.ArrayList;
public class programme_11{
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        System.out.println("Fruits List: " + fruits);

        System.out.println("First fruit: " + fruits.get(0));

        fruits.set(2, "Grapes");
        System.out.println("Updated Fruits List: " + fruits);

        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        System.out.println("All Fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("Total fruits: " + fruits.size());
    }
}