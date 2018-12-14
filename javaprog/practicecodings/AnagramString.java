package practicecodings;

import java.util.Arrays;

public class AnagramString {

    public static void main(String[] args) {
        String input1 = "cat";
        String input2 = "act";
        //isAnagramA(input1, input2);
        System.out.println(isAnagram(input1, input2));

    }

    public static void isAnagramA(String input1, String input2) {
        //Remove all whitespace first
        String s1 = input1.replaceAll("\\s", "");

        String s2 = input2.replaceAll("\\s", "");

        boolean status = true;

        if (s1.length() != s2.length()) {
            status = false;
        } else {
            //Convert into character array

            char[] s1Array = s1.toLowerCase().toCharArray();

            char[] s2Array = s2.toLowerCase().toCharArray();

            //Sorting both character array
            Arrays.sort(s1Array);

            Arrays.sort(s2Array);

            //Check if both arrays are equal
            status = Arrays.equals(s1Array, s2Array);
        }
        if (status) {
            System.out.println(s1 + " and " + s2 + " are anagrams");
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams");
        }
    }

    public static boolean isAnagram(String word, String anagram) {
        boolean isAnagram = false;
        if (word != null && anagram != null && word.length() == anagram.length()) {
            char[] arr = word.toCharArray();
            StringBuilder temp = new StringBuilder(anagram);
            int wordLength = word.length();
            for (char ch : arr) {
                int index = temp.indexOf("" + ch);
                if (index != -1) {
                    temp.deleteCharAt(index);
                }
            }
            isAnagram = temp.toString().isEmpty();
        }
        return isAnagram;
    }
}
