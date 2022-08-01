package wordReversal;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the phrase to reverse: ");
        String str = scanner.nextLine();
        String strLower = str.toLowerCase();

        String newStr = "";
        String[] words = strLower.split(" ");
        ArrayList<String> newWords = new ArrayList<>();
        for(int i = words.length - 1; i >= 0; i--) {
            char firstWord = words[words.length - 1].toUpperCase().charAt(0);
            newWords.add(words[i]);
        }

        for (String word : newWords) {
            newStr += word + " ";
        }

        System.out.println("The reverse phrase: " + newStr);
    }
}
