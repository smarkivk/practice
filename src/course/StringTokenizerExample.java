package course;

import java.util.StringTokenizer;

public class StringTokenizerExample {

    public static void main(String[] args) {
        String text = "Hello World Java";
        StringTokenizer tokenizer = new StringTokenizer(text, " ");//delimiter is used here

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println(token);
        }
    }
}




