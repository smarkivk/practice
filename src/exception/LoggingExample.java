package exception;

import java.util.logging.Logger;

public class LoggingExample {
    private static final Logger LOGGER = Logger.getLogger(LoggingExample.class.getName());

    public static void main(String[] args) {
        try {int n=3/0;
            // code that may throw an exception
        } catch (Exception e) {
            //LOGGER.severe("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

