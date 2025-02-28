package Q_09;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String:-");
        String input = scanner.nextLine();


        System.out.println(input.length());
        System.out.println(input.charAt(0));
        System.out.println(input.charAt(input.length() - 1));
    }
}
