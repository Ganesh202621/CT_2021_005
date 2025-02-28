package Q_07;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Q7 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Date date = new Date();
        SimpleDateFormat simpleDateFormat= new SimpleDateFormat("HH:mm:ss a");

        String title = simpleDateFormat.format(date);

        frame.setTitle(title);
        frame.setSize(600,300);
        frame.setVisible(true);
    }
}