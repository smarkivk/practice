package loop;

public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i >= 5) {
                System.out.println("Skipping iteration " + i);
                continue;  // Skip the rest of the loop body for this iteration
                //System.out.println("Hi");
            }
            System.out.println("Hi");
            System.out.println("Iteration " + i);
        }
    }
}

