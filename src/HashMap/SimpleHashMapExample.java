package HashMap;//2

import java.util.HashMap;
import java.util.Map;

public class SimpleHashMapExample {

    public static void main(String[] args) {
        // Create a HashMap to store name-age pairs
        Map<String, Integer> ages = new HashMap<>();

        // Add entries to the HashMap
        ages.put("Vikram", 23);//put
        ages.put("Vikram", 24);//latest value updated
        ages.put("Bob", 30);
        ages.put("Charlie", 28);
        ages.put("David", 22);
        ages.put("Abhinandan", 23);//how same ages stored

        ages.putIfAbsent("Vikram",23);
        System.out.println(ages);
        // Retrieve and print values from the HashMap
        System.out.println("Age of Alice: " + ages.get("Alice"));//get
        System.out.println("Age of Charlie: " + ages.get("Charlie"));

        // Check if a key exists in the HashMap
        String name = "Eve";
        if (ages.containsKey(name)) {//containsKey
            //   if (ages.containsKey("Eve")) {//containsKey
            System.out.println("Age of " + name + ": " + ages.get(name));
        } else {
            System.out.println(name + " not found in the HashMap.");
        }

        // Iterate through the HashMap entries
        System.out.println("HashMap entries:");
        for (Map.Entry<String, Integer> entry : ages.entrySet()) { // iterate
            String person = entry.getKey();
            int age = entry.getValue();
            System.out.println(person + " is " + age + " years old.");
        }

        // Remove an entry from the HashMap
        String removedName = "Bob";
        ages.remove(removedName);
        System.out.println(removedName + " removed from the HashMap.");

        // Check the size of the HashMap
        System.out.println("Size of the HashMap: " + ages.size());

        // Clear all entries from the HashMap
        ages.clear();
        System.out.println("HashMap cleared. Size: " + ages.size());
    }
}
