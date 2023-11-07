package filehandling;//108
//todo

import java.io.*;

public class SimpleFileHandling {

    public static void main(String[] args) {
        // Define the file name
        String fileName = "sample.txt";

        // Write data to the file
        writeToFile(fileName, "Hello, this is a simple file handling example!");

        // Read data from the file
        String content = readFromFile(fileName);
        System.out.println("Contents of the file:");
        System.out.println(content);
    }

    // Method to write data to a file
    public static void writeToFile(String fileName, String data) {
        try {
            // Create a FileWriter
            FileWriter fileWriter = new FileWriter(fileName);

            // Write data to the file
            fileWriter.write(data);

            // Close the FileWriter
            fileWriter.close();

            System.out.println("Data written to the file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    // Method to read data from a file
    public static String readFromFile(String fileName) {
        StringBuilder content = new StringBuilder();
        try {
            // Create a FileReader
            FileReader fileReader = new FileReader(fileName);

            int character;
            // Read characters from the file
            while ((character = fileReader.read()) != -1) {
                content.append((char) character);
            }

            // Close the FileReader
            fileReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        return content.toString();
    }
}
