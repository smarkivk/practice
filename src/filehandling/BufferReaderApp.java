package filehandling;//8
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderApp {
    public static void main(String[] args) {



        String HAMLET_PART_FILE_PATH = "src\\com\\advanced\\filehandling\\Hamlet.txt";

            //char[] firstHundredCharacters = new char[100];
            try (FileReader hamletReader = new FileReader(HAMLET_PART_FILE_PATH)) {//FileReader used here
                BufferedReader hamletBufferReader = new BufferedReader(hamletReader);
                StringBuilder stringBuilder = new StringBuilder();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}
