package aula101;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

        Date dateNow = new Date();
        Date date = new Date(System.currentTimeMillis());
        Date date1 = sdf1.parse("25/06/2020");
        Date date2 = sdf2.parse("18/12/2020 15:45:05");
        Date date3 = new Date(0L);
        Date date4 = new Date(1000L * 60L * 60L * 5L);
        Date date5 = Date.from(Instant.parse("2020-06-25T15:42:07Z"));

        System.out.println("--------------------------------");
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(dateNow);
        System.out.println(date);
        System.out.println(date3);
        System.out.println(date4);
        System.out.println(date5);

        System.out.println("--------------------------------");
        System.out.println(sdf2.format(date1));
        System.out.println(sdf2.format(date2));
        System.out.println(sdf2.format(dateNow));
        System.out.println(sdf2.format(date));
        System.out.println(sdf2.format(date3));
        System.out.println(sdf2.format(date4));
        System.out.println(sdf2.format(date5));

        System.out.println("--------------------------------");
        System.out.println(sdf3.format(date1));
        System.out.println(sdf3.format(date2));
        System.out.println(sdf3.format(dateNow));
        System.out.println(sdf3.format(date));
        System.out.println(sdf3.format(date3));
        System.out.println(sdf3.format(date4));
        System.out.println(sdf3.format(date5));
    }
}
