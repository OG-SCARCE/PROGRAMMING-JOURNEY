import java.util.*;

public class programme_10 {
    public static void main(String[] args) {
        Map<Integer, String> books = new HashMap<>();

        books.put(101, "The Alchemist");
        books.put(102, "Rich Dad Poor Dad");
        books.put(103, "Atomic Habits");

        System.out.println("All Books: " + books);

        int id = 102;
        if (books.containsKey(id)) {
            System.out.println("Book with ID " + id + ": " + books.get(id));
        }

        books.remove(101);
        System.out.println("After removing ID 101: " + books);

        for (Map.Entry<Integer, String> entry : books.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " -> Title: " + entry.getValue());
        }
    }
}
