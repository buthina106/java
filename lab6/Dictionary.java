import java.util.*;

public class Dictionary {

    public static void main(String[] args) {
        Map<Character, TreeSet<String>> myDictionary = new TreeMap<>();

        TreeSet<String> words = new TreeSet<>(Arrays.asList(
            "Agree", "America", "Angry", "Apple", "Ball", "Banana", "Beautiful",
            "Boat", "Careful", "Cat", "Cell", "Chair", "Dance", "Danger", "Deep",
            "Dress", "Eat", "Eggs", "Energy", "Eye", "Face", "Fat", "Flower", "Food",
            "Gold", "Green", "Group", "Grow", "Hat", "Help", "History", "Home", "Ice",
            "India", "Internet", "Island", "Jar", "Job", "Join", "Just", "Key", "Kill",
            "King", "Know", "Lady", "Lack", "Learn", "Look", "Milk", "Money", "Morning",
            "Mountain", "Nation", "Network", "Notebook", "Nurse", "Online", "Opinion",
            "Outside", "Oxygen", "Page", "Park", "Pen", "Poor", "Question", "Quickly",
            "Quiet", "Quite", "Rain", "Read", "Red", "Room", "Schedule", "School", "Sea",
            "Sick", "Time", "Train", "Travel", "Trip", "Uncle", "Understand", "Up", "Upset",
            "Vally", "Voice", "Vote", "Water", "Wet", "Wind", "Wood", "Xenial",
            "Xenolalia", "Xoanon", "Xper", "Yard", "Year", "Young", "Yourself", "Zebra", "Zoo",
            "Zero", "Zip"
        ));

        for (String word : words) {
            char key = Character.toUpperCase(word.charAt(0));
            myDictionary.computeIfAbsent(key, k -> new TreeSet<>()).add(word);
        }

        if (args.length == 1) {
            search(args[0], myDictionary);
        } else {
            displayAll(myDictionary);
        }
    }

    public static void displayAll(Map<Character, TreeSet<String>> dictionary) {
        dictionary.forEach((key, value) -> System.out.println("Key " + key + " is: " + value));
    }

    public static void search(String letter, Map<Character, TreeSet<String>> dictionary) {
        if (letter.length() != 1) {
            System.out.println("Please enter only one letter.");
            return;
        }

        char searchLetter = Character.toUpperCase(letter.charAt(0));
        TreeSet<String> words = dictionary.get(searchLetter);

        if (words == null) {
            System.out.println("No words found for letter " + searchLetter);
        } else {
            System.out.println("Words starting with letter " + searchLetter + ": " + words);
        }
    }
}