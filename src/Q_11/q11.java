package Q_11;

import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the your full name:-");
        String name =scanner.nextLine();

        String[] parts = name.split(" ");
        if (parts.length == 3) {
            System.out.println(parts[2] + ", " + parts[0] + " " + parts[1].charAt(0) + ".");
        } else {
            System.out.println("Invalid Input");
        }
    }
}
