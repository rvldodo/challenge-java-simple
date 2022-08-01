package findWord;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your phrase: ");
        String str = scanner.nextLine();
        System.out.print("Enter the number to find word by number: ");
        int n = scanner.nextInt();

        String[] words = str.split(" ");

        for(int i = 0; i < words.length; i++) {
            if(n - 1 == i) {
                System.out.println("The " + n + " word is '" + words[i] + "'");
            }
        }
    }
}
