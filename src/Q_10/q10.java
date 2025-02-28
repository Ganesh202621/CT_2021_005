package Q_10;

import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Odd Length Word: ");
        String word = scanner.nextLine();

        if (word.length() % 2 == 1) {
            int middle = word.length() / 2;
            System.out.println(word.charAt(middle));
        } else {
            System.out.println("The word is not odd-length.");
        }
    }
}
