package ArrayList;

import java.util.ArrayList;

public class ForLoopExample {

    public static void main(String[] args) {
        ArrayList<String> urgentTasks = new ArrayList<>();
        urgentTasks.add("Buy groceries");
        urgentTasks.add("Pay bills");

        // Using a normal for loop to iterate over the elements
        for (int i = 0; i < urgentTasks.size(); i++) {
            String task = urgentTasks.get(i);
            System.out.println("Task: " + task);
        }
    }
}
/*//using enhanced for loop

import java.util.ArrayList;

public class ForLoopExample {

    public static void main(String[] args) {
        ArrayList<String> urgentTasks = new ArrayList<>();
        urgentTasks.add("Buy groceries");
        urgentTasks.add("Pay bills");

        // Using a normal for loop to iterate over the elements
        for (int i = 0; i < urgentTasks.size(); i++) {
            String task = urgentTasks.get(i);
            System.out.println("Task: " + task);
        }
    }
}*/





