public class Word{
    public static void main(String[] args) {
        String sentence = "ITI develops people and ITI house of developers and ITI for people";
        String wordToFind = "ITI";

        String[] words = sentence.split(" ");
        int count1 = 0;
        for (String word : words) {
            if (word.equals(wordToFind)) {
                count1++;
            }
        }
        System.out.println("Method one " + count1);

    
        int index = 0;
        int count2 = 0;
        while (index != -1) {
            index = sentence.indexOf(wordToFind, index);
            if (index != -1) {
                count2++;
                index += wordToFind.length();
            }
        }
        System.out.println("Method Two: " + count2);
    }
}
