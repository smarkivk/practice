package course;

import java.util.StringTokenizer;
//used to differentiate one by one
public class StringTokenizerApp {

    public static void main(String[] args) {

        String starWarsQuote = "May,the,force,be,with,you!";

        System.out.println("We are using StringTokenizer here: ");
        StringTokenizer stringTokenizer = new StringTokenizer(starWarsQuote, ",");//delimiter that separates the tokens.
        System.out.println("Number of tokens: " + stringTokenizer.countTokens());//countTokens ok
        while (stringTokenizer.hasMoreTokens()) {//hasMoreTokens
            System.out.println(stringTokenizer.nextToken());//nextToken
        }

        //System.out.println("We are using String's split function here: ");
        //String[] starWarsQuoteWords = starWarsQuote.split(",", 3);//split
        //System.out.println("Number of elements: " + starWarsQuoteWords.length);
        //for (String starWarsQuoteWord : starWarsQuoteWords ) {
          //  System.out.println(starWarsQuoteWord);
        }
    }

//}
