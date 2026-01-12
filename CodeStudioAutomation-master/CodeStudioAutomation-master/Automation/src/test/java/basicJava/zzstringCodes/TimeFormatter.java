package basicJava.zzstringCodes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeFormatter {

    public static void main(String[] args) {
        LocalDateTime date=LocalDateTime.now();

        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd_MM_yy hh:mm:ss");

        System.out.println(date.format(formatter));


    }

}
