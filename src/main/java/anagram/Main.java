package anagram;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the 1st word: ");
        String word1 = scanner.nextLine();
        System.out.print("Enter the 2nd word: ");
        String word2 = scanner.nextLine();
        */

        String word1 = "silent";
        String word2 = "listen";

        String[] words = {"tar", "rat", "team", "meat"};

        // word anagram
        if(checkStatus(word1, word2)) {
            System.out.println(word1 + " and " + word2 + " are anagram");
        } else {
            System.out.println(word1 + " and " + word2 + " are not anagram");
        }

        //array anagram
        if(checkStatusArray(words)) {
            System.out.println("anagram");
        } else {
            System.out.println("not anagram");
        }
    }

    public static boolean checkStatus(String word1, String word2) {
        boolean status;
        
        if(word1.length() != word2.length()) {
            status = false;
        } else {
            char[] word1Arr = word1.toLowerCase().toCharArray();
            char[] word2Arr = word1.toLowerCase().toCharArray();
            Arrays.sort(word1Arr);
            Arrays.sort(word2Arr);
            status = Arrays.equals(word1Arr, word2Arr);
        }
        return status;
    }

    public static boolean checkStatusArray(String[] words) {
        boolean status = true;

        for (int i = 0; i < words.length; i++) {
            if(words[i].length() == words[i+1].length()) {
                char[] word1Array = words[i].toLowerCase().toCharArray();
                char[] word2Array = words[i+1].toLowerCase().toCharArray();
                Arrays.sort(word1Array);
                Arrays.sort(word2Array);
                status = Arrays.equals(word1Array, word2Array);
            } else {
                status = false;
            }
        }

        return status;
    }
}
