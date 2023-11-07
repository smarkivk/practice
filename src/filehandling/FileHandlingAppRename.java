package filehandling;// creating no file having error
//java.io.IOException: The system cannot find the path specified
  //      at java.base/java.io.WinNTFileSystem.createFileExclusively(Native Method)
    //    at java.base/java.io.File.createNewFile(File.java:1043)
      //  at filehandling.FileHandlingAppRename.main(FileHandlingAppRename.java:13)

import java.io.File;
import java.io.IOException;

public class FileHandlingAppRename {

    public static void main(String[] args) {
        String FILE_HANDLING_DIRECTORY = "src\\com\\advanced\\filehandling\\";
        File famousQuotesFile = new File(FILE_HANDLING_DIRECTORY + "famousQuotes.txt");

        try {
            if (famousQuotesFile.createNewFile()) {
                System.out.println("The file is created.");
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        File famousPersonQuotesFile = new File(FILE_HANDLING_DIRECTORY + "famousPersonQuotes.txt");
        if (famousQuotesFile.renameTo(famousPersonQuotesFile)) {
            System.out.println("The file is renamed.");
        }

        if (famousPersonQuotesFile.delete()) {
            System.out.println("The file is deleted.");
        }
    }
}
