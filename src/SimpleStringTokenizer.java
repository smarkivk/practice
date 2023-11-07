import java.util.StringTokenizer;

public class SimpleStringTokenizer {

    public static void main(String[] args) {

        String sentence = "This is a simple example of StringTokenizer usage.";

        StringTokenizer tokenizer = new StringTokenizer(sentence);

        System.out.println("Number of tokens: " + tokenizer.countTokens());

        //while (tokenizer.hasMoreTokens()) {
            //String token = tokenizer.nextToken();
            //System.out.println(token);
        }
    }
//}