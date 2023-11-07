package ArrayList;
import java.io.FileWriter;
import java.io.IOException;

public class AppendToFileExample {
    public static void main(String[] args) {
        String data = "This data will be appended to the file.";

        try {
            FileWriter fileWriter = new FileWriter("myfile.txt",true); // The second parameter 'true' enables append mode
            fileWriter.write(data);
            fileWriter.close();
            System.out.println("Data appended to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



