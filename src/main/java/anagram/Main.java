package anagram;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the 1st word: ");
        String word1 = scanner.nextLine();
        System.out.print("Enter the 2nd word: ");
        String word2 = scanner.nextLine();

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

        if(status) {
            System.out.println(word1 + " and " + word2 + " are anagram");
        } else {
            System.out.println(word1 + " and " + word2 + " are not anagram");
        }
    }
}
