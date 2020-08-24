package javastrings;
    import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date {

    public static void main(String[] args) {
        String s = "2017-07-25";
        LocalDate date = LocalDate.parse(s, DateTimeFormatter.ISO_DATE);

        System.out.println(date);
    }
}
