package Q_05;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q5 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy");
        System.out.println(today.format(formatter));
    }
}
