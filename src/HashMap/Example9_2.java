package HashMap;
/*
// Import the HashMap class
import java.util.HashMap;

public class Example9_2 {
    public static void main(String[] args) {

        // Create a HashMap object called people
        HashMap<String, Integer> people = new HashMap<String, Integer>();


        // Add keys and values (Name, Age)
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);

        for (String i : people.keySet()) {
            System.out.println("key: " + i + " value: " + people.get(i));
        }
    }
}*/
import java.util.*;

public class Example9_2  {
    public static int[] searchRange(int[] nums, int target) {
        int firstOccurrence = findFirstOccurrence(nums, target);
        int lastOccurrence = findLastOccurrence(nums, target);

        return new int[]{firstOccurrence, lastOccurrence};
    }

    private static int findFirstOccurrence(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int firstOccurrence = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                firstOccurrence = mid;
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return firstOccurrence;
    }

    private static int findLastOccurrence(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int lastOccurrence = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                lastOccurrence = mid;
                left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return lastOccurrence;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int t = 0; t < T; t++) {
            int n = scanner.nextInt();
            int key = scanner.nextInt();
            int[] nums = new int[n];

            for (int i = 0; i < n; i++) {
                nums[i] = scanner.nextInt();
            }

            int[] result = searchRange(nums, key);

            System.out.println(result[0] + " " + result[1]);
        }
    }
}
