package filehandling;//7

import java.io.*;

public class FileReaderExample {

    public static void main(String[] args) {
        String fileName = "sample.txt";

        try {
            FileReader fileReader = new FileReader(fileName);
            int character;

            System.out.println("Contents of the file:");

            while ((character = fileReader.read()) != -1) {
                System.out.print((char) character);
            }

            fileReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

