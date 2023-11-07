package loop;

public class BreakContinueExample {
    public static void main(String[] args) {
        // Example using break
        System.out.println("Example using break:");
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                System.out.println("Breaking at " + i);
                break;  // Exit the loop when i is 6
            }
            System.out.println("Iteration " + i);
        }

        // Example using continue
        System.out.println("\nExample using continue:");
        for (int i = 1; i <= 10; i++) {
            if (i == 4 || i == 7) {//OR
                System.out.println("Skipping iteration " + i);
                continue;  // Skip the rest of the loop body for these iterations
            }
            System.out.println("Iteration " + i);
        }
    }
}

