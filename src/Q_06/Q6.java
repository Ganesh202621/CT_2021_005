package Q_06;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the frame width:-");
        int width =scanner.nextInt();

        System.out.println("Enter the frame height:-");
        int height =scanner.nextInt();

         scanner.nextLine();
        System.out.println("Enter Title: ");
        String title = scanner.nextLine();

        JFrame frame = new JFrame(title);
          frame.setSize(width,height);
          frame.setVisible(true);

    }
}
