package LinkedList;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Create a new linked list
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the linked list
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Display the linked list
        System.out.println("Linked List: " + linkedList);

        // Access elements in the linked list
        String firstElement = linkedList.getFirst();
        String lastElement = linkedList.getLast();
        System.out.println("First Element: " + firstElement);
        System.out.println("Last Element: " + lastElement);
    }
}
