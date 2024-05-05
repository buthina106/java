
import java.util.StringTokenizer;

public class  Tokenizer {
    public static void main(String[] args) {
        String sentence = "ITI develops people and ITI house of developers and ITI for people";
        String wordToFind = "ITI";
        
        StringTokenizer tokenizer = new StringTokenizer(sentence, " ");
        int count = 0;
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            if (token.equals(wordToFind)) {
                count++;
            }
        }
        System.out.println("Tokenizer: " + count);
    }
}