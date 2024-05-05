interface StringComparator {
    boolean compare(String s1, String s2);
}

class StringBetter {
    public static void main(String[] args) {
        String string1 = "hello";
        String string2 = "buthinakhaled";
        
        String longer = betterString(string1, string2, (s1, s2) -> s1.length() > s2.length());
        System.out.println("Longer string: " + longer);

        String first = betterString(string1, string2, (s1, s2) -> true);
        System.out.println("First string: " + first);
    }

    public static String betterString(String s1, String s2, StringComparator comparator) {
        if (comparator.compare(s1, s2)) {
            return s1;
        } else {
            return s2;
        }
    }
}